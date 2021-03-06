package pojos;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author a18pablobc
 */
public class Reserva implements Serializable {

    private int codigo;
    private Date fechaInicio;
    private Date fechaFin;
    private Cliente cliente;
    private Coche coche;

    public Reserva() {
    }

    public Reserva(int codigo, Date fechaInicio, Date fechaFin) {
        this.codigo = codigo;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
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

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Coche getCoche() {
        return coche;
    }

    public void setCoche(Coche coche) {
        this.coche = coche;
    }
    
}
