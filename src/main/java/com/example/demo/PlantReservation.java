package com.example.demo;

import com.example.demo.models.PlantInventoryItem;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data

public class PlantReservation {

    @Id
    @GeneratedValue
    Long id;
    @Embedded
    BusinessPeriod schedule;
    @ManyToOne
    PlantInventoryItem plant;

}
