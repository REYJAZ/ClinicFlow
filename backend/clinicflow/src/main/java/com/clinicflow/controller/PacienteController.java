package com.clinicflow.controller;

import org.springframework.web.bind.annotation.RestController;
import com.clinicflow.service.PacienteService;
import com.clinicflow.model.Paciente;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;

@RestController
public class PacienteController {

private final PacienteService pacienteService;

public PacienteController(PacienteService pacienteService){
    this.pacienteService = pacienteService;
}
@GetMapping("/pacientes")
public List<Paciente>listarPacientes(){
    return pacienteService.listarPacientes();
}
@GetMapping("/paciente/{id}")
public Paciente buscarPaciente(@PathVariable Integer id){
    return pacienteService.buscarPaciente(id);
}
@PostMapping("/pacientes")
public Paciente guardarPaciente(@RequestBody Paciente paciente){
    return pacienteService.guardarPaciente(paciente);
}
@PutMapping("/pacientes/{id}")
public Paciente actualizarPaciente(@PathVariable Integer id, @RequestBody Paciente paciente){
    return pacienteService.actualizarPaciente(id, paciente);
}
@DeleteMapping("/pacientes/{id}")
public void eliminarPaciente(@PathVariable Integer id){
    pacienteService.eliminarPaciente(id);
}
}
