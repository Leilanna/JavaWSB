package pl.gda.wsb;

import java.time.Duration;
import java.time.LocalDate;
import java.util.Date;

public class Person {
    private String name;
    private String surname;
    private String dateofBirth;

    public Person(String name, String surname, String dateofBirth){
        this.name = name;
        this.surname = surname;
        this.dateofBirth = dateofBirth;
    }

    //public method to get the age variable
    public String getName(){
        return this.name;
    }

    //public method to set the age variable
    public void setName(String name){
        this.name = name;
    }
    //public method to get the age variable
    public String getSurname(){
        return this.surname;
    }

    //public method to set the age variable
    public void setSurname(String surname){
        this.surname = surname;
    }
    //public method to get the age variable
    public String getDateofBirth(){
        return this.dateofBirth;
    }

    //public method to set the age variable
    public void setDateofBirth(String dateofBirth){
        this.dateofBirth = dateofBirth;
    }

    public void howManyYears(){
        System.out.println(this.getSurname() + " is " + Duration.between(LocalDate.parse(getDateofBirth()).atStartOfDay(),LocalDate.now().atStartOfDay()).toDays() / 365 + " years old") ;
    }

    @Override
    public String toString(){
        return "Name and surname: " + getName() + " " + getSurname() + ", date of birth " + getDateofBirth();
    }
}
