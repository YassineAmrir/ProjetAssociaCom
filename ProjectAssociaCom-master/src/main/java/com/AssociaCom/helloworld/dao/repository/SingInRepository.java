package com.AssociaCom.helloworld.dao.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SingInRepository extends CrudRepository<SingInEntity, Long> {

    Optional<SingInEntity> findByEmailAndPassword(String email,String password);
}
