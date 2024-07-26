package ex2;

import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        new Person("Alice", 30, "Straight", "Yellow");
        new Person("Bob", 23, "Curly", "Purple");

        List<String> names = Person.getListName();
        System.out.println("List of names: " + names);

        List<String> namesOver3 = Person.getNameFromAge(3);
        System.out.println("Names of people older than 3: " + namesOver3);

        Map<String, Integer> nameAgeMap = Person.getMapNameAge();
        System.out.println("Name-Age map: " + nameAgeMap);

        Map<String, String> hairNameMap = Person.getHairName();
        System.out.println("Hair-Name map: " + hairNameMap);
    }
}
