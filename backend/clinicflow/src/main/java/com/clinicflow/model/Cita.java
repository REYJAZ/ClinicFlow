
package com.clinicflow.model;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import java.time.LocalDate;
import java.time.LocalTime;
import jakarta.persistence.ManyToOne;
@Entity
public class Cita {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private int idCita;
 private LocalDate fecha;
 private LocalTime hora;
 private String motivo;
 private String estado;
 
 @ManyToOne
 private Paciente paciente;
 @ManyToOne
 private Medico medico;

    public Cita() {}
    
    public Cita(LocalDate fecha, LocalTime hora, String motivo, String estado, Paciente paciente, Medico medico) {
        this.fecha = fecha;
        this.hora = hora;
        this.motivo = motivo;
        this.estado = estado;
        this.paciente = paciente;
        this.medico = medico;
    }
    public int getIdCita() {return idCita;}
    public void setIdCita(int idCita) {this.idCita = idCita; }
    public LocalDate getFecha() {return fecha; }
    public void setFecha(LocalDate fecha) {this.fecha = fecha; }
    public LocalTime getHora() {return hora;}
    public void setHora(LocalTime hora) {this.hora = hora; }
    public String getMotivo() {return motivo; }
    public void setMotivo(String motivo) {this.motivo = motivo;  }
    public String getEstado() {return estado; }
    public void setEstado(String estado) {this.estado = estado;}
    public Paciente getPaciente() {return paciente; }
    public void setPaciente(Paciente paciente) {this.paciente = paciente; }
    public Medico getMedico() {return medico;}
    public void setMedico(Medico medico) {this.medico = medico;}
    
    public void confirmar(){
        
    }
    public void cancelar(){
        
    }
    public void marcarComoAtendida(){
        
    }
 }
