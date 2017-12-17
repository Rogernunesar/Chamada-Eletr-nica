/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model_domain;


import Util.ValidarException;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author rogerio
 */
@Entity
@Table(name="Aluno")
public class Aluno implements Serializable  {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="CD_ALUNO")
    private Integer codigo;
    
    @Column(name="NM_ALUNO",length = 255, nullable = false)
    private String nome;
    
    @Column(name="NASC_ALUNO")
    private String nasc;
    
    @Column(name="RG_ALUNO")
    private String rg;
    
    @Column(name="RESP_ALUNO")
    private String responsavel;
    
    @Column(name="FONE_ALUNO")
    private String fone;
    
    public Aluno(){
    
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        Integer oldCodigo = this.codigo;
        this.codigo = codigo;
        changeSupport.firePropertyChange("codigo", oldCodigo, codigo);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        String oldNome = this.nome;
        this.nome = nome;
        changeSupport.firePropertyChange("nome", oldNome, nome);
    }

    public String getNasc() {
        return nasc;
    }

    public void setNasc(String nasc) {
        String oldNasc = this.nasc;
        this.nasc = nasc;
        changeSupport.firePropertyChange("nasc", oldNasc, nasc);
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        String oldRg = this.rg;
        this.rg = rg;
        changeSupport.firePropertyChange("rg", oldRg, rg);
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        String oldResponsavel = this.responsavel;
        this.responsavel = responsavel;
        changeSupport.firePropertyChange("responsavel", oldResponsavel, responsavel);
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        String oldFone = this.fone;
        this.fone = fone;
        changeSupport.firePropertyChange("fone", oldFone, fone);
    }
    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.codigo);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Aluno other = (Aluno) obj;
        if (!Objects.equals(this.codigo, other.codigo)) {
            return false;
        }
        return true;
    }
    
    public void validar()throws ValidarException{
       if(this.nome == null || this.nome.equals("")){
          throw new ValidarException("Existe  campo em  branco");
       }else if(this.nasc == null || this.nasc.equals("")){
          throw new ValidarException("Existe  campo em  branco");
       }
     }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
