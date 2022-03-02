package five.dao;

import five.entity.AbstractEntity;

import java.util.List;

/**
 * E -> unbounded
 * E-> bounded
 * <p>
 * <p>
 * Dao<String> dao = new NekiDao<>();
 *
 * @param <E>
 */
public interface Dao<E extends AbstractEntity> {

    /**
     * Create or INSERT statement
     *
     * @param entity
     */
    void save(E entity);


    /**
     * Retrieve or SELECT statement
     *
     * @param id
     * @return
     */
    E get(Integer id);

    List<E> getAll();

    /**
     * Update or UPDATE statement
     *
     * @param entity
     */
    void update(E entity);

    /**
     * Delete or DELETE statement
     * <li>DELETE</li>
     * <li>SOFT delete</li>
     *
     * @param entity
     */
    void delete(E entity);
}
