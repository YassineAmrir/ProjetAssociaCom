package com.AssociaCom.helloworld.service;


import com.AssociaCom.helloworld.dao.entity.AssociationRequestEntity;
import com.AssociaCom.helloworld.dao.mapper.AssociationRequestMapper;
import com.AssociaCom.helloworld.dao.repository.AssociationRequestRepository;
import com.AssociaCom.helloworld.model.AssociationRequest;
import com.AssociaCom.helloworld.model.State;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Optional;

@AllArgsConstructor
@Service
public class AssociationRequestService {
    private static final Logger LOGGER = LogManager.getLogger(AssociationRequestService.class);
    private final AssociationRequestRepository associationRequestRepository;
    private final AssociationRequestMapper associationRequestMapper;
    private final LocalDate currentDate = LocalDate.now();

    public boolean createRequest(AssociationRequest associationRequest){
        try{
            associationRequest.setStatus(State.WAITING);
            AssociationRequestEntity associationRequestEntity=associationRequestMapper.mapTo(associationRequest);
            associationRequestEntity.setResponseDate(currentDate);
            associationRequestRepository.save(associationRequestEntity);
            return true;
        }
        catch (Exception exception)
        {
            LOGGER.error(exception.getMessage());
            return false;
        }
    }
    public boolean acceptRequest(String requestId){
        Optional<AssociationRequestEntity> associationRequest =associationRequestRepository.findByrequestId(requestId);
        if (associationRequest.isPresent())
        {
            AssociationRequestEntity associationRequestEntity= associationRequest.get();
            associationRequestEntity.setResponseDate(currentDate);
            associationRequestEntity.setStatus(State.ACCEPTED);
            associationRequestRepository.save(associationRequestEntity);
            return true;
        }
        else{
            Exception exception = new Exception();
            LOGGER.error(exception.getMessage());
            return false;}

    }
    public boolean requestRefused(String requestId){
        Optional<AssociationRequestEntity> associationRequest =associationRequestRepository.findByrequestId(requestId);
        if (associationRequest.isPresent())
        {
            AssociationRequestEntity associationRequestEntity= associationRequest.get();
            associationRequestEntity.setResponseDate(currentDate);
            associationRequestEntity.setStatus(State.REFUSED);
            associationRequestRepository.save(associationRequestEntity);
            return true;
        }
        else{
            Exception exception = new Exception();
            LOGGER.error(exception.getMessage());
            return false;}

    }

}
