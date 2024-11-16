package com.AssociaCom.helloworld.dao.entity;


import com.AssociaCom.helloworld.model.State;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name="associationrequest")
public class AssociationRequestEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String associationFunctionalId;
    private String requestId ;

    private LocalDate requestDate; // Request date
    @Enumerated(EnumType.STRING)
    private State status; // Request status
    private String requestType; // Type of request
    private String description; // Request description
    private LocalDate responseDate; // Response date
    private String comments; // Comments
}
