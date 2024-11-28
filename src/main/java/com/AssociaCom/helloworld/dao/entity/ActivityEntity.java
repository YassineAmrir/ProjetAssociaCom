package com.AssociaCom.helloworld.dao.entity;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "activity")
public class ActivityEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "association_Functional_Id")
    private String associationFunctionalId;
    private String name;
    private String place;
    private String responsible;
    private  int numberParticipants;
    private LocalDate date;
    private String description;
}
