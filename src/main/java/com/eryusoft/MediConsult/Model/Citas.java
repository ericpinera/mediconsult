package com.eryusoft.MediConsult.Model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Citas 
{
	@Id
	private int id;
	private Date fecha;
	private int horario;
	private int paciente;
	private String estado;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public Date getFecha() {
		return fecha;
	}
	
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	public int getHorario() {
		return horario;
	}
	
	public void setHorario(int horario) {
		this.horario = horario;
	}
	
	public int getPaciente() {
		return paciente;
	}
	
	public void setPaciente(int paciente) {
		this.paciente = paciente;
	}
	
	public String getEstado() {
		return estado;
	}
	
	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Citas() {
		
	}
	
	

}
