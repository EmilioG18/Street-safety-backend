package streetsafety.com.demo.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "delitos")
public class Delitos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "hora", length = 30, nullable = false)
    private int hora;

    @Column(name = "Fecha", length = 30, nullable = false)
    private LocalDate fecha;

    @Column(name = "Distrito", length = 30, nullable = false)
    private String distrito;

    @Column(name = "Distrito_idZona", length = 30, nullable = false)
    private int distrito_idzona;

    @Column(name = "Tipo delito", length = 30, nullable = false)
    private int idtipo_delito;

    public Delitos(){

    }

    public Delitos(int id, int hora, LocalDate fecha, String distrito, int distrito_idzona, int idtipo_delito) {
        this.id = id;
        this.hora = hora;
        this.fecha = fecha;
        this.distrito = distrito;
        this.distrito_idzona = distrito_idzona;
        this.idtipo_delito = idtipo_delito;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public int getDistrito_idzona() {
        return distrito_idzona;
    }

    public void setDistrito_idzona(int distrito_idzona) {
        this.distrito_idzona = distrito_idzona;
    }

    public int getIdtipo_delito() {
        return idtipo_delito;
    }

    public void setIdtipo_delito(int idtipo_delito) {
        this.idtipo_delito = idtipo_delito;
    }
}
