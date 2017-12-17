/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model_Control;

import Util.ValidarException;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;
import java.util.List;
import model_domain.Aluno;
import model_domain.Matricula;
import model_domain.Turma;
import model_dao.MatriculaDAO;
import org.jdesktop.observablecollections.ObservableCollections;

/**
 *
 * @author rogerio
 */
public final class MatriculaControl {
    
    private final PropertyChangeSupport propertyChangeSupport = 
            new PropertyChangeSupport(this);
    
    private  Matricula matriculaDigitado;
    
    private Matricula matriculaSelecionado;
    
    private List<Matricula> matriculaTabela;
    
    private List<Aluno>  alunoTabela;
    
    private List<Turma> turmaTabela;
    
    private MatriculaDAO matriculaDao;
    
    //private AlunoDao  alunoDao;
    
    public MatriculaControl(){
        matriculaDao = new MatriculaDAO();
        matriculaTabela = ObservableCollections.observableList( 
                new ArrayList<>()); 
        alunoTabela = ObservableCollections.observableList( 
                new ArrayList<>()); 
        alunoTabela.addAll(matriculaDao.buscarAluno());
        
        turmaTabela = ObservableCollections.observableList( 
                new ArrayList<>()); 
        turmaTabela.addAll(matriculaDao.buscarTurma());
        novo();
        pesquisar();
        
    }

    public void novo() {
       setMatriculaDigitado(new Matricula());
    }
    
    public void pesquisar() {
        matriculaTabela.clear();
        matriculaTabela.addAll(matriculaDao.pesquisar(matriculaDigitado));
    }
    
  /*  public void pesquisarAluno() {
       alunoTabela.clear();
        alunoTabela.addAll(alunoDao.pesquisar(alunoDigitado));
    }*/
    
    public void salvar()throws ValidarException{
        matriculaDigitado.validar();
     matriculaDao.SalvarAtualizar(matriculaDigitado);
     novo();
     pesquisar();
    }
    
    public void excluir(){
    matriculaDao.excluir(matriculaDigitado);
    novo();
    pesquisar();
    }

    public Matricula getMatriculaDigitado() {
        return matriculaDigitado;
    }

    public void setMatriculaDigitado(Matricula matriculaDigitado) {
        Matricula oldMatriculaDigitado = this.matriculaDigitado;
        this.matriculaDigitado = matriculaDigitado;
        propertyChangeSupport.firePropertyChange(
        "matriculaDigitado",oldMatriculaDigitado,matriculaDigitado);
    }

    public Matricula getMatriculaSelecionado() {
        return matriculaSelecionado;
    }

    public void setMatriculaSelecionado(Matricula matriculaSelecionado) {
        this.matriculaSelecionado = matriculaSelecionado;
        if(this.matriculaSelecionado !=null){
           setMatriculaDigitado(matriculaSelecionado);
        }
    }

    public List<Matricula> getMatriculaTabela() {
        return matriculaTabela;
    }

    public void setMatriculaTabela(List<Matricula> matriculaTabela) {
        this.matriculaTabela = matriculaTabela; 
    }
    
    public void addPropertyChangeListener(PropertyChangeListener e){
      propertyChangeSupport.addPropertyChangeListener(e);
    }
    
    public void removePropertyChangeListener(PropertyChangeListener e){
      propertyChangeSupport.removePropertyChangeListener(e);
    }
    
    public MatriculaDAO getMatriculaDao() {
        return matriculaDao;
    }

    public void setMatriculaDao(MatriculaDAO matriculaDao) {
        this.matriculaDao = matriculaDao;
    }

    public List<Aluno> getAlunoTabela() {
        return alunoTabela;
    }

    public void setAlunoTabela(List<Aluno> alunoTabela) {
        this.alunoTabela = alunoTabela;
    }

    public List<Turma> getTurmaTabela() {
        return turmaTabela;
    }

    public void setTurmaTabela(List<Turma> turmaTabela) {
        this.turmaTabela = turmaTabela;
    }
    
    
    
    
}
