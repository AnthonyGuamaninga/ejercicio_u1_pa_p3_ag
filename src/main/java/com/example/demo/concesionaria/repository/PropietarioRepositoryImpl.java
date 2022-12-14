package com.example.demo.concesionaria.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.concesionaria.modelo.Propietario;
import com.example.demo.concesionaria.modelo.Vehiculo;
@Repository
public class PropietarioRepositoryImpl implements IPropietarioRepository{
	
	private static List<Propietario> baseDatos = new ArrayList<>();

	@Override
	public void insertar(Propietario propietario) {
		// TODO Auto-generated method stub
		baseDatos.add(propietario);
	}

	@Override
	public void eliminar(Propietario propietario) {
		// TODO Auto-generated method stub
		baseDatos.remove(propietario);
	}

	@Override
	public Propietario buscar(String cedula) {
		// TODO Auto-generated method stub
		for(Propietario v : baseDatos) {
			if(v.getCedula().equals(cedula)) {
				return v;
			}
		}
		
		return null;
		
	}

	@Override
	public void actualizar(String cedula) {
		// TODO Auto-generated method stub
		Propietario pAntiguo= buscar(cedula);
		for(Propietario v : baseDatos) {
			if(v.getCedula().equals(pAntiguo.getCedula())) {
				pAntiguo=v;
			}
		}
		baseDatos.remove(pAntiguo);
		baseDatos.add(buscar(cedula));
	}

}
