package io.github.alvdelci.springarchitecture.todos;

import org.springframework.stereotype.Service;

@Service
public class TodoService {

    private TodoRepository repository;
    private TodoValidator validator;
    private MailSender mailSender;

    public TodoService(TodoRepository todoRepository, TodoValidator todoValidator, MailSender mailSender) {
    this.repository = todoRepository;
    this.validator = todoValidator;
    this.mailSender = mailSender;
    }

    public TodoEntity save(TodoEntity newTodo) {
        validator.validate(newTodo);
        return repository.save(newTodo);
    }

    public void updateTodoStatus(TodoEntity todo) {
        repository.save(todo);
        String status = todo.getDone() == Boolean.TRUE ? "Done" : "Pending";
        mailSender.send("Todo " + todo.getDescription() + " foi atualizado para " + status);
    }

    public TodoEntity findById(Integer id) {
        return repository.findById(id).orElse(null);
    }
}
