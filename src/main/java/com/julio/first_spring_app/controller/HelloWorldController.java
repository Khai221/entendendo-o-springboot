package com.julio.first_spring_app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// Aqui estou definindo com uma anotação @ do springboot que minha classe vai ser um controlador REST.
@RestController
@RequestMapping("/hello-world") // A rota /hello-world, mais especificamente "http://localhost:8080/hello-world",
// é definida por essa anotação na minha classe.
// Básicamente estou dizendo pro servidor "Tomcat", "Quando alguém acessar "/hello-world", chame a minha classe para responder".
// O servidor recebe uma requisição:
// O servidor (spring boot com Tomcat) está escutando as requisições que chegam na porta 8080. Quando alguém faz uma
// requisição para "http://localhost:8080/hello-world", o servidor intercepta essa requisição.

// O servidor olha para a sua configuração e vê que a rota /hello-world está mapeada para a sua classe HelloWorldController.
// Então, ele chama o método helloWorld() da sua classe controladora para processar essa requisição.
public class HelloWorldController {

    @GetMapping // estou definindo o método get, para o servidor me mandar a informação "hello world" na porta /hello-world.
    public String helloWorld(){
        // O método helloWorld() retorna a string "Hello World!", que é a resposta que o servidor vai enviar de volta ao cliente
        //  por eu ter usado o método GET.
        return "<h1>Hello World!</h1>";
    }
}
