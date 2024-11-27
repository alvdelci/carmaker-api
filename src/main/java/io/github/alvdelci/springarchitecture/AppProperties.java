package io.github.alvdelci.springarchitecture;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "app.carmaker")
public class AppProperties {
    //Essa classe pode ser injetada e os valores dos application.yml utilizados
    private Integer defaultEngineHp;
    private String defaultColour;

    //Getters and setters
    public String getDefaultColour() {
        return defaultColour;
    }

    public void setDefaultColour(String defaultColour) {
        this.defaultColour = defaultColour;
    }

    public Integer getDefaultEngineHp() {
        return defaultEngineHp;
    }

    public void setDefaultEngineHp(Integer defaultEngineHp) {
        this.defaultEngineHp = defaultEngineHp;
    }

}
