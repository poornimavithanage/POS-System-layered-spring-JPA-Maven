package lk.ijse.dep.spring.jpa.pos.dao.custom;

import lk.ijse.dep.spring.jpa.pos.dao.CrudDAO;
import lk.ijse.dep.spring.jpa.pos.entity.Order;

public interface OrderDAO extends CrudDAO<Order, String> {

    String getLastOrderId() throws Exception;

}
