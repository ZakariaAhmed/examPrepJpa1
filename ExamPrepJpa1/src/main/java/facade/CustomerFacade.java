/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import entity.Customer;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author zacky
 */
public class CustomerFacade extends Facade{
    
    public CustomerFacade(EntityManager eManager) {
        super(eManager);
    }
    
     public Customer getCustomer(Long id) {
        return eManager.find(Customer.class, id);
    }

    public List<Customer> getAllCustomers() {
        Query query = eManager.createQuery("SELECT u FROM Customer u");
        return query.getResultList();
    }

    public void saveCustomer(Customer customer) {
        persist(customer);
    }
    
}
