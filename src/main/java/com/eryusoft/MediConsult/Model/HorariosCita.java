package com.eryusoft.MediConsult.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class HorariosCita 
{
	@Id
	private int id;
	private String horarioCita;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getHorarioCita() {
		return horarioCita;
	}
	
	public void setHorarioCita(String horarioCita) {
		this.horarioCita = horarioCita;
	}
	
	@Override
	public String toString() {
		return "HorariosCita [id=" + id + ", horarioCita=" + horarioCita + "]";
	}
	
	

}
