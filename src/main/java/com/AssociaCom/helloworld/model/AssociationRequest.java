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
public class AssociationRequest {
    private Long id;

    private final String prefix = "req-";
    private String requestId = generateRequestId();
    private String associationFunctionalId;

    private LocalDate requestDate; // Request date
    private State status; // Request status
    private String requestType; // Type of request
    private String description; // Request description
    private LocalDate responseDate; // Response date
    private String comments; // Comments


    public String generateRequestId (){
        return prefix+ UUID.randomUUID();
    }
}
