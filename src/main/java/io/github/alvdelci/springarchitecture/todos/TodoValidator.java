package io.github.alvdelci.springarchitecture.todos;

import org.springframework.stereotype.Component;

@Component
public class TodoValidator {

    private TodoRepository repository;

    public TodoValidator(TodoRepository todoRepository) {
        this.repository = todoRepository;
    }

    public void validate(TodoEntity todo) {
        if(descriptionAlreadyExists(todo.getDescription())) {
            throw new IllegalArgumentException("Already exist a todo with this description");
        }
    }

    public boolean descriptionAlreadyExists(String description) {
        return repository.existsByDescription(description);
    }
}
