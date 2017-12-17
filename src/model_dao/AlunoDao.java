/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model_dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import model_domain.Aluno;

/**
 *
 * @author rogerio
 */
public class AlunoDao {
    
    public void SalvarAtualizar(Aluno aluno){
     EntityManager em = Conexao.getEntityManager();
     em.getTransaction().begin();
     if(aluno.getCodigo() !=null){
         aluno = em.merge(aluno);
      
     }
     em.persist(aluno);
     em.getTransaction().commit();
     em.close();
    }
    public void excluir(Aluno aluno){
     EntityManager em = Conexao.getEntityManager();
     em.getTransaction().begin();
     aluno = em.merge(aluno);
     em.remove(aluno);
     em.getTransaction().commit();
     em.close();
   }
    
    public List<Aluno> pesquisar(Aluno aluno){
     EntityManager em = Conexao.getEntityManager();
     StringBuilder sql = new StringBuilder("from Aluno A where  1 = 1");
     
     if(aluno.getCodigo()!=null){
        sql.append("and A.codigo = :codigo");
     }
     if(aluno.getNome()!= null && 
             !aluno.getNome().equals("")){
         sql.append("and A.nome like :nome");
     }
    Query query = em.createQuery(sql.toString());
     if(aluno.getCodigo() !=null){
        query.setParameter("codigo", aluno.getCodigo()); 
     }
     if(aluno.getNome()!= null && 
         !aluno.getNome().equals("")){
         query.setParameter("nome","%"+aluno.getNome()); 
     } 
     return query.getResultList();
    }
}
