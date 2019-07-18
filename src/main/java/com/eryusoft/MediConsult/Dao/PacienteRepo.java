package com.eryusoft.MediConsult.Dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.eryusoft.MediConsult.Model.Paciente;

public interface PacienteRepo extends CrudRepository<Paciente, Integer>
{
	List<Paciente> findByIdentificacion(String identificacion);
}
