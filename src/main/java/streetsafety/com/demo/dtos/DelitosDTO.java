package streetsafety.com.demo.dtos;

import java.time.LocalDate;

public class DelitosDTO {

    private int id;
    private int hora;
    private LocalDate fecha;
    private String distrito;
    private int distrito_idzona;
    private int idtipo_delito;

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
