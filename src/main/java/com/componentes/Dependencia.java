package com.componentes;

import java.util.ArrayList;

public interface Dependencia {
	void salida_mensaje(String Mensaje);
	int leer_teclado();
	String suma(int a, int b);
	String resta(int a, int b);
	String multiplica(int a, int b);
	String divide(int a, int b);
	
	String Mayor(int a, int b);
	ArrayList<String>tablaint(int tabladel);
}