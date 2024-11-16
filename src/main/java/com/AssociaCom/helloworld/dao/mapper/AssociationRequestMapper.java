package com.AssociaCom.helloworld.dao.mapper;

import com.AssociaCom.helloworld.dao.entity.AssociationRequestEntity;
import com.AssociaCom.helloworld.model.Association;
import com.AssociaCom.helloworld.model.AssociationRequest;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class AssociationRequestMapper {
    public AssociationRequestEntity mapTo(AssociationRequest associationRequest)
    {
        return AssociationRequestEntity.builder()
                .requestDate(associationRequest.getRequestDate())
                .requestType(associationRequest.getRequestType())
                .associationFunctionalId(associationRequest.getAssociationFunctionalId())
                .comments(associationRequest.getComments())
                .description(associationRequest.getDescription())
                .responseDate(associationRequest.getResponseDate())
                .status(associationRequest.getStatus())
                .requestId(associationRequest.generateRequestId())
                .build();
    }

    public AssociationRequest mapTo(AssociationRequestEntity associationRequestEntity)
    {
        return AssociationRequest.builder()
                .associationFunctionalId(associationRequestEntity.getAssociationFunctionalId())
                .requestDate(associationRequestEntity.getRequestDate())
                .comments(associationRequestEntity.getComments())
                .requestType(associationRequestEntity.getRequestType())
                .description(associationRequestEntity.getDescription())
                .responseDate(associationRequestEntity.getResponseDate())
                .status(associationRequestEntity.getStatus())
                .requestId(associationRequestEntity.getRequestId())
                .build();
    }
}
