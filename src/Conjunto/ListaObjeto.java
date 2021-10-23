package Conjunto;

import java.util.*;

public class ListaObjeto implements Conjunto{

    protected List<Object> listaOb;

    public ListaObjeto(List<Object> listaOb){
        this.listaOb = listaOb;
    }

    public void agregar(Object objeto){
        listaOb.add(objeto);
    }

    public boolean pertenece (Object o){
        if(listaOb.contains(o)){
            return true;
        }else{
            return false;
        }
    }
}
