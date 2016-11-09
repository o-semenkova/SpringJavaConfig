package main;

import config.AppConfig;
import model.Country;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by osemenkova on 11/9/2016.
 */
public class TestMainApp {
    public static void main(String[] args){
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        Country country = (Country) ctx.getBean("myCountry");
        String name = country.getName();
        System.out.println(name);
        String nationality = country.getNationality().getName();
        String description = country.getNationality().getDescription();
        System.out.println(nationality);
        System.out.println(description);
    }


}
