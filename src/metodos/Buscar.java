package metodos;

import hibernate.NewHibernateUtil;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import pojos.Alquiler;
import pojos.Cliente;
import pojos.Coche;
import pojos.Empresa;
import pojos.Particular;

public class Buscar {

    public static List<Cliente> particulares(String nombre, String dni, String telefono, String email, String puntos, String fechaNacimiento, String edad) throws ParseException {

        Session sesion = NewHibernateUtil.getSession();
        sesion.beginTransaction();
        List<Cliente> clientes;
        if (nombre.equalsIgnoreCase("") && dni.equalsIgnoreCase("") && telefono.equalsIgnoreCase("") && email.equalsIgnoreCase("") && puntos.equalsIgnoreCase("") && fechaNacimiento.equalsIgnoreCase("") && edad.equalsIgnoreCase("")) {
            //todos los campos estan vacios, por lo que no hay nada a buscar.
            sesion.close();
            return null;
        } else {
            //Creo un filtro para buscar por cada campo
            Criteria filtros = sesion.createCriteria(Particular.class);
            if (!nombre.equalsIgnoreCase("")) {
                Criterion nameCriteria = Restrictions.eq("nombre", nombre);
                filtros.add(nameCriteria);
            }
            if (!dni.equalsIgnoreCase("")) {
                Criterion nameCriteria = Restrictions.eq("dni", dni);
                filtros.add(nameCriteria);
            }
            if (!telefono.equalsIgnoreCase("")) {
                Criterion nameCriteria = Restrictions.eq("telefono", telefono);
                filtros.add(nameCriteria);
            }
            if (!email.equalsIgnoreCase("")) {
                Criterion nameCriteria = Restrictions.eq("email", email);
                filtros.add(nameCriteria);
            }
            if (!puntos.equalsIgnoreCase("")) {
                Criterion nameCriteria = Restrictions.eq("puntos", puntos);
                filtros.add(nameCriteria);
            }
            if (!fechaNacimiento.equalsIgnoreCase("")) {
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                Date fechaNacimientoDate = sdf.parse(fechaNacimiento);
                Criterion nameCriteria = Restrictions.eq("fechaNacimiento", fechaNacimientoDate);
                filtros.add(nameCriteria);
            }
            if (!edad.equalsIgnoreCase("")) {
                Criterion nameCriteria = Restrictions.eq("edad", edad);
                filtros.add(nameCriteria);
            }
            clientes = filtros.list();
        }
        sesion.getTransaction()
                .commit();
        sesion.close();
        return clientes;
    }

    public static List<Cliente> empresas(String nombre, String cif, String telefono, String email) {
        Session sesion = NewHibernateUtil.getSession();
        sesion.beginTransaction();
        List<Cliente> empresas;
        if (nombre.equalsIgnoreCase("") && cif.equalsIgnoreCase("") && telefono.equalsIgnoreCase("") && email.equalsIgnoreCase("")) {
            //todos los campos estan vacios, por lo que no hay nada a buscar.
            sesion.close();
            return null;
        } else {
            Criteria filtros = sesion.createCriteria(Empresa.class);
            if (!nombre.equalsIgnoreCase("")) {
                Criterion nameCriteria = Restrictions.eq("nombre", nombre);
                filtros.add(nameCriteria);
            }
            if (!cif.equalsIgnoreCase("")) {
                Criterion nameCriteria = Restrictions.eq("cif", cif);
                filtros.add(nameCriteria);
            }
            if (!telefono.equalsIgnoreCase("")) {
                Criterion nameCriteria = Restrictions.eq("telefono", telefono);
                filtros.add(nameCriteria);
            }
            if (!email.equalsIgnoreCase("")) {
                Criterion nameCriteria = Restrictions.eq("email", email);
                filtros.add(nameCriteria);
            }
            empresas = filtros.list();
        }
        sesion.getTransaction()
                .commit();
        sesion.close();
        return empresas;
    }
    
    public static ArrayList<Cliente> clientes(String nombre, String cifDni, String telefono, String email) {
        Session sesion = NewHibernateUtil.getSession();
        sesion.beginTransaction();
        List<Empresa> empresas;
        List<Particular> particulares;
        ArrayList<Cliente> clientes = new ArrayList();
        if (nombre.equalsIgnoreCase("") && cifDni.equalsIgnoreCase("") && telefono.equalsIgnoreCase("") && email.equalsIgnoreCase("")) {
            //todos los campos estan vacios, por lo que no hay nada a buscar.
            sesion.close();
            return null;
        } else {
            Criteria filtrosEmpresa = sesion.createCriteria(Empresa.class);
            Criteria filtrosParticular = sesion.createCriteria(Particular.class);
            if (!nombre.equalsIgnoreCase("")) {
                Criterion nameCriteria = Restrictions.eq("nombre", nombre);
                filtrosEmpresa.add(nameCriteria);
                filtrosParticular.add(nameCriteria);
            }
            if (!cifDni.equalsIgnoreCase("")) {
                Criterion nameCriteria = Restrictions.eq("cif", cifDni);
                Criterion nameCriteria2 = Restrictions.eq("dni", cifDni);
                filtrosEmpresa.add(nameCriteria);
                filtrosParticular.add(nameCriteria2);
            }
            if (!telefono.equalsIgnoreCase("")) {
                Criterion nameCriteria = Restrictions.eq("telefono", telefono);
                filtrosEmpresa.add(nameCriteria);
                filtrosParticular.add(nameCriteria);
            }
            if (!email.equalsIgnoreCase("")) {
                Criterion nameCriteria = Restrictions.eq("email", email);
                filtrosEmpresa.add(nameCriteria);
                filtrosParticular.add(nameCriteria);
            }
            empresas = filtrosEmpresa.list();
            particulares = filtrosParticular.list();
            if(empresas != null){
                for(Empresa empresa : empresas){
                    clientes.add(((Cliente)empresa));
                }
            }
            if(particulares != null){
                for(Particular particular : particulares){
                    clientes.add(((Cliente)particular));
                }
            }
            
        }
        sesion.getTransaction().commit();
        sesion.close();
        return clientes;
    }

    public static List<Coche> coches(String matricula, String modelo, String estado, String marca, String fechaPM, String anhos, String precio){
        Session sesion = NewHibernateUtil.getSession();
        sesion.beginTransaction();
        List<Coche> coches;
        if (matricula.equalsIgnoreCase("") && modelo.equalsIgnoreCase("") && estado.equalsIgnoreCase("") && marca.equalsIgnoreCase("") && fechaPM.equalsIgnoreCase("") && anhos.equalsIgnoreCase("") && precio.equalsIgnoreCase("")) {
            //todos los campos estan vacios, por lo que no hay nada a buscar.
            sesion.close();
            return null;
        } else {
            Criteria filtros = sesion.createCriteria(Coche.class);
            if (!matricula.equalsIgnoreCase("")) {
                Criterion nameCriteria = Restrictions.eq("matricula", matricula);
                filtros.add(nameCriteria);
            }
            if (!modelo.equalsIgnoreCase("")) {
                Criterion nameCriteria = Restrictions.eq("modelo", modelo);
                filtros.add(nameCriteria);
            }
            if (!estado.equalsIgnoreCase("")) {
                Criterion nameCriteria = Restrictions.eq("estado", estado);
                filtros.add(nameCriteria);
            }
            if (!marca.equalsIgnoreCase("")) {
                Criterion nameCriteria = Restrictions.eq("marca", marca);
                filtros.add(nameCriteria);
            }
            if (!fechaPM.equalsIgnoreCase("")) {
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                Date fecha = null;
                try {
                    fecha = sdf.parse(fechaPM);
                } catch (ParseException ex) {
                    System.out.println(ex);
                }
                Criterion nameCriteria = Restrictions.eq("fechaM", fecha);
                filtros.add(nameCriteria);
            }
            if(!anhos.equalsIgnoreCase("")){
                int anhosInt;
                anhosInt = Integer.parseInt(anhos);
                Criterion nameCriteria = Restrictions.eq("anhos", anhosInt);
                filtros.add(nameCriteria);
            }
            if(!precio.equalsIgnoreCase("")){
                float precioFloat;
                precioFloat = Float.parseFloat(precio);
                Criterion nameCriteria = Restrictions.eq("precioDia", precioFloat);
                filtros.add(nameCriteria);    
            }
            coches = filtros.list();
        }
        sesion.getTransaction()
                .commit();
        sesion.close();
        return coches;
    }
    
    public static List<Alquiler> alquileres(String precioTotal, String fechaInicio, String fechaFin, Coche coche, Particular particular, Empresa empresa) {
        Session sesion = NewHibernateUtil.getSession();
        sesion.beginTransaction();
        List<Alquiler> alquileres;
        if (precioTotal.equalsIgnoreCase("") && fechaInicio.equalsIgnoreCase("") && fechaFin.equalsIgnoreCase("") && coche == null && particular == null && empresa == null) {
            //todos los campos estan vacios, por lo que no hay nada a buscar.
            sesion.close();
            return null;
        }else {
            Criteria filtros = sesion.createCriteria(Alquiler.class);
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            if (!precioTotal.equalsIgnoreCase("")) {
                float precioTotalFloat;
                precioTotalFloat = Float.parseFloat(precioTotal);
                Criterion nameCriteria = Restrictions.eq("precioTotal", precioTotalFloat);
                filtros.add(nameCriteria);
            }
            if (!fechaInicio.equalsIgnoreCase("")) {
                Date fechaInicioDate = null;
                try {
                    fechaInicioDate = sdf.parse(fechaInicio);
                } catch (ParseException ex) {
                    System.out.println(ex);
                }
                Criterion nameCriteria = Restrictions.eq("fechaInicio", fechaInicioDate);
                filtros.add(nameCriteria);
            }
            if (!fechaFin.equalsIgnoreCase("")) {
                Date fechaFinDate = null;
                try {
                    fechaFinDate = sdf.parse(fechaFin);
                } catch (ParseException ex) {
                    System.out.println(ex);
                }
                Criterion nameCriteria = Restrictions.eq("fechaFin", fechaFinDate);
                filtros.add(nameCriteria);
            }
            if (coche != null) {
                Criterion nameCriteria = Restrictions.eq("coche", coche);
                filtros.add(nameCriteria);
            }
            if(particular != null){
                Criterion nameCriteria = Restrictions.eq("particular", particular);
                filtros.add(nameCriteria);
            }
            if(empresa != null){
                Criterion nameCriteria = Restrictions.eq("empresa", empresa);
                filtros.add(nameCriteria);
            }
            alquileres = filtros.list();
        }
        sesion.getTransaction()
                .commit();
        sesion.close();
        return alquileres;
    }

}
