/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

/**
 *
 * @author zacky
 */
public abstract class Facade {
    protected EntityManager eManager;

    public Facade(EntityManager eManager) {
        this.eManager = eManager;
    }

    protected void persist(Object entity) {
        EntityTransaction transaction = eManager.getTransaction();
        transaction.begin();
        eManager.persist(entity);
        eManager.flush();
        transaction.commit();
    }
    
}
