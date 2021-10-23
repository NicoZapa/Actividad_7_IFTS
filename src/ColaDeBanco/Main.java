package ColaDeBanco;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Deque<Persona> cola = new LinkedList<Persona>();

        ColaDeBanco colaBanco = new ColaDeBanco(cola);

        Persona nico = new Persona();
        nico.nombre = "Nicolas";
        nico.edad = 25;

        Persona lucia = new Persona();
        lucia.nombre = "Lucia";
        lucia.edad = 20;

        Persona mabel = new Persona();
        mabel.nombre = "Mabel";
        mabel.edad = 64;

        colaBanco.agregar(nico);
        colaBanco.agregar(lucia);
        colaBanco.agregar(mabel);

        colaBanco.mostrar();

        colaBanco.atender();
        colaBanco.atender();
        colaBanco.atender();
        colaBanco.atender();

    }
}
