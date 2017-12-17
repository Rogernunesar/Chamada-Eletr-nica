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
import model_domain.Usuario;
import model_dao.UsuarioDao;
import org.jdesktop.observablecollections.ObservableCollections;

/**
 *
 * @author rogerio
 */
public final class UsuarioControl {
    
    private final PropertyChangeSupport propertyChangeSupport = 
            new PropertyChangeSupport(this);
    
    private Usuario usuarioDigitado;
    
    private Usuario usuarioSelecionado;
    
    private List<Usuario> usuarioTabela;
    
    private UsuarioDao usuarioDao;
    
    public UsuarioControl(){
        usuarioDao = new UsuarioDao();
        usuarioTabela = ObservableCollections.observableList(new ArrayList<Usuario>());
      novo();
      pesquisar();
        
    }

    public void novo() {
       setUsuarioDigitado(new Usuario());
    }
    
    public void pesquisar() {
        usuarioTabela.clear();
        usuarioTabela.addAll(usuarioDao.pesquisar(usuarioDigitado));
    }
    
    public void salvar()throws ValidarException{
        usuarioDigitado.validar();
     usuarioDao.SalvarAtualizar(usuarioDigitado);
     novo();
     pesquisar();
    }
    
    public void excluir(){
    usuarioDao.excluir(usuarioDigitado);
    novo();
    pesquisar();
    }

    public Usuario getUsuarioDigitado() {
        return usuarioDigitado;
    }

    public void setUsuarioDigitado(Usuario usuarioDigitado) {
        Usuario oldUsuarioDigitado = this.usuarioDigitado;
        this.usuarioDigitado = usuarioDigitado;
        propertyChangeSupport.firePropertyChange(
        "usuarioDigitado",oldUsuarioDigitado,usuarioDigitado);
    }

    public Usuario getUsuarioSelecionado() {
        return usuarioSelecionado;
    }

    public void setUsuarioSelecionado(Usuario usuarioSelecionado) {
        this.usuarioSelecionado = usuarioSelecionado;
        if(this.usuarioSelecionado !=null){
           setUsuarioDigitado(usuarioSelecionado);
        }
    }

    public List<Usuario> getUsuarioTabela() {
        return usuarioTabela;
    }

    public void setUsuarioTabela(List<Usuario> usuarioTabela) {
        this.usuarioTabela = usuarioTabela; 
    }
    
    public void addPropertyChangeListener(PropertyChangeListener e){
      propertyChangeSupport.addPropertyChangeListener(e);
    }
    
    public void removePropertyChangeListener(PropertyChangeListener e){
      propertyChangeSupport.removePropertyChangeListener(e);
    }
    
    public UsuarioDao getUsuarioDao() {
        return usuarioDao;
    }

    public void setUsuarioDao(UsuarioDao usuarioDao) {
        this.usuarioDao = usuarioDao;
    }
    
    
    
}
