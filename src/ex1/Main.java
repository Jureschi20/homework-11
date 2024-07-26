package ex1;

import java.util.HashMap;
import java.util.Map;


public class Main {
    static HashMap<String, Integer> student = new HashMap<>();

    public static void main(String[] args) {
        student.put("Oana", 9);
        student.put("George", 3);
        student.put("Grigoriu", 8);
        student.put("Mihaela", 6);

        System.out.println("Cel mai smecher " + highest());
    }

    public static String highest() {
        String highestName = null;
        Integer highestGrade = 0;
        for(Map.Entry<String,Integer> studenti : student.entrySet()){
            if(highestGrade < studenti.getValue()){
                highestGrade=studenti.getValue();
                highestName=studenti.getKey();
            }
        }

        return highestName;



    }
}


