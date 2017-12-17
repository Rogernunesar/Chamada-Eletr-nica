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
import model_dao.AlunoDao;
import org.jdesktop.observablecollections.ObservableCollections;

/**
 *
 * @author rogerio
 */
public final class AlunoControl {
    
    private final PropertyChangeSupport propertyChangeSupport = 
            new PropertyChangeSupport(this);
    
    private  Aluno alunoDigitado;
    
    private Aluno alunoSelecionado;
    
    private List<Aluno> alunoTabela;
    
    private AlunoDao alunoDao;
    
    public AlunoControl(){
        alunoDao = new AlunoDao();
        alunoTabela = ObservableCollections.observableList( new ArrayList<Aluno>());
      novo();
      novo();
      pesquisar();
        
    }

    public void novo() {
       setAlunoDigitado(new Aluno());
    }
    
    public void pesquisar() {
        alunoTabela.clear();
        alunoTabela.addAll(alunoDao.pesquisar(alunoDigitado));
    }
    
    public void salvar()throws ValidarException{
        alunoDigitado.validar();
     alunoDao.SalvarAtualizar(alunoDigitado);
     novo();
     pesquisar();
    }
    
    public void excluir(){
    alunoDao.excluir(alunoDigitado);
    novo();
    pesquisar();
    }

    public Aluno getAlunoDigitado() {
        return alunoDigitado;
    }

    public void setAlunoDigitado(Aluno alunoDigitado) {
        Aluno oldAlunoDigitado = this.alunoDigitado;
        this.alunoDigitado = alunoDigitado;
        propertyChangeSupport.firePropertyChange(
        "alunoDigitado",oldAlunoDigitado,alunoDigitado);
    }

    public Aluno getAlunoSelecionado() {
        return alunoSelecionado;
    }

    public void setAlunoSelecionado(Aluno alunoSelecionado) {
        this.alunoSelecionado = alunoSelecionado;
        if(this.alunoSelecionado !=null){
           setAlunoDigitado(alunoSelecionado);
        }
    }

    public List<Aluno> getAlunoTabela() {
        return alunoTabela;
    }

    public void setAlunoTabela(List<Aluno> alunoTabela) {
        this.alunoTabela = alunoTabela; 
    }
    
    public void addPropertyChangeListener(PropertyChangeListener e){
      propertyChangeSupport.addPropertyChangeListener(e);
    }
    
    public void removePropertyChangeListener(PropertyChangeListener e){
      propertyChangeSupport.removePropertyChangeListener(e);
    }
    
    public AlunoDao getAlunoDao() {
        return alunoDao;
    }

    public void setAlunoDao(AlunoDao alunoDao) {
        this.alunoDao = alunoDao;
    }
    
    
    
}
