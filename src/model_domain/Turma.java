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
@Table(name="Turma")
public class Turma implements Serializable  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="CD_TURMA")
    private Integer codigoTurma;
    
    @Column(name="NM_TURMA")
    private String nomeTurma;
    
    @Column(name="INICIO_AULA")
    private String inicioAula;
    
    @Column(name="ANO_TURMA")
    private String anoTurma;
    
    @Column(name="TIPO_TURMA")
    private String tipoTurma;
    
    @Column(name="PERIOD_TURMA")
    private String periodoTurma;
    
    public Turma(){
    
    }

    public Integer getCodigoTurma() {
        return codigoTurma;
    }

    public void setCodigoTurma(Integer codigoTurma) {
        this.codigoTurma = codigoTurma;
    }

    public String getNomeTurma() {
        return nomeTurma;
    }

    public void setNomeTurma(String nomeTurma) {
        this.nomeTurma = nomeTurma;
    }

    public String getInicioAula() {
        return inicioAula;
    }

    public void setInicioAula(String inicioAula) {
        this.inicioAula = inicioAula;
    }

    public String getAnoTurma() {
        return anoTurma;
    }

    public void setAnoTurma(String anoTurma) {
        this.anoTurma = anoTurma;
    }

    public String getTipoTurma() {
        return tipoTurma;
    }

    public void setTipoTurma(String tipoTurma) {
        this.tipoTurma = tipoTurma;
    }

    public String getPeriodoTurma() {
        return periodoTurma;
    }

    public void setPeriodoTurma(String periodoTurma) {
        this.periodoTurma = periodoTurma;
    }

 
    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.codigoTurma);
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
        final Turma other = (Turma) obj;
        if (!Objects.equals(this.codigoTurma, other.codigoTurma)) {
            return false;
        }
        return true;
    }
    
    public void validar()throws ValidarException{
       if(this.nomeTurma == null || this.nomeTurma.equals("")){
          throw new ValidarException("Existe  campo em  branco");
       }
     }
    
}
