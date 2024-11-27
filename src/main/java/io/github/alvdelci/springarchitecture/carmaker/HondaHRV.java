package io.github.alvdelci.springarchitecture.carmaker;

import java.awt.*;

public class HondaHRV extends Car{
    public HondaHRV(Engine engine) {
        super(engine);
        setModel("HRV");
        setColour(Color.BLACK);
        setCarmaker(Carmaker.HONDA);
    }
}
