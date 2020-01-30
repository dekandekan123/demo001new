package com.example.demo.models;
import com.example.demo.EquipmentCondition;
import com.example.demo.models.PlantInventoryEntry;
import lombok.Data;

import javax.persistence.*;


@Entity
@Data
public class PlantInventoryItem {


        @Id
        @GeneratedValue
        Long id;
        String SerialNumber;

        @Enumerated(EnumType.STRING)
        EquipmentCondition equipmentCondition;
        @ManyToOne
        EquipmentCondition eqiupmnetcondition ;
        PlantInventoryEntry plantinfo;

    }
