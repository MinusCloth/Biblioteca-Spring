package dtos;

import entitys.UserEntity;

public class UserDTO {

    private Long id;
    private String nome;
    private String email;
    private String senha;

    public UserDTO(UserEntity entity){

        this.id=entity.getId();
        this.nome=entity.getNome();
        this.email=entity.getEmail();
        this.senha=entity.getSenha();

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
