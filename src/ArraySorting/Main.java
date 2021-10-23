package ArraySorting;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //-- ARRAY DE INTS
        int[] numeros = {5, 2, 1, 7};

        java.util.Arrays.sort(numeros);

        for(int n : numeros){
            System.out.println(n);
        }

        java.util.Arrays.asList(numeros);
        System.out.println();

        //-- LISTA DE NUMEROS
        List<Integer> listaNumeros = new ArrayList<Integer>();

        listaNumeros.add(4);
        listaNumeros.add(2);
        listaNumeros.add(7);
        listaNumeros.add(3);

        java.util.Collections.sort(listaNumeros);

        for(int n : listaNumeros){
            System.out.println(n);
        }

        listaNumeros.toArray();
    }
}
