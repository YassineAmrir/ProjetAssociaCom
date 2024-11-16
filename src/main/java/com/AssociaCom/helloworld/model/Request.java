package com.AssociaCom.helloworld.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
public class Request {

    private String functionalId ;
    private LocalDateTime creationDate;
    private State state;

}
