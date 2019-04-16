package beans;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class Bean<T> implements BeanI<T> {
    @PersistenceContext(unitName = "fleetManagementSystem")
    EntityManager entityManager;


    @Override
    public T add(T t) {
        entityManager.persist(t);
        return null;
    }

    @Override
    public T edit(T t) {
        return null;
    }

    @Override
    public T findById(T t) {
        return null;
    }

    @Override
    public boolean remove(T t) {
        return false;
    }
}
