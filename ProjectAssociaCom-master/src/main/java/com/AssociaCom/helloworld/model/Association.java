package com.AssociaCom.helloworld.model;

import lombok.*;

import java.time.LocalDate;
import java.util.UUID;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Association {

    private final String PREFIX = "asso-";
    private String functionalId = generateFunctionalId();


    private String name;
    private String description;
    private String email;
    private String phone;
    private State state ;
    //Todo : create Enum type
    private String type;
    private LocalDate creationDate;

    private President president;
    private String generateFunctionalId(){
        return PREFIX+ UUID.randomUUID();
    }
}
