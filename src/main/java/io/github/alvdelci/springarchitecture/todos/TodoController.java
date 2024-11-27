package io.github.alvdelci.springarchitecture.todos;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("todos")
public class TodoController {
    private TodoService service;

    public TodoController(TodoService todoService) {
        this.service = todoService;
    }

    @PostMapping
    public TodoEntity save(@RequestBody TodoEntity todo) {
        try {
        return this.service.save(todo);
        } catch(IllegalArgumentException e) {
            var errorMessage = e.getMessage();
            throw new ResponseStatusException(HttpStatus.CONFLICT, errorMessage);
        }
    }

    @PutMapping("{id}")
    public void updateStatus(@PathVariable("id") Integer id, @RequestBody TodoEntity todo) {
        todo.setId(id);
        service.updateTodoStatus(todo);
    }

    @GetMapping("{id}")
    public TodoEntity findById(@PathVariable("id") Integer id) {
        return service.findById(id);
    }
}
