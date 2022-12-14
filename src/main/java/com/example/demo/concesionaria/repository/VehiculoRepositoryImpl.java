package com.example.demo.concesionaria.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.concesionaria.modelo.Vehiculo;
@Repository
public class VehiculoRepositoryImpl implements IVehiculoRepository {
	
	private  List<Vehiculo> baseDatos = new ArrayList<>();

	@Override
	public void insertar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		baseDatos.add(vehiculo);
	}

	@Override
	public void eliminar(String placa) {
		// TODO Auto-generated method stub
		baseDatos.remove(placa);
	}

	@Override
	public Vehiculo buscar(String placa) {
		// TODO Auto-generated method stub
		for(Vehiculo v : baseDatos) {
			if(v.getPlaca().equals(placa)) {
				return v;
			}
		}
		
		return null;
		
	}

	@Override
	public void actualizar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		Vehiculo vAntiguo= null;
		for(Vehiculo v : baseDatos) {
			if(v.getPlaca().equals(vehiculo.getPlaca())) {
				vAntiguo=v;
			}
		}
		baseDatos.remove(vAntiguo);
		baseDatos.add(vehiculo);
	}

	

}
