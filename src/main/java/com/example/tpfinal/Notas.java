package com.example.tpfinal;

import java.util.HashMap;
import java.util.Map;

//HashMap ---> notas<nombreNota, textodelanota>

public class Notas extends Herramientas{
    protected Map<String, String> notas;

    public Notas() {
        this.notas = new HashMap<String, String>();
    }
}
