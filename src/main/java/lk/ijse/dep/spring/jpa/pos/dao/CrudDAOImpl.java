package lk.ijse.dep.spring.jpa.pos.dao;

import lk.ijse.dep.spring.jpa.pos.entity.SuperEntity;

import javax.persistence.EntityManager;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

public abstract class CrudDAOImpl<T extends SuperEntity,ID extends Serializable>implements CrudDAO<T,ID> {

protected EntityManager entityManager;
private Class<T>entity;

    @Override
    public List<T> findAll() throws Exception {
        return entityManager.createQuery("FROM " + entity.getName()).getResultList();
    }

    @Override
    public T find(ID key) throws Exception {
        return entityManager.find(entity,key);
    }

    @Override
    public void save(T entity) throws Exception {
            entityManager.persist(entity);
    }

    @Override
    public void update(T entity) throws Exception {
        entityManager.merge(entity);
    }

    @Override
    public void delete(ID key) throws Exception {
        entityManager.remove(entityManager.getReference(entity,key));
    }

    public CrudDAOImpl(){
        entity=(Class<T>)(((ParameterizedType)(this.getClass().getGenericSuperclass())).getActualTypeArguments()[0]);
    }

    @Override
    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

}
