/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model_dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import model_domain.Usuario;

/**
 *
 * @author rogerio
 */
public class UsuarioDao {
    
    public void SalvarAtualizar(Usuario usuario){
     EntityManager em = Conexao.getEntityManager();
     em.getTransaction().begin();
     if(usuario.getCod_usuario()!=null){
         usuario = em.merge(usuario);
      
     }
     em.persist(usuario);
     em.getTransaction().commit();
     em.close();
    }
    public void excluir(Usuario usuario){
     EntityManager em = Conexao.getEntityManager();
     em.getTransaction().begin();
     usuario = em.merge(usuario);
     em.remove(usuario);
     em.getTransaction().commit();
     em.close();
   }
    
    public List<Usuario> pesquisar(Usuario usuario){
     EntityManager em = Conexao.getEntityManager();
     StringBuilder sql = new StringBuilder("from Usuario A where  1 = 1");
     
     if(usuario.getCod_usuario()!=null){
        sql.append("and A.codigo = :codigo");
     }
     if(usuario.getNome_User()!= null && 
             !usuario.getNome_User().equals("")){
         sql.append("and A.nome like :nome");
     }
    Query query = em.createQuery(sql.toString());
     if(usuario.getCod_usuario() !=null){
        query.setParameter("codigo", usuario.getCod_usuario()); 
     }
     if(usuario.getNome_User()!= null && 
         !usuario.getNome_User().equals("")){
         query.setParameter("nome","%"+usuario.getNome_User()); 
     } 
     return query.getResultList();
    }

    Usuario getUsuario() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
