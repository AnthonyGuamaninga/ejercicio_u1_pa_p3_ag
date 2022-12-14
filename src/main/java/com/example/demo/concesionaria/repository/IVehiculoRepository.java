package com.example.demo.concesionaria.repository;

import com.example.demo.concesionaria.modelo.Matricula;
import com.example.demo.concesionaria.modelo.Vehiculo;

public interface IVehiculoRepository {
	
	public void insertar(Vehiculo vehiculo);
	public void eliminar(String placa);
	public Vehiculo buscar(String placa);
	public void actualizar(Vehiculo vehiculo);

}
