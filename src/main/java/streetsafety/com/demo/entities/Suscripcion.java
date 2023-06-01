package streetsafety.com.demo.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="suscripciones")
public class Suscripcion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idSuscripcion;

    @Column(name="tipoMembresia",length=10,nullable = false)
    private String tipoMembresia;

    @Column(name="fechaInicio",nullable = false)
    private LocalDate fechaInicio;

    @Column(name="fechaFin",nullable = false)
    private LocalDate fechaFin;

    @Column(name="idPago",length=10,nullable = false)
    private String idPago;

    public Suscripcion() {
    }

    public Suscripcion(int idSuscripcion, String tipoMembresia, LocalDate fechaInicio, LocalDate fechaFin, String idPago) {
        this.idSuscripcion = idSuscripcion;
        this.tipoMembresia = tipoMembresia;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.idPago = idPago;
    }

    public int getIdSuscripcion() {
        return idSuscripcion;
    }

    public void setIdSuscripcion(int idSuscripcion) {
        this.idSuscripcion = idSuscripcion;
    }

    public String getTipoMembresia() {
        return tipoMembresia;
    }

    public void setTipoMembresia(String tipoMembresia) {
        this.tipoMembresia = tipoMembresia;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getIdPago() {
        return idPago;
    }

    public void setIdPago(String idPago) {
        this.idPago = idPago;
    }
}
