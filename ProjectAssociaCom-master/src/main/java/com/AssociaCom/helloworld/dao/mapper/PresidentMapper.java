package com.AssociaCom.helloworld.dao.mapper;

import com.AssociaCom.helloworld.dao.entity.PresidentEntity;
import com.AssociaCom.helloworld.model.President;
import org.springframework.stereotype.Component;

@Component
public class PresidentMapper {

    // Todo : use lib mapStruct to refactor all this
    public President mapTo(PresidentEntity presidentEntity){
        return President.builder()
                .phone(presidentEntity.getPhone())
                .birthday(presidentEntity.getBirthday())
                .email(presidentEntity.getEmail())
                .firstName(presidentEntity.getFirstName())
                .lastName(presidentEntity.getLastName())
                .gender(presidentEntity.getGender())
                .build();
    }

    public PresidentEntity mapTo(President president){
        return PresidentEntity.builder()
                .phone(president.getPhone())
                .birthday(president.getBirthday())
                .email(president.getEmail())
                .firstName(president.getFirstName())
                .lastName(president.getLastName())
                .gender(president.getGender())
                .build();
    }
}
