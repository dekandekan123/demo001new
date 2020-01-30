package com.example.demo;

import com.example.demo.models.PlantInventoryEntry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;


@Repository
public interface InventoryRepositry extends JpaRepository<PlantInventoryEntry,Long>, CustomInventoryRepository {

}
