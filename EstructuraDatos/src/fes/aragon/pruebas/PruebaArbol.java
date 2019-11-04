package fes.aragon.pruebas;

import fes.aragon.arbolbinario.ArbolBinario;

public class PruebaArbol {

    public static void main(String[] args) {
        
        ArbolBinario<Integer> arb = new ArbolBinario<>();

        arb.insertar(25);
        arb.insertar(13);
        arb.insertar(28);
        arb.insertar(11);
        arb.insertar(15);
        arb.insertar(26);
        arb.insertar(30);
        arb.insertar(10);
        arb.insertar(16);
        arb.insertar(33);
        arb.insertar(29);
        arb.insertar(12);
        arb.insertar(9);
        arb.insertar(8);
        arb.recAmplitud();
        
        System.out.println("--------------------------------");

        arb.eliminar(25);
        //arb.prefija(arb.getRaiz());
        arb.recAmplitud();
        System.out.println("--------------------------------");
        
    }
}
