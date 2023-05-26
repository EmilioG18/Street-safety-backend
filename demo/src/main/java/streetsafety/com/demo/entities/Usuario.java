package streetsafety.com.demo.entities;

import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.time.LocalDate;

@Entity
@Table(name = "usuarios")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUsuario;
    @Column(name = "username",length = 30,nullable = false)
    private String username;

    @Column(name = "password",length = 30,nullable = false)
    private  String password;
    @Column(name = "email",length = 30,nullable = false)
    private  String email;
    @Column(name = "nombres_usuario",length = 100,nullable = false)
    private  String nombres_usuario;
    @Column(name = "apellidos_usuario",length = 100,nullable = false)
    private  String apellidos_usuario;
    @Column(name = "fecha_nacimiento",nullable = false)
    private LocalDate fecha_nacimiento;

    public  Usuario(){

    }
    public Usuario(int idUsuario, String username, String password, String email, String nombres_usuario, String apellidos_usuario, LocalDate fecha_nacimiento) {
        this.idUsuario = idUsuario;
        this.username = username;
        this.password = password;
        this.email = email;
        this.nombres_usuario = nombres_usuario;
        this.apellidos_usuario = apellidos_usuario;
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombres_usuario() {
        return nombres_usuario;
    }

    public void setNombres_usuario(String nombres_usuario) {
        this.nombres_usuario = nombres_usuario;
    }

    public String getApellidos_usuario() {
        return apellidos_usuario;
    }

    public void setApellidos_usuario(String apellidos_usuario) {
        this.apellidos_usuario = apellidos_usuario;
    }

    public LocalDate getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(LocalDate fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }
}

