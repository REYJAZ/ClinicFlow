package com.clinicflow.model;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
@Entity
public class Usuario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUsuario;
    private String login;
    private String contraseña;
    private String rolDesignado;

    public Usuario() {}

    public Usuario(String login, String contraseña, String rolDesignado) {
        this.login = login;
        this.contraseña = contraseña;
        this.rolDesignado = rolDesignado;
    }
       
    public int getIdUsuario() {return idUsuario;}
    public void setIdUsuario(int idUsuario) {this.idUsuario = idUsuario; }
    public String getLogin() {return login;}
    public void setLogin(String login) {this.login = login;}
    public String getContraseña(){return contraseña;}
    public void setContraseña(String contraseña){this.contraseña = contraseña;}
    public String getRolDesignado() {return rolDesignado;}
    public void setRolDesignado(String rolDesignado){this.rolDesignado = rolDesignado;}
    
    public boolean autenticar(){
        return false;
    }
    public void cerrarSesion(){
        
    }
}
