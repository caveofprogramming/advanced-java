package app.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.entities.User;
import app.repositories.UserDao;

@Service
public class UserService {

	@Autowired
	private UserDao userDao;

	public List<User> getAll() {
		var list = new ArrayList<User>();

		userDao.findAll().forEach(u -> list.add(u));
		return list;
	}
}
