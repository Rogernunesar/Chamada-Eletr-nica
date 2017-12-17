/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model_domain;


import Util.ValidarException;
import java.io.Serializable;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author rogerio
 */
@Entity
@Table(name="Matricula")
public class Matricula implements Serializable  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="COD_MAT")
    private Integer cod_Matricula;
    
    @ManyToOne
    @JoinColumn(name="Fk_ALUNO",nullable=false)
    private Aluno aluno;

    @ManyToOne
   @JoinColumn(name="FK_TURMA",nullable=true)
    private Turma turma;
    
    @Column(name="DATA_MAT")
    private String dataMatricula;
    
    @Column(name="NUM_CHAM")
    private Integer num_chamada ;

    
    public Matricula(){
    
    }

    public Integer getCod_Matricula() {
        return cod_Matricula;
    }

    public void setCod_Matricula(Integer cod_Matricula) {
        this.cod_Matricula = cod_Matricula;
    }
    
      public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public String getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(String dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    public Integer getNum_chamada() {
        return num_chamada;
    }

    public void setNum_chamada(Integer num_chamada) {
        this.num_chamada = num_chamada;
    }

    @Override
    public int hashCode() {
        int hash = 5;
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
        final Matricula other = (Matricula) obj;
        if (!Objects.equals(this.cod_Matricula, other.cod_Matricula)) {
            return false;
        }
        return true;
    }
  
    public void validar()throws ValidarException{
       if(this.getNum_chamada()== null || this.getNum_chamada().equals("")){
          throw new ValidarException("Existe  campo em  branco");
       }
     }

    
}
