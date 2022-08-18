package com.llax.hello;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    
    public static final String template = "Hello, %s";
    public final AtomicLong counter = new AtomicLong();
    
    @RequestMapping ("/greeting")
    public Greeting greeting (@RequestParam(value="name", required = false, defaultValue = "World")String name) {
        return new Greeting (counter.incrementAndGet(), String.format(template,name));
    }
    
    public final AtomicLong counterBook = new AtomicLong();
    @RequestMapping ("/book")
    public Book book (@RequestParam(value="header", required = false, defaultValue = "Колобок")String header,
            @RequestParam(value="count", required = false, defaultValue = "1")int countChapters,
            @RequestParam(value="describe", required = false, defaultValue = "Пусто")String describe) {
        return new Book (counterBook.incrementAndGet(), header, countChapters, describe);
    }
    
}
