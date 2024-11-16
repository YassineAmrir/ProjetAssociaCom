package com.AssociaCom.helloworld.dao.repository;

import com.AssociaCom.helloworld.dao.entity.AssociationEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AssociationRepository extends CrudRepository<AssociationEntity,Long> {

  Optional<AssociationEntity> findByFunctionalId(String functionalId);
  Optional<AssociationEntity> findByNameAndEmail(String name,String email);


  Optional<AssociationEntity> findByEmail(String email);


  Optional<AssociationEntity> findByState(String etat);
  void deleteByFunctionalId(String functionalId);
}

