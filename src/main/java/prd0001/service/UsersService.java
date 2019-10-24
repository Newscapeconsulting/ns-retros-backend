/**
 * 
 */
package prd0001.service;

import java.util.List;

import prd0001.entity.Users;

/**
 * @author mahesh.kharote
 *
 */
public interface UsersService {
	void add(Users user);
	List<Users> list();
	void delete(Users user);
	void update(Users user);
	Users get(long user_id);
}
