/**
 * 
 */
package prd0001.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import prd0001.dao.UsersDao;
import prd0001.entity.Users;
import prd0001.service.UsersService;

/**
 * @author mahesh.kharote
 *
 */
@Service
public class UsersServiceImpl implements UsersService {

	//private static final Logger logger = LoggerFactory.getLogger(ClientServiceImpl.class);
	
	@Autowired
	private UsersDao usersDao;
	
	@Override
	public void add(Users user) {
		// TODO Auto-generated method stub
		try {
			usersDao.add(user);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//logger.error("Error while adding client: ", e);
			e.printStackTrace();
		}
	}

	@Override
	public List<Users> list() {
		try {
			return usersDao.getAll();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public void delete(Users user) {
		try {
			usersDao.delete(user);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void update(Users user) {
		try {
			usersDao.update(user);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public Users get(long user_id) {
		try {
			return usersDao.get(user_id);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	

}
