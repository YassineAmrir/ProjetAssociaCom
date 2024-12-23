package com.AssociaCom.helloworld.dao.mapper;

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
