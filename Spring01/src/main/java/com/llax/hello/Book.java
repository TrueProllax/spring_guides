package com.llax.hello;


public class Book {
    
    private Long id;
    private String header;
    private int countChapters;
    private String describe;

    public Book(Long id, String header, int countChapters, String describe) {
        this.id = id;
        this.header = header;
        this.countChapters = countChapters;
        this.describe = describe;
    }

    public Long getId() {
        return id;
    }

    public String getHeader() {
        return header;
    }

    public int getCountChapters() {
        return countChapters;
    }

    public String getDescribe() {
        return describe;
    }

}
