/**
 * 
 */
package prd0001.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import prd0001.constants.ResourcePath;
import prd0001.constants.ResourcePath.CrudOperations;
import prd0001.entity.Users;
import prd0001.entity.Users;
import prd0001.service.UsersService;

/**
 * @author mahesh.kharote
 *
 */
@RestController
@RequestMapping(value = ResourcePath.USER)
public class UsersController {

	@Autowired
	private UsersService usersService;

	@RequestMapping(value = CrudOperations.ADD , method = RequestMethod.POST)
	public ResponseEntity<Users> add(@RequestBody Users user) {
		usersService.add(user);
		return new ResponseEntity<Users>(user, HttpStatus.OK);
	}
	
	@RequestMapping(value = CrudOperations.GET , method = RequestMethod.POST)
	public ResponseEntity<Users> get(@RequestBody Users user) {
		Users clientSend = usersService.get(user.getId());
		return new ResponseEntity<Users>(clientSend, HttpStatus.OK);
	}

	@RequestMapping(value = CrudOperations.LIST , method = RequestMethod.GET)
	public ResponseEntity<List<Users>> list() {
		return new ResponseEntity<List<Users>>(usersService.list(), HttpStatus.OK);
	}

	@RequestMapping(value = CrudOperations.DELETE , method = RequestMethod.POST)
	public void delete(@RequestBody Users user) {
		usersService.delete(user);
	}

	@RequestMapping(value = CrudOperations.UPDATE , method = RequestMethod.POST)
	public ResponseEntity<Users> update(@RequestBody Users user) {
		usersService.update(user);
		return new ResponseEntity<Users>(user, HttpStatus.OK);
	}


}
