package com.trabajo1;

import java.util.ArrayList;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.componentes.Dependencia;

@SpringBootApplication
public class Trabajo1Application implements CommandLineRunner {
 
	Dependencia dependencia;
	
	public static void main(String[] args) {
		SpringApplication.run(Trabajo1Application.class, args);
	}

	public Trabajo1Application(Dependencia dependencia) {
		this.dependencia=dependencia;
	}

	@Override
	public void run(String... args) throws Exception {
//		//suma
//		this.dependencia.salida_mensaje(this.dependencia.suma(dependencia.leer_teclado(), dependencia.leer_teclado()));
//		//resta
//		this.dependencia.salida_mensaje(this.dependencia.resta(dependencia.leer_teclado(), dependencia.leer_teclado()));
//		//multiplicacion
//		this.dependencia.salida_mensaje(this.dependencia.multiplica(dependencia.leer_teclado(), dependencia.leer_teclado()));
//		//divicion
//		this.dependencia.salida_mensaje(this.dependencia.divide(dependencia.leer_teclado(), dependencia.leer_teclado()));
		//this.dependencia.salida_mensaje(this.dependencia.Mayor(this.dependencia.leer_teclado(),this.dependencia.leer_teclado()));
		ArrayList<String> vector=this.dependencia.tablaint(dependencia.leer_teclado());
		for(String valor:vector) {
			dependencia.salida_mensaje(valor);
		}
	}

}
