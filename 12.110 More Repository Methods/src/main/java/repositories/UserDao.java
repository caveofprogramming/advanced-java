package repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import entities.User;

@Repository
public interface UserDao extends CrudRepository<User, Long> {

}
