package com.AssociaCom.helloworld.dao.mapper;

import com.AssociaCom.helloworld.dao.entity.AssociationEntity;
import com.AssociaCom.helloworld.model.Association;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class AssociationMapper {
    private PresidentMapper presidentMapper;

    public Association mapTo(AssociationEntity associationEntity){
        var president = presidentMapper.mapTo(associationEntity.getPresident());
        return Association.builder()
                .email(associationEntity.getEmail())
                .name(associationEntity.getName())
                .creationDate(associationEntity.getCreationDate())
                .phone(associationEntity.getPhone())
                .type(associationEntity.getType())
                .description(associationEntity.getDescription())
                .president(president)
                .state(associationEntity.getState())
                .functionalId(associationEntity.getFunctionalId())
                .build();
    }

    public AssociationEntity mapTo(Association association){
        var presidentEntity = presidentMapper.mapTo(association.getPresident());

        return AssociationEntity.builder()
                .email(association.getEmail())
                .name(association.getName())
                .creationDate(association.getCreationDate())
                .phone(association.getPhone())
                .type(association.getType())
                .president(presidentEntity)
                .description(association.getDescription())
                .state(association.getState())
                .functionalId(association.getFunctionalId())
                .build();
    }

}
