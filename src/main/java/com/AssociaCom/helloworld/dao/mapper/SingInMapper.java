package com.AssociaCom.helloworld.dao.mapper;

import com.AssociaCom.helloworld.dao.entity.SingInEntity;
import com.AssociaCom.helloworld.model.SingIn;
import org.springframework.stereotype.Component;

@Component
public class SingInMapper {

    public SingIn mapTo(SingInEntity authentication){
        return SingIn.builder()
                .email(authentication.getEmail())
                .password(authentication.getPassword())
                .associationName(authentication.getAssociationName())
                .build();

    }
    public SingInEntity mapTo(SingIn singIn)
    {
        return SingInEntity.builder()
                .password(singIn.getPassword())
                .email(singIn.getEmail())
                .associationName(singIn.getAssociationName())
               .build();
    }
}
