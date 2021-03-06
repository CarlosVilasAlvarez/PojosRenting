package pojos;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author a18pablobc
 */
public class Alquiler implements Serializable {
    
    private int codigo;
    private Date fechaInicio, fechaFin;
    private float precioTotal, descuento;
    private Coche coche;
    private Empresa empresa;
    private Particular particular;
    
    public Alquiler() {
    }
    
    public Alquiler(Date fechaInicio, Date fechaFin, Coche coche, float precioTotal, float descuento) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.coche = coche;
        this.precioTotal = precioTotal;
        this.descuento = descuento;
    }
    
    public int getCodigo() {
        return codigo;
    }
    
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public Date getFechaInicio() {
        return fechaInicio;
    }
    
    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
    
    public Date getFechaFin() {
        return fechaFin;
    }
    
    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }
    
    public float getPrecioTotal() {
        return precioTotal;
    }
    
    public void setPrecioTotal(float precioTotal) {
        this.precioTotal = precioTotal;
    }
    
    public float getDescuento() {
        return descuento;
    }
    
    public void setDescuento(float descuento) {
        this.descuento = descuento;
    }
    
    public Coche getCoche() {
        return coche;
    }
    
    public void setCoche(Coche coche) {
        this.coche = coche;
    }
    
    public Empresa getEmpresa() {
        return empresa;
    }
    
    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
        //empresa.setnAlquileres(empresa.getnAlquileres() + 1);
        //calculoPrecio();
    }
    
    public Particular getParticular() {
        return particular;
    }
    
    public void setParticular(Particular particular) {
        this.particular = particular;
        //calculoPrecio();
    }
    
    private void calculoPrecio() {
        this.precioTotal = coche.getPrecioDia() * calculoDuracion() * calculoDescuento();
    }
    
    public float calculoDescuento() {
        if (particular != null) {
            if (particular.getPuntos() == 15) {
                this.descuento = 0.1f;
            }
            
        } else if (empresa.getnAlquileres() > 100) {
            this.descuento = 0.1f;
        }
        return descuento;
    }

    public int calculoDuracion() {
        int duracion = (int) (this.fechaFin.getTime() - this.fechaInicio.getTime() / 86400000);
        return duracion;
    }
    
}
