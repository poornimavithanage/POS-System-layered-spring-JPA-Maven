package lk.ijse.dep.spring.jpa.pos.dao.custom.impl;

import lk.ijse.dep.spring.jpa.pos.dao.CrudDAOImpl;
import lk.ijse.dep.spring.jpa.pos.dao.custom.ItemDAO;
import lk.ijse.dep.spring.jpa.pos.entity.Item;
import org.springframework.stereotype.Component;

@Component
public class ItemDAOImpl extends CrudDAOImpl<Item,String>implements ItemDAO {


    public String getLastItemCode() throws Exception {
      //HQL
//        return (String) entityManager.createQuery("SELECT i.code FROM entity.Item i ORDER BY i.code DESC").
//                setMaxResults(1).getResultList().get(0);
        return (String)entityManager.createNativeQuery("SELECT code FROM Item ORDER BY code DESC LIMIT 1 ").getResultList().get(0);
    }


}
