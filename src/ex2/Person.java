package ex2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Person {
    private String name;
    private int age;
    private String hairType;
    private String eyeColor;
    private static Map<String, Integer> nameAge = new HashMap<>();
    private static List<Person> people = new ArrayList<>();
    private static Map<String, String> hairName = new HashMap<>();

    public Person(String name, int age, String hairType, String eyeColor) {
        this.name = name;
        this.age = age;
        this.hairType = hairType;
        this.eyeColor = eyeColor;
        people.add(this);
        nameAge.put(name, age);
        hairName.put(hairType, name);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static List<String> getListName() {
        List<String> names = new ArrayList<>();
        for (Person person : people) {
            names.add(person.getName());
        }
        return names;
    }

    public static Map<String, Integer> getMapNameAge() {
        return nameAge;
    }

    public static List<String> getNameFromAge(int ageToHave){
        List<String> nameFromAge = new ArrayList<>();
        for(Person person :  people){
            if(person.getAge() > ageToHave){
                nameFromAge.add(person.getName());
            }
        }
        return nameFromAge;
    }

    public static Map<String, String> getHairName(){
        return hairName;
    }
}
