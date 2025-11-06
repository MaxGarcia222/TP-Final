package com.example.tpfinal;

import javafx.application.Application;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Launcher {
    public static void main(String[] args) {
        Application.launch(HelloApplication.class, args);
        //aca estoy medio gaga y m puse a probar (hice una clase generica para crear collecciones
        //(usar genericidad en algun lado) para hacer una collecion con las herramientas que vaya a tener cada usuario
        //osea una coleccion de colecciones
        //accedes a la herramienta que quieras usar desde "HerramientasPremium"
        //lo hice muy por arriba y estoy recontra gaga asi que hay que corregir y tocar

        CollectionGenerico<Herramientas> HerramientasPremium  = new CollectionGenerico<Herramientas>(new ArrayList<>());
        ToDo prueba = new ToDo();
        HerramientasPremium.add(prueba);

    }
}
