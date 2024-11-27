package io.github.alvdelci.springarchitecture.carmaker;

import java.awt.*;

public class Car {
    private String model;
    private Color colour;
    private Engine engine;
    private Carmaker carmaker;

    public Car(Engine engine) {
        this.engine = engine;
    }

    //Getters and setters
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Color getColour() {
        return colour;
    }

    public void setColour(Color colour) {
        this.colour = colour;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Carmaker getCarmaker() {
        return carmaker;
    }

    public void setCarmaker(Carmaker carmaker) {
        this.carmaker = carmaker;
    }
}
