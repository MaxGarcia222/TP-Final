package com.example.tpfinal;

public class TareaToDo {
    protected String descripcion;
    protected boolean completado;

    public TareaToDo(String descripcion, boolean completado) {
        this.descripcion = descripcion;
        this.completado = completado;
    }

    public TareaToDo() {
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isCompletado() {
        return completado;
    }

    public void setCompletado(boolean completado) {
        this.completado = completado;
    }
}
