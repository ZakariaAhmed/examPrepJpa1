/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import entity.Customer;
import entity.ItemType;
import entity.Order;
import entity.OrderLine;
import javax.persistence.EntityManager;

/**
 *
 * @author zacky
 */
public class OrderFacade extends Facade{
    
    public OrderFacade(EntityManager eManager) {
        super(eManager);
    }
    
    public void saveOrder(Order order, Long customerId) {
        Customer customer = eManager.find(Customer.class, customerId);
        order.setCustomer(customer);
        saveOrder(order);
    }

    public void saveOrder(Order order) {
        persist(order);
    }

    public Order getOrder(Long id) {
        return eManager.find(Order.class, id);
    }

    public void saveOrderLine(OrderLine orderLine) {
        persist(orderLine);
    }

    public void saveItemType(ItemType itemType) {
        persist(itemType);
    }

    public double getTotalPrice(Order order) {
        double totalPrice = 0;
        totalPrice = order.getOrderLines().stream().map((orderLine) -> orderLine.getQuantity() * orderLine.getItemType().getPrice()).reduce(totalPrice, (accumulator, _item) -> accumulator + _item);
        return totalPrice;
    }
    
}
