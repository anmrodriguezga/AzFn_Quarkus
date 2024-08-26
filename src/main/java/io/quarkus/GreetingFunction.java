package io.quarkus;

import javax.inject.Inject;
import io.quarkus.funqy.Funq;

public class GreetingFunction {

    @Inject
    GreetingService gService;

    @Funq
    public String greeting(String name) {
        return gService.greeting(name);
    }

    @Funq
    public String funqyHello() {
        return "hello funqy";
    }

}