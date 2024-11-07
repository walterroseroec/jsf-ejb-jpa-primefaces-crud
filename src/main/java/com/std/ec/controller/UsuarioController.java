/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.std.ec.controller;

import com.std.ec.model.entity.Usuario;
import com.std.ec.service.IUsuarioService;
import jakarta.ejb.EJB;
import jakarta.faces.application.FacesMessage;
import jakarta.faces.context.FacesContext;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;
import java.io.Serializable;
import java.util.List;
import lombok.Getter;
import lombok.Setter;
import org.primefaces.PrimeFaces;

/**
 *
 * @author WALTER ROSERO
 */
@Getter
@Setter
@Named(value = "usuarioMB")
@ViewScoped
public class UsuarioController implements Serializable {

    @EJB
    private IUsuarioService usuarioService;

    private Usuario usuario;
    private List<Usuario> usuarios;

    public void nuevo() {
        usuario = new Usuario();
    }

    public List<Usuario> getUsuarios() {
        return usuarios = usuarioService.findAllNickName();
    }

    public void guardar() {
        if (usuario.getIdUsuario() == null) {
            usuarioService.guardar(usuario);
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Usuario agregado"));
        } else {
            usuarioService.editar(usuario);
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Usuario editado"));
        }
        nuevo();
        PrimeFaces.current().executeScript("PF('dlgUsuarioRegistro').hide()");
        PrimeFaces.current().ajax().update("form:messages ", "form:dt-usuarios");
    }

    public void eliminar() {
        usuarioService.eliminar(usuario);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Usuario eliminado"));
        PrimeFaces.current().executeScript("PF('dlgEliminarUsuario').hide()");
        PrimeFaces.current().ajax().update("form:messages ", "form:dt-usuarios");
    }
}
