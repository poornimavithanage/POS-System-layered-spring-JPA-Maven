package lk.ijse.dep.spring.jpa.pos.dao;

import javax.persistence.EntityManager;

public interface SuperDAO {
    public void setEntityManager(EntityManager entityManager);

}
