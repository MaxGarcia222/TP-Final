package com.example.tpfinal;

import java.util.Collection;
//Estoy haciendo una clase generica gestora de cualquier coleccion

public class CollectionGenerico<T> {
    private Collection<T> coleccion;

    //el constructor dice Collection<T> Osea cualquier coleccion y la segunda parte dice collecion
    // Collection<T> coleccion ---> coleccion contiene el new de la coleccion q tnga
    public CollectionGenerico(Collection<T> coleccion) {
        this.coleccion = coleccion;
    }

    //Falta agregar todos los metodos

    public boolean add (T t){
        return coleccion.add(t);
    }




}
