package com.project.server.repository;

import com.project.server.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserDao extends CrudRepository<User,Long> {
    Optional<User> findByUserNameIgnoreCase(String username);
    User findByUserName(String userName);
}
