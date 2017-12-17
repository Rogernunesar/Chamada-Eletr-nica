/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model_dao;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.swing.JOptionPane;
import model_domain.Usuario;
import view.MenuView;


/**
 * 
 * @author rogerio
 */
public class LoginDAOTeste {
   MenuView menu = new MenuView();
   EntityManager em = Conexao.getEntityManager();
     private String userName;
     private String password;
     public LoginDAOTeste() { }
     
     
     public String validate() {
            
           Query q = em.createQuery("SELECT u FROM Usuario u WHERE u.nome_User = :nome_User AND u.senha = :senha");
           q.setParameter("nome_User", userName);
           q.setParameter("senha", password);
           
          try{
               Usuario usuario = (Usuario) q.getSingleResult();
              
               
              if(userName.equalsIgnoreCase(usuario.getNome_User())&&password.equals(usuario.getSenha())){
                 menu.setVisible(true);
                 }
             // if(userName.equalsIgnoreCase("")&&password.equals("")){
                // JOptionPane.showMessageDialog(null, "erro");
                // }
  
           }catch(Exception ex){      
                 JOptionPane.showMessageDialog(null, "Usuario ou Senha não conferem");
           }

          return null;
     }
     
     public String getUserName() { 
         return userName; 
     }
     
     public void setUserName(String userName) {
         this.userName=userName; 
     }
     
     public String getPassword() { 
         return password; 
     }
     
     public void setPassword(String password) { 
         this.password=password; 
     }

}
