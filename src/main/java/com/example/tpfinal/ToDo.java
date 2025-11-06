package com.example.tpfinal;

import java.util.HashSet;
import java.util.Set;

public class ToDo extends Herramientas{
    private Set<TareaToDo> tareasPendientes;

    //creé un HashSet de TareaToDo
    public ToDo() {
        this.tareasPendientes = new HashSet<TareaToDo>();
    }
}
