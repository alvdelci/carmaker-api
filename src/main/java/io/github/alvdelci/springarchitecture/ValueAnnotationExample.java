package io.github.alvdelci.springarchitecture;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ValueAnnotationExample {

    @Value("${app.carmaker.defaultEngineHp}")
    private String variable;

    public void print() {
        System.out.println(this.variable);
    }
}
