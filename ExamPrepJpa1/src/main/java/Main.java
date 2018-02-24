
import entity.Customer;
import facade.CustomerFacade;
import facade.Facade;
import facade.OrderFacade;
import java.util.HashMap;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zacky
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Remember to set database config under services :-)
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory( "ejpa1persistence" );
        EntityManager em = emf.createEntityManager();
        
        CustomerFacade cf = new CustomerFacade(em);
        OrderFacade of = new OrderFacade(em);
        
        /*
        // GET ALL CUSTOMERS
        List<Customer> cms = cf.getAllCustomers();
        cms.forEach((cm) -> {
            System.out.println(cm.getName());
        });
        */
        
        
        /*
        // Add Customer
        Customer customer = new Customer();
        customer.setName("Zakaria Ahmed");
        // email validering på vores entity :-)
        customer.setEmail("cph-za37@cphbusiness.dk");
        cf.saveCustomer(customer);
        */
        
        
    }
    
}
