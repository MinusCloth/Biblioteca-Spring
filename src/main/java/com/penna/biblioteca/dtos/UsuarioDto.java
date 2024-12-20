package com.penna.biblioteca.dtos;

import com.penna.biblioteca.entities.UsuarioEntity;
import org.springframework.beans.BeanUtils;

public class UsuarioDto {

    private Long id;
    private String nome;
    private String email;
    private String senha;

    public UsuarioDto(UsuarioEntity usuario){
        BeanUtils.copyProperties(usuario,this);
    }


    public UsuarioDto( ) {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
