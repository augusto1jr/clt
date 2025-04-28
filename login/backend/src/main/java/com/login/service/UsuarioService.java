package com.login.service;

import com.login.dao.UsuarioDAO;
import com.login.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioDAO usuarioDAO;

    public Usuario salvarUsuario(Usuario usuario) {
        return usuarioDAO.save(usuario);
    }

    public Optional<Usuario> buscarPorId(Integer id) {
        return usuarioDAO.findById(id);
    }

    public Usuario buscarPorEmail(String email) {
        return usuarioDAO.findByEmail(email);
    }

    public void deletarUsuario(Integer id) {
        usuarioDAO.deleteById(id);
    }
}
