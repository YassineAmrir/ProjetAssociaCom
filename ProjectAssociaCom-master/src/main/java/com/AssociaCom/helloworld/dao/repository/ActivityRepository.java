package com.AssociaCom.helloworld.dao.repository;

import com.AssociaCom.helloworld.dao.entity.ActivityEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ActivityRepository extends CrudRepository<ActivityEntity,Long> {

    List<ActivityEntity> findByAssociation(String association);

}
