package com.example.demo.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
@Data

public class PlantInventoryEntry {
    @Id
    @GeneratedValue

    Long id;
    String Name;
    String Description;
    BigDecimal Price;
}
