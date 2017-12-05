/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto.Controladores;

import Proyecto.Models.UsuarioEntity;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


/**
 *
 * @author enriq
 */
@ManagedBean(name = "login")
@SessionScoped
public class LoginController implements Serializable{
    
    private int id_usuario;
    private String nombre, apellido, correo, password;
    private boolean administrador;
    private final UsuarioEntity user = new UsuarioEntity();

    public String login() {
        if(user.loginControl(correo, password)){
            return "conferencias.xhtml?faces-redirect";
        }
        else{
            return "index.xhtml?face-redirect";
        }
    }
    
    public LoginController() {
    }

    public LoginController(int id_usuario, String nombre, String apellido, String correo, String password, boolean administrador) {
        this.id_usuario = id_usuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.password = password;
        this.administrador = administrador;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
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

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isAdministrador() {
        return administrador;
    }

    public void setAdministrador(boolean administrador) {
        this.administrador = administrador;
    }
    
    
}
