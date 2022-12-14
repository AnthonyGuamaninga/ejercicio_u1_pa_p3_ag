package com.example.demo.concesionaria.repository;

import com.example.demo.concesionaria.modelo.Matricula;
import com.example.demo.concesionaria.modelo.Propietario;
import com.example.demo.concesionaria.modelo.Vehiculo;

public interface IPropietarioRepository {
	
	public void insertar(Propietario propietario);
	public void eliminar(Propietario propietario);
	public Propietario buscar(String cedula);
	public void actualizar(String cedula);

}
