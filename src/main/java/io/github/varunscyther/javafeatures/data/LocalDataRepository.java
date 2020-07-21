package io.github.varunscyther.javafeatures.data;

import java.util.ArrayList;
import java.util.List;

public class LocalDataRepository {

    public static List<Person> getAllPersons() {
        List <Person> personList = new ArrayList<>();
        List<String> listOfEmotionsForPerson1 = new ArrayList<>();
        listOfEmotionsForPerson1.add("ANGER");
        listOfEmotionsForPerson1.add("PRIDE");
        listOfEmotionsForPerson1.add("MIND");
        listOfEmotionsForPerson1.add("WILL");
        listOfEmotionsForPerson1.add("EGO");

        Person p1 = new Person("SINGH", "VARUN", "MALE", 32, listOfEmotionsForPerson1);
        personList.add(p1);

        List<String> listOfEmotionsForPerson2 = new ArrayList<>();
        listOfEmotionsForPerson2.add("MIND");
        listOfEmotionsForPerson2.add("WILL");

        Person p2 = new Person("SINGH", "JASRAM", "MALE", 92, listOfEmotionsForPerson2);
        personList.add(p2);

        List<String> listOfEmotionsForPerson3 = new ArrayList<>();
        listOfEmotionsForPerson3.add("ENVY");
        listOfEmotionsForPerson3.add("EGO");
        Person p3 = new Person("SINGH", "YUVRAJ", "MALE", 38, listOfEmotionsForPerson3);
        personList.add(p3);


        List<String> listOfEmotionsForPerson4 = new ArrayList<>();
        listOfEmotionsForPerson4.add("LUST");
        listOfEmotionsForPerson4.add("GREED");
        listOfEmotionsForPerson4.add("ENVY");
        listOfEmotionsForPerson4.add("EGO");
        Person p4 = new Person("STEPHEN", "DOLLY", "FEMALE", 23, listOfEmotionsForPerson4);
        personList.add(p4);

        return personList;
    }
}
