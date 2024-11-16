package com.AssociaCom.helloworld.dao.repository;

import com.AssociaCom.helloworld.dao.entity.AssociationRequestEntity;
import com.AssociaCom.helloworld.model.AssociationRequest;
import com.AssociaCom.helloworld.model.State;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AssociationRequestRepository extends CrudRepository<AssociationRequestEntity,Long> {

    Optional<AssociationRequestEntity> findByrequestId(String requestId);
}
