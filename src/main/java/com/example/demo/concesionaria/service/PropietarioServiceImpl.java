package com.example.demo.concesionaria.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.concesionaria.modelo.Matricula;
import com.example.demo.concesionaria.modelo.Propietario;
import com.example.demo.concesionaria.repository.IPropietarioRepository;
@Service
public class PropietarioServiceImpl implements IPropietarioService {
	@Autowired
	private IPropietarioRepository propietarioRepo;
	@Override
	public void insertar(Propietario vehiculo) {
		// TODO Auto-generated method stub
		propietarioRepo.insertar(vehiculo);
	}

	@Override
	public void eliminar(String cedula) {
		// TODO Auto-generated method stub
		propietarioRepo.eliminar(cedula);
	}

	@Override
	public Propietario buscar(String cedula) {
		// TODO Auto-generated method stub
		return this.propietarioRepo.buscar(cedula);
	}

	@Override
	public void actualizar(String cedula) {
		// TODO Auto-generated method stub
		this.propietarioRepo.actualizar(cedula);
	}

}
