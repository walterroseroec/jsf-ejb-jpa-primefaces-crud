/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.std.ec.service;

import com.std.ec.model.entity.Usuario;
import jakarta.ejb.Local;
import java.util.List;

/**
 *
 * @author WALTER ROSERO
 */
@Local
public interface IUsuarioService {

    Usuario guardar(Usuario usuario);

    Usuario editar(Usuario usuario);

    void eliminar(Usuario usuario);

    List<Usuario> listar();
    
    List<Usuario> findAllNickName();

}
