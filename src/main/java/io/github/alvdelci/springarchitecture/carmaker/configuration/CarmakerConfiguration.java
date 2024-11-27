package io.github.alvdelci.springarchitecture.carmaker.configuration;

import io.github.alvdelci.springarchitecture.carmaker.Engine;
import io.github.alvdelci.springarchitecture.carmaker.EngineType;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

//Classe de configuracoes para criar e registrar beans no spring container
@Configuration
public class CarmakerConfiguration {

    @Bean(name = "aspiratedEngine")
    public Engine aspiratedEngine() {
        var engine = new Engine();
        engine.setType(EngineType.ASPIRATED);
        engine.setModel("XPT-0");
        engine.setHorse(200);
        engine.setCylinders(4);
        engine.setCylinderCapacity(2.0);
        return engine;
    }

    @Primary //Indica que esse bean deve ser utilizado como padrao se nao for passado na injecao
    @Bean(name = "eletricEngine")
    public Engine eletricEngine() {
        var engine = new Engine();
        engine.setType(EngineType.ELETRIC);
        engine.setModel("ETH-40");
        engine.setHorse(200);
        engine.setCylinders(2);
        engine.setCylinderCapacity(1.0);
        return engine;
    }

    @Bean(name = "turboEngine")
    public Engine turboEngine() {
        var engine = new Engine();
        engine.setType(EngineType.TURBO);
        engine.setModel("THE-0");
        engine.setHorse(220);
        engine.setCylinders(4);
        engine.setCylinderCapacity(2.4);
        return engine;
    }
}
