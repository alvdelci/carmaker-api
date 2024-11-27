package io.github.alvdelci.springarchitecture.carmaker.api;

import io.github.alvdelci.springarchitecture.carmaker.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("cars")
public class FactoryTestController {

    @Autowired
    @Qualifier("turboEngine")
//Isso é uma injecao de dependencia. Injetando o bean Engine, do configuration, para nao precisar instanciar.
    private Engine engine;

    @PostMapping
    public StatusCar connectCar(@RequestBody Key key) {
        Car car = new HondaHRV(engine);

        return car.ignite(key);
    }
}
