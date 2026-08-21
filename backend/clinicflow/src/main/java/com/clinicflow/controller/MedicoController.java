package com.clinicflow.controller;

import com.clinicflow.service.MedicoService;
import com.clinicflow.model.Medico;
import java.util.List;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;

@RestController
public class MedicoController {
    
 private final MedicoService medicoService;
 
 public MedicoController (MedicoService medicoService){
     this.medicoService = medicoService;
 } 
 @GetMapping("/medicos")
 public List<Medico>listarMedicos(){
     return medicoService.listarMedicos();
 }
 @GetMapping("/medicos/{id}")
 public Medico buscarMedico(@PathVariable Integer id){
     return medicoService.buscarMedico(id);
 }
 @PostMapping("/medicos")
 public Medico guardarMedico(@RequestBody Medico medico){
     return medicoService.guardarMedico(medico);
 }
 @PutMapping("/medicos/{id}")
 public Medico actualizarMedico(@PathVariable Integer id, @RequestBody Medico medico){
     return medicoService.actualizarMedico(id, medico);
 }
 @DeleteMapping("/medicos/{id}")
 public void eliminarMedico(@PathVariable Integer id){
     medicoService.eliminarMedico(id);
 }
}
