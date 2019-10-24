/**
 * 
 */
package prd0001.dao.impl;


import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import prd0001.dao.UsersDao;
import prd0001.entity.Users;

/**
 * @author mahesh.kharote
 *
 */
@Transactional
@Repository
public class UsersDaoImpl implements UsersDao {
	@PersistenceContext	
	private EntityManager entityManager;
	@Override
	public void add(Users user) {
		try {
			user.setAdded_at(new Date());
			user.setUpdated_at(new Date());			
			entityManager.persist(user);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Override
	public void update(Users user) {
		try {
			entityManager.merge(user);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	@Override
	public void delete(Users user) {
		try {
			entityManager.remove(entityManager.merge(user));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	@Override
	public Users get(long user_id) {
		try {
			return entityManager.find(Users.class, user_id);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}
	@SuppressWarnings("unchecked")
	@Override
	public List<Users> getAll() {
		String hql = "FROM Users";
		try {
			return (List<Users>) entityManager.createQuery(hql).getResultList();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}		
	}

}
