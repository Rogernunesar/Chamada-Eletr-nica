/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model_domain;


import Util.ValidarException;
import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author rogerio
 */
@Entity
@Table(name="Usuario")
public class Usuario implements Serializable  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="CD_LOGIN")
    private Integer cod_usuario;
    
    @Column(name="NM_USER")
    private String nome_User;
    
    @Column(name="SENHA_USER")
    private String senha;
    
    @Column(name="FUNCAO")
    private String funcao;

    public Usuario(){
    
    }

    
    public Integer getCod_usuario() {
        return cod_usuario;
    }

    public void setCod_usuario(Integer cod_usuario) {
        this.cod_usuario = cod_usuario;
    }

    public String getNome_User() {
        return nome_User;
    }

    public void setNome_User(String nome_User) {
        this.nome_User = nome_User;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Usuario other = (Usuario) obj;
        if (!Objects.equals(this.cod_usuario, other.cod_usuario)) {
            return false;
        }
        return true;
    }

     public void validar()throws ValidarException{
       if(this.getNome_User()== null || this.getNome_User().equals("")){
          throw new ValidarException("Existe  campo em  branco");
       }
       
}

     
}
