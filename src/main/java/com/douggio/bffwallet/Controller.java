package com.douggio.bffwallet;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class Controller {

    @GetMapping("/hello-reactive")
    public Mono<String> helloReactiveWorld() {
        return Mono.just("Hello reactive world!");
    }

    @GetMapping("/")
    public Mono<String> helloDefault() {
        return Mono.just("Teste teste teste");
    }
}
