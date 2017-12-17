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
import model_domain.Matricula;
import model_domain.Turma;

/**
 *
 * @author rogerio
 */
public class MatriculaDAO {
    
    public void SalvarAtualizar(Matricula matricula){
     EntityManager em = Conexao.getEntityManager();
     em.getTransaction().begin();
     if(matricula.getCod_Matricula()!=null){
        matricula = em.merge(matricula);
      
     }
     em.persist(matricula);
     em.getTransaction().commit();
     em.close();
    }
    public void excluir(Matricula matricula){
     EntityManager em = Conexao.getEntityManager();
     em.getTransaction().begin();
     matricula = em.merge(matricula);
     em.remove(matricula);
     em.getTransaction().commit();
     em.close();
   }
    
        public List<Matricula> pesquisar(Matricula matricula){
     EntityManager em = Conexao.getEntityManager();
     StringBuilder sql = new StringBuilder("from  Matricula m where  1 = 1");
     
     if(matricula.getCod_Matricula()!=null){
        sql.append("and m.cod_Matricula = :codigo");
     }
     
     if(matricula.getAluno()!=null){
        sql.append("and m.codigo = :codigoAluno");
     }
     if(matricula.getTurma()!=null){
        sql.append("and m.codigo = :codigoTurma");
     }
     
    Query query = em.createQuery(sql.toString());
     if(matricula.getCod_Matricula()!=null){
        query.setParameter("cod_Matricula", matricula.getCod_Matricula()); 
     }
     if(matricula.getAluno()!=null){
        query.setParameter("codigoAluno", matricula.getAluno().getCodigo()); 
     }
     
     if(matricula.getTurma()!=null){
        query.setParameter("codigoTurma", matricula.getTurma().getCodigoTurma()); 
     }
     return query.getResultList();
    }
        
    public List<Aluno> buscarAluno(){
    AlunoDao alunoDao = new AlunoDao();
    return alunoDao.pesquisar(new Aluno());
    }
    
    public List<Turma> buscarTurma(){
    TurmaDao turmaDao = new TurmaDao();
    return turmaDao.pesquisar(new Turma());
    }
}
