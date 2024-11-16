package com.AssociaCom.helloworld.dao.entity;

import jakarta.persistence.*;
import lombok.*;

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
    private String association;
    private String name;
    private String place;
    private String responsible;
    private  int numberParticipants;
    private LocalDate date;
    private String description;
}
