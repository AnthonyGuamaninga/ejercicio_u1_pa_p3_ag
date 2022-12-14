package com.example.demo.concesionaria.service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.concesionaria.modelo.Matricula;
import com.example.demo.concesionaria.modelo.Vehiculo;
import com.example.demo.concesionaria.repository.IMatriculaRepository;
import com.example.demo.concesionaria.repository.IPropietarioRepository;
import com.example.demo.concesionaria.repository.IVehiculoRepository;
@Service
public class MatriculaServiceImpl implements IMatriculaService{
	@Autowired
	private IMatriculaRepository matriculaRepo;
	@Autowired
	private IPropietarioRepository propietarioRepo;
	@Autowired
	private IVehiculoRepository vehiculoRepo;
	@Override
	public void insertar(String cedula, String placa) {
		
		Matricula matricula= null;
		Vehiculo v = null;
		v = vehiculoRepo.buscar(placa);
		matricula.setFechaMatricula(LocalDateTime.now());
		matricula.setPropietario(propietarioRepo.buscar(cedula));
		matricula.setValorMatricula(valorMatricula( v));
		matricula.setVehiculo(v);
		
		this.matriculaRepo.insertar(matricula);
		
	}

	@Override
	public void eliminar(String placa) {
		// TODO Auto-generated method stub
		this.matriculaRepo.eliminar(placa);
	}

	@Override
	public Matricula buscar(String placa) {
		// TODO Auto-generated method stub
		return this.matriculaRepo.buscar(placa);
	}

	@Override
	public void actualizar(String placa) {
		// TODO Auto-generated method stub
		this.matriculaRepo.actualizar(placa);
	}

	@Override
	public BigDecimal valorMatricula(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		BigDecimal valorAumento = new BigDecimal(0);
		BigDecimal valorFinal = new BigDecimal(0);
		
		if(vehiculo.getTipo() == "Liviano") {
			valorAumento= vehiculo.getPrecio().multiply( new BigDecimal(0.1));
		}else {
			valorAumento= vehiculo.getPrecio().multiply( new BigDecimal(0.15));
		}
		
		if(valorAumento.intValue() > 2000) {
			valorFinal = valorAumento.multiply(new BigDecimal(0.93));
		}
		
		return valorFinal;
	}

}
