package model;

/**
 * Created by osemenkova on 11/9/2016.
 */
public class Country {

    private String name;
    private Nationality nationality;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Nationality getNationality() {
        return nationality;
    }

    public void setNationality(Nationality nationality) {
        this.nationality = nationality;
    }
}
