package builderPattern;

import java.util.Optional;

public class Pet {
    private final String name;
    private final int age;
    private final double weight;
    private final String color;


    public static class Builder{
        //Required parameters
        private final String name;
        private final int age;

        //Optional parameters - initialized to default values
        private double weight = 0;
        private String color = "";

        public Builder(String name, int age){
            this.name = name;
            this.age = age;
        }

        public Builder weight(double value){
            weight = value;
            return this;
        }

        public Builder color(String value){
            color = value;
            return this;
        }

        public Pet build(){
            return new Pet(this);
        }
    }
    private Pet(Builder builder){
        name = builder.name;
        age = builder.age;
        weight = builder.weight;
        color = builder.color;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }
}
