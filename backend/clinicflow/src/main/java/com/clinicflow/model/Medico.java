package com.clinicflow.model;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class Medico {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private int idMedico;
 private String nombre;
 private String apellidoPaterno;
 private String apellidoMaterno;
 private String dni;
 private String telefono;
 private String correo;
 private String especialidad;
 private String numeroColegiatura;

    public Medico() {}

    public Medico(String nombre, String apellidoPaterno, String apellidoMaterno, String dni, String telefono, String correo, String especialidad, String numeroColegiatura) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.dni = dni;
        this.telefono = telefono;
        this.correo = correo;
        this.especialidad = especialidad;
        this.numeroColegiatura = numeroColegiatura;
    }
    public int getIdMedico() {return idMedico;}
    public void setIdMedico(int idMedico) {this.idMedico = idMedico;}
    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre; }
    public String getApellidoPaterno() {return apellidoPaterno;}
    public void setApellidoPaterno(String apellidoPaterno){this.apellidoPaterno = apellidoPaterno; }
    public String getApellidoMaterno() {return apellidoMaterno; }
    public void setApellidoMaterno(String apellidoMaterno) {this.apellidoMaterno = apellidoMaterno;  }
    public String getDni() {return dni; }
    public void setDni(String dni) {this.dni = dni; }
    public String getTelefono() {return telefono;  }
    public void setTelefono(String telefono){this.telefono = telefono;  }
    public String getCorreo() {return correo;  }
    public void setCorreo(String correo) {this.correo = correo; }
    public String getEspecialidad() {return especialidad; }
    public void setEspecialidad(String especialidad) {this.especialidad = especialidad;  }
    public String getNumeroColegiatura() {return numeroColegiatura;}
    public void setNumeroColegiatura(String numeroColegiatura) {this.numeroColegiatura = numeroColegiatura; }
 
    public void consultarCitas(){
        
    }
    public void atenderCitas(){
        
    }
    public void actualizarHistoria(){
        
    }
}
