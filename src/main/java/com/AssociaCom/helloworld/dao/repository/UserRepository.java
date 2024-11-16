package com.AssociaCom.helloworld.dao.repository;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<UsersEntity,Long> {
    Optional<UsersEntity>findByUsername(String userName);
}
