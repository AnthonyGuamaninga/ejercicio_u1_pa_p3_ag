package com.example.demo.concesionaria.repository;

import com.example.demo.concesionaria.modelo.Matricula;

public interface IMatriculaRepository {

	public void insertar(Matricula matricula);
	public void eliminar(String placa);
	public Matricula buscar(String placa);
	public void actualizar(String placa);
}
