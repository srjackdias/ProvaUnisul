package com.bancoProject.banco.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bancoProject.banco.dto.req.CreateUsuarioDto;
import com.bancoProject.banco.dto.res.ShowUsuarioDto;
import com.bancoProject.banco.services.UsuarioService;

@RestController
@RequestMapping("/usuarios")

public class UsuarioController {

    @Autowired

    UsuarioService usuarioService;

    @PostMapping
    public ResponseEntity<?> CreateUsuario(@RequestBody CreateUsuarioDto dto) {

        System.out.println(dto.getNome());
        System.out.println(dto.getSenha());
        System.out.println(dto.getTipo());

        System.out.println(dto.getCandidato().getTitulo());
        System.out.println(dto.getCandidato().getExperiencia());
        System.out.println(dto.getCandidato().getCidade());
        System.out.println(dto.getCandidato().getDescricao());
        System.out.println(dto.getCandidato().getFunçaoVaga());

        System.out.println(dto.getVaga().get(0).getNomeCandidato());
        System.out.println(dto.getVaga().get(0).getCidadeCandidato());
        System.out.println(dto.getCandidato().getDescricao());
        System.out.println(dto.getCandidato().getExperiencia());



        usuarioService.CreateUsuario(dto);

        return ResponseEntity.status(201).build();

    }

    @GetMapping

    public ResponseEntity<?> getAllusuarios() {

        List<ShowUsuarioDto> usuarios = usuarioService.getAllusuarios();

        return ResponseEntity.status(200).body(usuarios);

    }

}
