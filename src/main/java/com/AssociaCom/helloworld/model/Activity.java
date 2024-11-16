package com.AssociaCom.helloworld.model;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Activity {
    private String associationFunctionalId;
    private String name;
    private String place;
    private String responsible;
    private  int numberParticipants;
    private LocalDate date;
    private String description;
}
