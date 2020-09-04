package lk.ijse.dep.spring.jpa.pos.dao.custom;

import lk.ijse.dep.spring.jpa.pos.dao.CrudDAO;
import lk.ijse.dep.spring.jpa.pos.entity.Item;

public interface ItemDAO extends CrudDAO<Item, String> {

    String getLastItemCode() throws Exception;

}
