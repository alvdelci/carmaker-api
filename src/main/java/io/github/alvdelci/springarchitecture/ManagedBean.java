package io.github.alvdelci.springarchitecture;

import io.github.alvdelci.springarchitecture.todos.TodoEntity;
import io.github.alvdelci.springarchitecture.todos.TodoValidator;
import org.springframework.beans.factory.annotation.Autowired;

public class ManagedBean {

    @Autowired
    private TodoValidator validator; //Injecao de dependencia via propriedade

    @Autowired //Injecao de dependencia via construtor (Recomendado)
    public ManagedBean(TodoValidator todoValidator) {
        this.validator = todoValidator;
    }

    public void use() {
        var todo = new TodoEntity();
        validator.validate(todo);
    }

    @Autowired //Injecao de dependencia via metodo setter
    public void setValidator(TodoValidator validator) {
        this.validator = validator;
    }
}
