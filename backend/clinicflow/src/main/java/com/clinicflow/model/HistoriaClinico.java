package com.clinicflow.model;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import java.time.LocalDate;
@Entity
public class HistoriaClinico {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int idHistorial;
  private LocalDate fechaCreacion;
  private String antecedentes;
  private String diagnostico;
  private String tratamiento;
  private String observaciones;

    public HistoriaClinico() {}

    public HistoriaClinico(LocalDate fechaCreacion, String antecedentes, String diagnostico, String tratamiento, String observaciones) {
        this.fechaCreacion = fechaCreacion;
        this.antecedentes = antecedentes;
        this.diagnostico = diagnostico;
        this.tratamiento = tratamiento;
        this.observaciones = observaciones;
    }
    public int getIdHistorial() {return idHistorial;}
    public void setIdHistorial(int idHistorial) {this.idHistorial = idHistorial; }
    public LocalDate getFechaCreacion() {return fechaCreacion; }
    public void setFechaCreacion(LocalDate fechaCreacion) {this.fechaCreacion = fechaCreacion; }
    public String getAntecedentes() {return antecedentes;  }
    public void setAntecedentes(String antecedentes) {this.antecedentes = antecedentes;}
    public String getDiagnostico() {return diagnostico; }
    public void setDiagnostico(String diagnostico) {this.diagnostico = diagnostico;}
    public String getTratamiento() {return tratamiento; }
    public void setTratamiento(String tratamiento) {this.tratamiento = tratamiento; }
    public String getObservaciones() {return observaciones; }
    public void setObservaciones(String observaciones) {this.observaciones = observaciones;  }
    
    public void actualizar(){
        
    }
    public void consultar(){
        
    }

}
