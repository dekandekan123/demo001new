package com.example.demo;

import com.example.demo.models.PlantInventoryItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface plantInventoryItemRepostry extends
        JpaRepository<PlantInventoryItem,Long> {

}
