package com.login.controller;

import com.login.model.Usuario;
import com.login.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*") // Permite acesso de qualquer frontend (Next.js, por exemplo)
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    // Cadastro de novo usuário
    @PostMapping("/cadastro")
    public Usuario cadastrarUsuario(@RequestBody Usuario usuario) {
        return usuarioService.salvarUsuario(usuario);
    }

    // Login do usuário
    @PostMapping("/login")
    public String login(@RequestBody Usuario usuario) {
        Usuario usuarioEncontrado = usuarioService.buscarPorEmail(usuario.getEmail());

        if (usuarioEncontrado != null && usuarioEncontrado.getSenha().equals(usuario.getSenha())) {
            return "Login realizado com sucesso!";
        } else {
            return "E-mail ou senha inválidos!";
        }
    }
}
