package ar.edu.unlam.basica2.tp3.empresa;

public class Secretaria extends Empleado {

	@Override
	public void brindarDetalle(String nombre, Double salario, String fechaC) {
		this.nombre = nombre;
		this.salario = salario;
		this.fechaCumpleaņos = fechaC;

	}

}
