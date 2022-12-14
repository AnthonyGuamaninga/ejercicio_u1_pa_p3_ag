package com.example.demo.concesionaria.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.concesionaria.modelo.Matricula;
import com.example.demo.concesionaria.modelo.Vehiculo;
import com.example.demo.concesionaria.repository.IVehiculoRepository;
@Service
public class VehiculoServiceImpl implements IVehiculoService{
	@Autowired
	private IVehiculoRepository vehiculoRepo;
	@Override
	public void insertar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		this.vehiculoRepo.insertar(vehiculo);
	}

	@Override
	public void eliminar(String placa) {
		// TODO Auto-generated method stub
		this.vehiculoRepo.eliminar(placa);
	}

	@Override
	public Vehiculo buscar(String placa) {
		// TODO Auto-generated method stub
		return this.vehiculoRepo.buscar(placa);
	}

	@Override
	public void actualizar(String placa) {
		// TODO Auto-generated method stub
		this.vehiculoRepo.actualizar(placa);
	}

}
