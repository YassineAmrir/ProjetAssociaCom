package com.AssociaCom.helloworld.dao.repository;

import com.AssociaCom.helloworld.dao.entity.ContactUsEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactUsReository extends CrudRepository<ContactUsEntity,Long> {
}
