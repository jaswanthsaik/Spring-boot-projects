package com.example.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Model {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    public Model() {
        // Default constructor
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Additional methods and relationships

    public static void main(String[] args) {
        // Create an instance of Model and perform desired operations
        Model model = new Model();
        model.setName("Example Model");

        // Access and modify other properties

        // Display the model's information
        System.out.println("Model ID: " + model.getId());
        System.out.println("Model Name: " + model.getName());
    }
}
