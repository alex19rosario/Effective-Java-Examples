package factoryStaticMethods;

import java.time.LocalDate;
import java.time.Period;

public class Person {

    private final String name;
    private final int age;

    private Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public static Person createPersonBasedOnAge(String name, int age){
        return new Person(name, age);
    }

    public static Person createPersonBasedOnDateOfBirth(String name, LocalDate dateOfBirth){
        LocalDate now = LocalDate.now();
        Period ageDifference = Period.between(dateOfBirth, now);
        int age = ageDifference.getYears();
        return new Person(name, age);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int hashCode(){
        int result = 17;
        result = 31 * result + name.hashCode();
        result = 31 * result + age;
        return result;
    }


}
