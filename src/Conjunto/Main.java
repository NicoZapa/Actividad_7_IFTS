package Conjunto;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        //--NUMEROS
        ListaNumeros lista = new ListaNumeros();

        System.out.println(lista.pertenece(3));
        System.out.println(lista.pertenece(2));

        //--OBJETOS
        List<Object> listaObj = new LinkedList<Object>();
        ListaObjeto lista2 = new ListaObjeto(listaObj);

        Objeto objeto1 = new Objeto();
        Objeto objeto2 = new Objeto();

        lista2.agregar(objeto1);
        System.out.println(lista2.pertenece(objeto1));

        System.out.println(lista2.pertenece(objeto2));
    }
}
