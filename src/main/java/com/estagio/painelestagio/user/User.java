package com.estagio.painelestagio.user;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "TB_USER")
public class User {
    @Id
    @SequenceGenerator(
        name = "user_sequence",
        sequenceName = "user_sequence",
        allocationSize =  1
    )
    @GeneratedValue(
        strategy = GenerationType.SEQUENCE,
        generator = "user_sequence"
    )
    private Long id;
    private String nome;
    private String matricula;
    // private String senha;
    private String fonetico;
    private String setor;
    private String cnpj;
    private String razao_social;
    private LocalDate ultimo_acesso;
    private Integer status;

    // private Long perfil;
    // private Long empresa;
    // private Long atende_a;
    public User() {
    }

    public User(Long id, String nome, String matricula, String fonetico, String setor, String cnpj, String razao_social,
            LocalDate ultimo_acesso, Integer status) {
        this.id = id;
        this.nome = nome;
        this.matricula = matricula;
        this.fonetico = fonetico;
        this.setor = setor;
        this.cnpj = cnpj;
        this.razao_social = razao_social;
        this.ultimo_acesso = ultimo_acesso;
        this.status = status;
    }

    public User(String nome, String matricula, String fonetico, String setor, String cnpj, String razao_social,
            LocalDate ultimo_acesso, Integer status) {
        this.nome = nome;
        this.matricula = matricula;
        this.fonetico = fonetico;
        this.setor = setor;
        this.cnpj = cnpj;
        this.razao_social = razao_social;
        this.ultimo_acesso = ultimo_acesso;
        this.status = status;
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

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getFonetico() {
        return fonetico;
    }

    public void setFonetico(String fonetico) {
        this.fonetico = fonetico;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazao_social() {
        return razao_social;
    }

    public void setRazao_social(String razao_social) {
        this.razao_social = razao_social;
    }

    public LocalDate getUltimo_acesso() {
        return ultimo_acesso;
    }

    public void setUltimo_acesso(LocalDate ultimo_acesso) {
        this.ultimo_acesso = ultimo_acesso;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "User [cnpj=" + cnpj + ", fonetico=" + fonetico + ", id=" + id + ", matricula=" + matricula + ", nome="
                + nome + ", razao_social=" + razao_social + ", setor=" + setor + ", status=" + status
                + ", ultimo_acesso=" + ultimo_acesso + "]";
    }

    

}
