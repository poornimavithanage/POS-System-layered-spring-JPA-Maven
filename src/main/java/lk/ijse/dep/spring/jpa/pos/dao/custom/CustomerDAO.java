package lk.ijse.dep.spring.jpa.pos.dao.custom;

import lk.ijse.dep.spring.jpa.pos.dao.CrudDAO;
import lk.ijse.dep.spring.jpa.pos.entity.Customer;

public interface CustomerDAO extends CrudDAO<Customer,String> {

    String getLastCustomerId() throws Exception;

}
