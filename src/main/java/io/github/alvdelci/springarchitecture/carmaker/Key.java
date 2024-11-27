package io.github.alvdelci.springarchitecture.carmaker;

public class Key {
    private Carmaker carmaker;
    private String type;

    //Getters and setters
    public Carmaker getCarmaker() {
        return carmaker;
    }

    public void setCarmaker(Carmaker carmaker) {
        this.carmaker = carmaker;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
