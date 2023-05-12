package org.example;

import builderPattern.Pet;
import eliminateObjects.Stack;
import factoryStaticMethods.Person;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        /*Person person1 = Person.createPersonBasedOnAge("Carlos", 25);
        Person person2 = Person.createPersonBasedOnDateOfBirth("Yudelka", LocalDate.of(1974, 9, 17));
        Pet pet1 = new Pet.Builder("Scony", 9).build();
        int[] numbers = new int[10];


        Pet pet2 = new Pet.Builder("Kimba", 8)
                .weight(4.3)
                .color("white")
                .build();

        System.out.println(String.format("%s is %s years old", person1.getName(), person1.getAge()));
        System.out.println(String.format("%s is %s years old", person2.getName(), person2.getAge()));
        System.out.println(String.format("%s is %s years old", pet1.getName(), pet2.getAge()));
        System.out.println(String.format("%s is %s years old, he weighs %s lb, and he is %s ",
                pet2.getName(), pet2.getAge(), pet2.getWeight(), pet2.getColor()));*/

        /*Integer number = 5;
        String name = "Carlos";
        String name2 = "Carlos";

        System.out.println(number.hashCode());
        System.out.println(name.hashCode());
        System.out.println(name.hashCode() == name2.hashCode());
        Person p1 = Person.createPersonBasedOnAge("Carlos", 25);
        Person p2 = Person.createPersonBasedOnAge("Carlos", 25);
        System.out.println(p1.hashCode() == p2.hashCode());*/
        /*List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(6);
        displayElements(list);*/
        System.out.println(cardinal(107, 142, 1));
    }

    public static void displayElements(List<?> list){
        list.forEach(x -> System.out.println(x));
    }

    public static int sum(int x0, int x1, int step){
        int sum = 0;
        for(int i = x0; i <= x1; i = i + step){
            sum += i;
        }
        return sum;
    }

    public static int cardinal(int x0, int x1, int step){
        int cardinal = 0;
        for(int i = x0; i <= x1; i += step){
            cardinal++;
        }
        return cardinal;
    }
}