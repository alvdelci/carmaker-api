package io.github.alvdelci.springarchitecture;

import io.github.alvdelci.springarchitecture.todos.TodoEntity;
import io.github.alvdelci.springarchitecture.todos.TodoValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

@Lazy //So instancia o bean quando for chamado. O padrao e desabilitado, porque ao usar lazy os erros nao sao apontados ate que os beans sejam chamados
@Component
@Scope(BeanDefinition.SCOPE_SINGLETON)//padrao, instancia unica para toda a aplicacao
//@Scope(WebApplicationContext.SCOPE_REQUEST)//Tempo de vida baseado na requisicao
//@Scope(WebApplicationContext.SCOPE_SESSION)//Tempo de vida baseado na sessao do usuario
//@Scope(WebApplicationContext.SCOPE_APPLICATION)//Maior tempo de vida que o session
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
