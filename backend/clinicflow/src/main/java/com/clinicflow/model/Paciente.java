package com.clinicflow.model;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
@Entity
public class Paciente {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int idPaciente;
private String nombre;
private String apellidoPaterno;
private String apellidoMaterno;
private String dni;
private String telefono;
private String correo;
private String direccion;

    public Paciente() {}

    public Paciente(String nombre, String apellidoPaterno, String apellidoMaterno, String dni, String telefono, String correo, String direccion) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.dni = dni;
        this.telefono = telefono;
        this.correo = correo;
        this.direccion = direccion;
    }
    public int getIdPaciente() {return idPaciente; }
    public void setIdPaciente(int idPaciente) {this.idPaciente = idPaciente; }
    public String getNombre() {return nombre; }
    public void setNombre(String nombre) {this.nombre = nombre;  }
    public String getApellidoPaterno() {return apellidoPaterno;   }
    public void setApellidoPaterno(String apellidoPaterno) {this.apellidoPaterno = apellidoPaterno;   }
    public String getApellidoMaterno() {return apellidoMaterno; }
    public void setApellidoMaterno(String apellidoMaterno) {this.apellidoMaterno = apellidoMaterno; }
    public String getDni() {return dni; }
    public void setDni(String dni) {this.dni = dni; }
    public String getTelefono() {return telefono; }
    public void setTelefono(String telefono) {this.telefono = telefono; }
    public String getCorreo() {return correo; }
    public void setCorreo(String correo) {this.correo = correo; }
    public String getDireccion() {return direccion;}
    public void setDireccion(String direccion) {this.direccion = direccion;}
    
    public void consultarCitas(){
        
    }
    public void actualizarDatos(){
        
    }
}
