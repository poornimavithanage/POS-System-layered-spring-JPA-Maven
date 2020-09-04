package lk.ijse.dep.spring.jpa.pos.business.custom;

import lk.ijse.dep.spring.jpa.pos.business.SuperBO;
import lk.ijse.dep.spring.jpa.pos.util.OrderDetailTM;
import lk.ijse.dep.spring.jpa.pos.util.OrderTM;

import java.util.List;

public interface OrderBO extends SuperBO {

    public String getNewOrderId() throws Exception;

    public void placeOrder(OrderTM order, List<OrderDetailTM> orderDetails)throws Exception;


}
