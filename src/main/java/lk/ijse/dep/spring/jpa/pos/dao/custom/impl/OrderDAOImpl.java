package lk.ijse.dep.spring.jpa.pos.dao.custom.impl;

import lk.ijse.dep.spring.jpa.pos.dao.CrudDAOImpl;
import lk.ijse.dep.spring.jpa.pos.dao.custom.OrderDAO;
import lk.ijse.dep.spring.jpa.pos.entity.Order;
import org.springframework.stereotype.Component;

@Component
public class OrderDAOImpl extends CrudDAOImpl<Order,String>implements OrderDAO {

    public String getLastOrderId() throws Exception {
       return (String) entityManager.createQuery("SELECT o.id FROM Order o ORDER BY o.id DESC ").setMaxResults(1).getResultList().get(0);
    }


}
