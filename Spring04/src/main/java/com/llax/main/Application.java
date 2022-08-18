package com.llax.main;

import java.util.LinkedHashMap;
import org.springframework.web.client.RestTemplate;


public class Application {

    private static String search = "Apple";
    private static String APIkey = "a3433b5c70ce494b96c38617d99c12ba";
    private static String urlAPI = "https://newsapi.org/v2/everything?q="+search+"&apiKey="+APIkey;
    
    public static void main(String[] args) {
        RestTemplate restTemplate = new RestTemplate();
        ConvertToObject object = restTemplate.getForObject(urlAPI, ConvertToObject.class);
        System.out.println("------------------------ INFO ABOUT CONNECT ----------------------------");
        System.out.println("Status: " + object.getStatus());
        System.out.println("Count results: " + object.getTotalResults());
        System.out.println("------------------------------------------------------------------------");
        
        int numberArticle = 1;
        
        for (Object ob: object.getArticles()) {
            LinkedHashMap lhm = (LinkedHashMap) ob;
            //Page page = new Page();
            LinkedHashMap source = (LinkedHashMap) lhm.get("source");
            System.out.println("id: " + source.get("id"));
            System.out.println("name: " + source.get("name"));
//            System.out.println("Number : " + numberArticle);
//            System.out.println(page.getAuthor());
//            System.out.println(page.getTitle());
//            System.out.println(page.getDescription());
//            System.out.println(page.getURL());
            numberArticle++;
            if (numberArticle<=10)
                break;
        }

    }
}
