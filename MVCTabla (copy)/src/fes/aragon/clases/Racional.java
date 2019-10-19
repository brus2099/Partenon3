package fes.aragon.clases;

public class Racional {

	int numerador;
	int denominador;
	
	public Racional(int numerador, int denominador) {
		super();
		this.numerador = numerador;
		this.denominador = denominador;
	}

	public int getNumerador() {
		return numerador;
	}

	public void setNumerador(int numerador) {
		this.numerador = numerador;
	}

	public int getDenominador() {
		return denominador;
	}

	public void setDenominador(int denominador) {
		this.denominador = denominador;
		if (denominador ==0){
			denominador=1;
		}else {
			this.denominador=denominador;
		}
	}
	
	
	
	
}
