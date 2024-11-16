package com.AssociaCom.helloworld.dao.repository;

import com.AssociaCom.helloworld.dao.entity.PresidentEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PresidentRepository extends CrudRepository<PresidentEntity, Long> {

	 Optional<PresidentEntity> findByFirstName(String firstName);
}
