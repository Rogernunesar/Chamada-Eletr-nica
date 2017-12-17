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
import model_domain.Turma;
import model_dao.TurmaDao;
import org.jdesktop.observablecollections.ObservableCollections;

/**
 *
 * @author rogerio
 */
public final class TurmaControl {
    
    private final PropertyChangeSupport propertyChangeSupport = 
            new PropertyChangeSupport(this);
    
    private  Turma turmaDigitado;
    
    private Turma turmaSelecionado;
    
    private List<Turma> turmaTabela;
    
    private TurmaDao turmaDao;
    
    public TurmaControl(){
        turmaDao = new TurmaDao();
        turmaTabela = ObservableCollections.observableList( new ArrayList<Turma>());
      novo();
      pesquisar();
        
    }

    public void novo() {
       setTurmaDigitado(new Turma());
    }
    
    public void pesquisar() {
        turmaTabela.clear();
        turmaTabela.addAll(turmaDao.pesquisar(turmaDigitado));
    }
    
    public void salvar()throws ValidarException{
        turmaDigitado.validar();
     turmaDao.SalvarAtualizar(turmaDigitado);
     novo();
     pesquisar();
    }
    
    public void excluir(){
    turmaDao.excluir(turmaDigitado);
    novo();
    pesquisar();
    }

    public Turma getTurmaDigitado() {
        return turmaDigitado;
    }

    public void setTurmaDigitado(Turma turmaDigitado) {
        Turma oldTurmaDigitado = this.turmaDigitado;
        this.turmaDigitado = turmaDigitado;
        propertyChangeSupport.firePropertyChange(
        "turmaDigitado",oldTurmaDigitado,turmaDigitado);
    }

    public Turma getTurmaSelecionado() {
        return turmaSelecionado;
    }

    public void setTurmaSelecionado(Turma turmaSelecionado) {
        this.turmaSelecionado = turmaSelecionado;
        if(this.turmaSelecionado !=null){
           setTurmaDigitado(turmaSelecionado);
        }
    }

    public List<Turma> getTurmaTabela() {
        return turmaTabela;
    }

    public void setTurmaTabela(List<Turma> turmaTabela) {
        this.turmaTabela = turmaTabela; 
    }
    
    public void addPropertyChangeListener(PropertyChangeListener e){
      propertyChangeSupport.addPropertyChangeListener(e);
    }
    
    public void removePropertyChangeListener(PropertyChangeListener e){
      propertyChangeSupport.removePropertyChangeListener(e);
    }
    
    public TurmaDao getTurmaDao() {
        return turmaDao;
    }

    public void setTurmaDao(TurmaDao turmaDao) {
        this.turmaDao = turmaDao;
    }
    
    
    
}
