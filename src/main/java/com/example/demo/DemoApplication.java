package com.example.demo;

import com.example.demo.models.PlantInventoryEntry;
import com.example.demo.models.PlantInventoryEntryRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.math.BigDecimal;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(DemoApplication.class, args);
        PlantInventoryEntryRepository repository =ctx.getBean(PlantInventoryEntryRepository.class);

        PlantInventoryEntry plant= new PlantInventoryEntry();
        plant.setName("bike");
        plant.setDescription("nice and shine");
        plant.setPrice(BigDecimal.valueOf(100));

        repository.save(plant);

        System.out.println(repository.findAll());
    }

}
