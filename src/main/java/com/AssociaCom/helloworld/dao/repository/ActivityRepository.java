package com.AssociaCom.helloworld.dao.repository;

import com.AssociaCom.helloworld.dao.entity.ActivityEntity;
import com.AssociaCom.helloworld.dao.entity.AssociationEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ActivityRepository extends CrudRepository<ActivityEntity,Long> {

    Iterable<ActivityEntity> findByAssociationFunctionalId(String functional_Id);

}
