package com.edertaveira.musician.musiciancatalog.repository;

import com.edertaveira.musician.musiciancatalog.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {


}
