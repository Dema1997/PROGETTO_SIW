package it.uniroma3.siw.authtest.repository;


import org.springframework.data.repository.CrudRepository;
import it.uniroma3.siw.authtest.model.User;


public interface UserRepository extends CrudRepository<User,Long> {

}
