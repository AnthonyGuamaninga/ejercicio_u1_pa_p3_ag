package com.example.demo.concesionaria.service;

import com.example.demo.concesionaria.modelo.Matricula;
import com.example.demo.concesionaria.modelo.Propietario;

public interface IPropietarioService {
	
	public void insertar(Propietario vehiculo);
	public void eliminar(String cedula);
	public Propietario buscar(String cedula);
	public void actualizar(String cedula);

}
