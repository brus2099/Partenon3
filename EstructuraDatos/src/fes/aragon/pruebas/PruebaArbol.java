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
        arb.insertar(14);
        arb.insertar(12);
        arb.insertar(9);
        arb.insertar(8);
        arb.recAmplitud();
        
        arb.insertar(3);
        arb.insertar(14);
        arb.insertar(7);
        arb.insertar(8);
        arb.insertar(4);
        arb.insertar(10);
        arb.insertar(11);
        
        //System.out.println("Recorrido del arbol: ");
        //arb.recAmplitud();
        

        /*//arb.eliminar(25);
        System.out.println();
        System.out.println("Prefija: ");
        arb.prefija(arb.getRaiz());
        //arb.recAmplitud();
        System.out.println();
        System.out.println("Posfija: ");
        arb.posfija(arb.getRaiz());
        //arb.recAmplitud();
        System.out.println();
        System.out.println("Interfija: ");
        arb.interfija(arb.getRaiz());
        //arb.recAmplitud();*/
        
        
        
        
        
        
        
        ArbolBinario<Integer> arb2 = new ArbolBinario<>();
        String[] cad = {"+", "5" ,"3"};
        arb2.insertarPosfija(cad);
        
        arb2.recAmplitud();
        
    }
}
