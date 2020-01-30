package com.example.demo;

import com.example.demo.models.PlantInventoryEntry;
import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Entity
@Data

public class PurchaseOrder {
    // Replace startDate & endDate with a BusinessPeriod
    @Embedded
    BusinessPeriod rentalPeriod;

}
