package io.github.alvdelci.springarchitecture.carmaker;

public class Engine {
    private String model;
    private Integer horse;
    private Integer cylinders;
    private Double cylinderCapacity;
    private EngineType type;

    //Getters and Setters
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getHorse() {
        return horse;
    }

    public void setHorse(Integer horse) {
        this.horse = horse;
    }

    public Integer getCylinders() {
        return cylinders;
    }

    public void setCylinders(Integer cylinders) {
        this.cylinders = cylinders;
    }

    public Double getCylinderCapacity() {
        return cylinderCapacity;
    }

    public void setCylinderCapacity(Double cylinderCapacity) {
        this.cylinderCapacity = cylinderCapacity;
    }

    public EngineType getType() {
        return type;
    }

    public void setType(EngineType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "model='" + model + '\'' +
                ", horse=" + horse +
                ", cylinders=" + cylinders +
                ", cylinderCapacity=" + cylinderCapacity +
                ", type=" + type +
                '}';
    }
}
