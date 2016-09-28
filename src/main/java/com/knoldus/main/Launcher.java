package com.knoldus.main;

import com.knoldus.providers.GreetingsProvider;
import com.knoldus.service.GreetingsService;

/**
 * Created by harmeet on 28/9/16.
 */
public class Launcher {

    public static void main(String... args) {
        GreetingsService service = GreetingsProvider.getInstance().serviceImpl();
        service.sayHello("Knoldus");
    }
}
