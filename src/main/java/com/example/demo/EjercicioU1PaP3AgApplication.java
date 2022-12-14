package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.concesionaria.modelo.Propietario;
import com.example.demo.concesionaria.modelo.Vehiculo;
import com.example.demo.concesionaria.service.IMatriculaService;
import com.example.demo.concesionaria.service.IPropietarioService;
import com.example.demo.concesionaria.service.IVehiculoService;

@SpringBootApplication
public class EjercicioU1PaP3AgApplication implements CommandLineRunner {
	@Autowired
	private IMatriculaService matriculaService;
	@Autowired
	private IVehiculoService vehiculoService;
	@Autowired
	private IPropietarioService propietarioService;
	
	public static void main(String[] args) {
		SpringApplication.run(EjercicioU1PaP3AgApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Vehiculo v = new Vehiculo();
		v.setMarca("Chevrolet");
		v.setPlaca("PDF-4545");
		v.setPrecio(new BigDecimal(23000));
		v.setTipo("Liviano");
		
		Propietario p = new Propietario();
		p.setApellido("Galindo");
		p.setCedula("1235456454");
		p.setFechaNacimiento(LocalDateTime.of(2000,01,20,8,10) );
		p.setNombre("Raul");
		
		matriculaService.insertar(p.getCedula(), v.getPlaca());
		
	}

}
