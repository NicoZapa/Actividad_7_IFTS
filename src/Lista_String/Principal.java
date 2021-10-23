package Lista_String;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Principal {
    public static void main(String[] args){
        //Creamos un ArrayList
        List<String> lista = new LinkedList<String>();

        //Agregamos nombres
        lista.add("Nicolas");
        lista.add("Micaela");
        lista.add("Lucia");

        //Mostramos con for clasico
        for(int i = 0; i < lista.size(); i++){
            System.out.println(lista.get(i));
        }

        System.out.println();

        //Mostramos con for colecciones
        for(String nombre : lista){
            System.out.println(nombre);
        }
        System.out.println();

        //Seteamos nuevos valores
        lista.set(0, "Fernando");
        lista.set(1, "Valeria");
        lista.set(2, "Monica");

        //Removemos lo que hay en el indice 2
        lista.remove(2);

        //Agregamos uno repetido y el remove elimina la primera ocurrencia
        lista.add("Fernando");
        lista.remove("Fernando");
        for(String nombre : lista){
            System.out.println(nombre);
        }

        //Vemos si la lista contiene ese valor
        System.out.println(lista.contains("Valeria"));

        //Creamos metodo que borra un nombre
        borrarTodo(lista, "Valeria");


    }

    public static void borrarTodo(List<String> lista, String nombre){
        if(lista.contains(nombre)){
            lista.remove(nombre);
        }else{
            System.out.println("Ese nombre no existe en la lista");
        }
        System.out.println();
        for(String persona : lista){
            System.out.println(persona);
        }
    }
}
