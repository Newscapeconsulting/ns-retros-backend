/**
 * 
 */
package prd0001.dao;

import java.util.List;

import prd0001.entity.Users;

/**
 * @author mahesh.kharote
 *
 */
public interface UsersDao {

	void add(Users user);
	void update(Users user);
	void delete(Users user);
	Users get(long user_id);
	List<Users> getAll();
}
