package io.github.alvdelci.springarchitecture.carmaker.configuration;

import io.github.alvdelci.springarchitecture.carmaker.Engine;
import io.github.alvdelci.springarchitecture.carmaker.EngineType;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//Classe de configuracoes para criar e registrar beans no spring container
@Configuration
public class CarmakerConfiguration {

    @Bean
    public Engine engine() {
        var engine = new Engine();
        engine.setType(EngineType.ASPIRATED);
        engine.setModel("XPT-0");
        engine.setHorse(200);
        engine.setCylinders(4);
        engine.setCylinderCapacity(2.0);
        return engine;
    }
}
