package com.example.demo.concesionaria.service;

import java.math.BigDecimal;

import com.example.demo.concesionaria.modelo.Matricula;
import com.example.demo.concesionaria.modelo.Vehiculo;

public interface IMatriculaService {
	
	public void insertar(String cedula, String placa);
	public void eliminar(String placa);
	public Matricula buscar(String placa);
	public void actualizar(String placa);
	
	public BigDecimal valorMatricula(Vehiculo vehiculo);

}
