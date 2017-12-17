/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model_dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import model_domain.Turma;

/**
 *
 * @author rogerio
 */
public class TurmaDao {
    
    public void SalvarAtualizar(Turma turma){
     EntityManager em = Conexao.getEntityManager();
     em.getTransaction().begin();
     if(turma.getCodigoTurma()!=null){
         turma = em.merge(turma);
      
     }
     em.persist(turma);
     em.getTransaction().commit();
     em.close();
    }
    public void excluir(Turma turma){
     EntityManager em = Conexao.getEntityManager();
     em.getTransaction().begin();
     turma = em.merge(turma);
     em.remove(turma);
     em.getTransaction().commit();
     em.close();
   }
    
    public List<Turma> pesquisar(Turma turma){
     EntityManager em = Conexao.getEntityManager();
     StringBuilder sql = new StringBuilder("from Turma A where  1 = 1");
     
     if(turma.getCodigoTurma()!=null){
        sql.append("and A.codigo = :codigo");
     }
     if(turma.getNomeTurma()!= null && 
             !turma.getNomeTurma().equals("")){
         sql.append("and A.nome like :nome");
     }
    Query query = em.createQuery(sql.toString());
     if(turma.getCodigoTurma()!=null){
        query.setParameter("codigo", turma.getCodigoTurma()); 
     }
     if(turma.getNomeTurma()!= null && 
         !turma.getNomeTurma().equals("")){
         query.setParameter("nome","%"+turma.getNomeTurma()); 
     } 
     return query.getResultList();
    }
}
