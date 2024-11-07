/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.std.ec.service.impl;

import com.std.ec.model.entity.Usuario;
import com.std.ec.repository.UsuarioRepository;
import com.std.ec.service.IUsuarioService;
import jakarta.ejb.EJB;
import jakarta.ejb.Stateless;
import java.util.List;

/**
 *
 * @author WALTER ROSERO
 */
@Stateless
public class UsuarioServiceImpl implements IUsuarioService {

    @EJB
    private UsuarioRepository usuarioRepository;

    @Override
    public Usuario guardar(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    @Override
    public Usuario editar(Usuario usuario) {
        return usuarioRepository.update(usuario);
    }

    @Override
    public void eliminar(Usuario usuario) {
        usuarioRepository.delete(usuario);
    }

    @Override
    public List<Usuario> listar() {
        return usuarioRepository.findAll();
    }

    @Override
    public List<Usuario> findAllNickName() {
        return usuarioRepository.findAllNickName();
    }

}
