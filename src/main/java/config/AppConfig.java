package config;

import model.Country;
import model.Nationality;
import org.springframework.context.annotation.*;

/**
 * Created by osemenkova on 11/9/2016.
 */

@Configuration
@ComponentScan(basePackages = {"model"})
public class AppConfig {

    @Bean(name="myNationality")
    public Nationality getNationality(){
        Nationality nationality = new Nationality();
        nationality.setName("Ukrainian");
        nationality.setDescription("Ukrainians live in Ukraine");

        return nationality;
    }

    @Bean(name = "myCountry")
    @Lazy
    @Scope(value = "prototype")
    @DependsOn(value = "myNationality")
    public Country getCountry(){
        Country c = new Country();
        c.setName("Ukraine");
        c.setNationality(getNationality());
        return c;
    }
}
