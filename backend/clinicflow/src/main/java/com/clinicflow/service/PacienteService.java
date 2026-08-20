package com.clinicflow.service;

import com.clinicflow.repository.PacienteRepository;
import org.springframework.stereotype.Service;
import com.clinicflow.model.Paciente;
import java.util.List;

@Service
public class PacienteService {

    private final PacienteRepository pacienteRepository;

    public PacienteService(PacienteRepository pacienteRepository) {
        this.pacienteRepository = pacienteRepository;
    }

    public List<Paciente> listarPacientes() {
        return pacienteRepository.findAll();
    }
    public Paciente buscarPaciente(Integer id){
        return pacienteRepository.findById(id).orElse(null);
    }
    public Paciente guardarPaciente(Paciente paciente){
        return pacienteRepository.save(paciente);
    }
    public Paciente actualizarPaciente(Integer id, Paciente paciente){
        paciente.setIdPaciente(id);
        return pacienteRepository.save(paciente);
    }
    public void eliminarPaciente(Integer id){
        pacienteRepository.deleteById(id);
    }
}
