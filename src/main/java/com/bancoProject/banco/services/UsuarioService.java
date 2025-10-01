package com.bancoProject.banco.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bancoProject.banco.dto.req.CreateCandidatoDto;
import com.bancoProject.banco.dto.req.CreateUsuarioDto;
import com.bancoProject.banco.dto.req.CreateVagaDto;
import com.bancoProject.banco.dto.res.ShowCandidatoDto;
import com.bancoProject.banco.dto.res.ShowUsuarioDto;
import com.bancoProject.banco.dto.res.ShowVagaDto;
import com.bancoProject.banco.entities.CandidatoEntity;
import com.bancoProject.banco.entities.UsuarioEntity;
import com.bancoProject.banco.entities.VagaEntity;
import com.bancoProject.banco.repositories.CandidatoRepository;
import com.bancoProject.banco.repositories.UsuarioRepository;
import com.bancoProject.banco.repositories.VagaRepository;

@Service
public class UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;

    @Autowired
    CandidatoRepository candidatoRepository;

    @Autowired
    VagaRepository vagaRepository;

    public void CreateUsuario(CreateUsuarioDto dto) {

        UsuarioEntity usuarioEntity = new UsuarioEntity();
        usuarioEntity.setNome(dto.getNome());
        usuarioEntity.setSenha(dto.getSenha());
        usuarioEntity.setTipo(dto.getTipo());

        usuarioEntity = usuarioRepository.save(usuarioEntity);

        CandidatoEntity candidatoEntity = new CandidatoEntity();
        candidatoEntity.setTitulo(dto.getCandidato().getTitulo());
        candidatoEntity.setFunçaoVaga(dto.getCandidato().getFunçaoVaga());
        candidatoEntity.setCidade(dto.getCandidato().getCidade());
        candidatoEntity.setDescricao(dto.getCandidato().getDescricao());

        candidatoEntity.setUsuario(usuarioEntity);
        usuarioEntity.setCandidato(candidatoEntity);


        candidatoEntity = candidatoRepository.save(candidatoEntity);

        List<VagaEntity> VagasEntity = new ArrayList<>();

        for (CreateVagaDto vagaDTO : dto.getVaga()) {
            VagaEntity vagaEntity = new VagaEntity();
            vagaEntity.setNomeCandidato(vagaDTO.getNomeCandidato());
            vagaEntity.setCidadeCandidato(vagaDTO.getCidadeCandidato());
            vagaEntity.setFuncao(vagaDTO.getExperiencia());
            vagaEntity.setExperiencia(vagaDTO.getExperiencia());
            vagaEntity.setUsuario(usuarioEntity);

            VagasEntity.add(vagaEntity);
        }

        vagaRepository.saveAll(VagasEntity);

    }

    public List<ShowUsuarioDto> getAllusuarios(){
        List<UsuarioEntity> usuarioEntity = usuarioRepository.findAll();

        return usuarioEntity
                .stream()
                .map(usuario -> {
                    ShowUsuarioDto usuarioDto = new ShowUsuarioDto();
                    ShowCandidatoDto candidatoDto = new ShowCandidatoDto();
                    List<ShowVagaDto> vagasDto = new ArrayList<>();

                    
                     for (VagaEntity vagaEntity : usuario.getVaga()) {
                        ShowVagaDto vagaDto = new ShowVagaDto();
                        vagaDto.setNomeCandidato(vagaEntity.getNomeCandidato());
                        vagaDto.setCidadeCandidato(vagaEntity.getCidadeCandidato());
                        vagaDto.setFuncao(vagaEntity.getFuncao());
                        vagaDto.setExperiencia(vagaEntity.getExperiencia());

                        vagasDto.add(vagaDto);
                    }


                        candidatoDto.setTitulo(usuario.getCandidato().getTitulo());
                        candidatoDto.setFunçaoVaga(usuario.getCandidato().getFunçaoVaga());
                        candidatoDto.setCidade(usuario.getCandidato().getCidade());
                        candidatoDto.setDescricao(usuario.getCandidato().getDescricao());



                        usuarioDto.setId_usuario(usuario.getId_usuario());
                        usuarioDto.setNome(usuario.getNome());
                        usuarioDto.setSenha(usuario.getSenha());
                        usuarioDto.setTipo(usuario.getTipo());
                        usuarioDto.setCandidato(candidatoDto);
                        usuarioDto.setVaga(vagasDto);



                        return usuarioDto;


                }).toList();








                }











        
    }


