package com.clinicflow.service;
import com.clinicflow.model.Medico;
import com.clinicflow.repository.MedicoRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class MedicoService {

private final MedicoRepository medicoRepository;   

public MedicoService(MedicoRepository medicoRepository){
    this.medicoRepository = medicoRepository;
}
//listar medicos 
public List<Medico>listarMedicos(){
    return medicoRepository.findAll();
}
//buscar medicos
public Medico buscarMedico(Integer id){
    return medicoRepository.findById(id).orElse(null);
}
//guardar medicos
public Medico guardarMedico(Medico medico){
    return medicoRepository.save(medico);
}
//actualizar medicos
public Medico actualizarMedico(Integer id, Medico medico){
    Medico medicoExistente = medicoRepository.findById(id).orElse(null);
    if (medicoExistente != null){
       medicoExistente.setNombre(medico.getNombre());
       medicoExistente.setApellidoPaterno(medico.getApellidoPaterno());
       medicoExistente.setApellidoMaterno(medico.getApellidoMaterno());
       medicoExistente.setDni(medico.getDni());
       medicoExistente.setTelefono(medico.getTelefono());
       medicoExistente.setCorreo(medico.getCorreo());
       medicoExistente.setEspecialidad(medico.getEspecialidad());
       medicoExistente.setNumeroColegiatura(medico.getNumeroColegiatura());
       return medicoRepository.save(medicoExistente);
   }
   return null;     
   }
// eliminar medicos
public void eliminarMedico(Integer id){
   medicoRepository.deleteById(id);
}
}
