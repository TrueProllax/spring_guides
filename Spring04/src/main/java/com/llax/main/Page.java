
package com.llax.main;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//@JsonIgnoreProperties(ignoreUnknown = true)
// @JsonIgnoreProperties библиотеки обработки JSON Jackson, которая показывает, 
// что любые поля, не связанные с полями класса, должны быть проигнорированы

public class Page {
    
    private String author;
    private String title;
    private String description;
    private String URL;
    
    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getURL() {
        return URL;
    }
    
}
