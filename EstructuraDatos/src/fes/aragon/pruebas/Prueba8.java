package fes.aragon.pruebas;
import fes.aragon.arbolbinario.*;

public class Prueba8 {
public static void main(String[] args) {
	ArbolBinario<Integer> arb = new ArbolBinario<>();
	
	arb.recAmplitud();
	
	String cadena = "+ * a b ^ / c d 3";
	String[] token = cadena.split(" ");
	arb.insertarPosfija(token);
	String ca="";
	String[]token2 = ca.split(" ");

}
}
