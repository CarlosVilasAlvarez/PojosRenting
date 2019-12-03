package metodos;

import hibernate.NewHibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import pojos.Empresa;
import pojos.Particular;

/**
 *
 * @author pablo
 */
public class Modificar {
    public static void particulares(Particular particular) {
        
        try{
            NewHibernateUtil.getSession();
            Session sesion = NewHibernateUtil.getSession();

            sesion.beginTransaction();
            sesion.saveOrUpdate(particular);
            sesion.getTransaction().commit();
            sesion.close();
        }catch(HibernateException e){
            System.out.println(e);
        }
            
    }
    
    public static void empresas(Empresa empresa) {
        try{
            NewHibernateUtil.getSession();
            Session sesion = NewHibernateUtil.getSession();
            
            sesion.beginTransaction();
            sesion.saveOrUpdate(empresa);
            sesion.getTransaction().commit();
            sesion.close();
        }catch(HibernateException e) {
            
        }
    }
}