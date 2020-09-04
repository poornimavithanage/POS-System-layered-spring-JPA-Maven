package lk.ijse.dep.spring.jpa.pos.dao;

import lk.ijse.dep.spring.jpa.pos.entity.SuperEntity;

import java.io.Serializable;
import java.util.List;

public interface CrudDAO <T extends SuperEntity,ID extends Serializable> extends SuperDAO {

    List<T> findAll() throws Exception;

    T find(ID key) throws Exception;

    void save(T entity) throws Exception;

    void update(T entity) throws Exception;

    void delete(ID key) throws Exception;
}