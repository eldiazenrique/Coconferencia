/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto.Models;

import Proyecto.Entidades.Usuario;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author enriq
 */
public class UsuarioEntity {
    
    EntityManagerFactory emf;
    EntityManager em;

    public UsuarioEntity() {
        emf = Persistence.createEntityManagerFactory("Autentificaci_nJPAPU");
        em = emf.createEntityManager();
        em.getTransaction().begin();
    }
    
    public boolean loginControl (String correo, String password) {
        try {
            Usuario l = em.createNamedQuery("Usuario.control", Usuario.class).setParameter("correo", correo).setParameter("password", password).getSingleResult();
            if (l != null){
                return true;
            }
            return false;
        } catch (Exception e){
            return false;
        }
    }
    
    
}
