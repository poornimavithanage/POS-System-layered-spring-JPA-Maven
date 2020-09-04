package lk.ijse.dep.spring.jpa.pos.dao.custom;

import lk.ijse.dep.spring.jpa.pos.dao.SuperDAO;
import lk.ijse.dep.spring.jpa.pos.entity.CustomEntity;

public interface QueryDAO extends SuperDAO {

    CustomEntity getOrderDetail(String orderId) throws Exception;

    CustomEntity getOrderDetail2(String orderId) throws Exception;
}
