package com.example.tpfinal;

public abstract class Usuario {
    protected String nombre;
    protected String apellido;
    protected String mail;
    protected String contrasenia;
    protected TipoUsuario tipo;

    public Usuario(String nombre, String apellido, String mail, String contrasenia, TipoUsuario tipo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.mail = mail;
        this.contrasenia = contrasenia;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public TipoUsuario getTipo() {
        return tipo;
    }

    public void setTipo(TipoUsuario tipo) {
        this.tipo = tipo;
    }

    public boolean iniciarSesion(String mail, String contraseña) {
        if (mail.equals(this.mail)){
            if (contraseña.equals(this.contrasenia)){
                return true;
            } else {
                throw new ContraseniaIncorrectaE("Contraseña Incorrecta.");
            }
        } else {
            throw new UsuarioNoEncontradoE("Mail Incorrecto.");
        }
    }

    public void cerrarSesion() {
        //??????? como e
    }

    public boolean cambiarContrasenia(String Contraseña) {
        if (contrasenia.equals(this.contrasenia)){
            throw new ContraseniaIncorrectaE ("La contraseña ingresada es identica a la anterior. Ingrese una nueva.");
        } else {
            this.contrasenia = contrasenia;
            return true;
        }
    }
}
