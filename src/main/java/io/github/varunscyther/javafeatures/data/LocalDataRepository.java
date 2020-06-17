package io.github.varunscyther.javafeatures.data;

import java.util.ArrayList;
import java.util.List;

public class LocalDataRepository {

    public static List<Person> getAllPersons() {
        List <Person> personList = new ArrayList<>();

        Person p1 = new Person("SINGH", "VARUN", "MALE", 32);
        personList.add(p1);

        Person p2 = new Person("SINGH", "JASRAM", "MALE", 92);
        personList.add(p2);

        Person p3 = new Person("SINGH", "YUVRAJ", "MALE", 38);
        personList.add(p3);

        Person p4 = new Person("STEPHEN", "DOLLY", "FEMALE", 23);
        personList.add(p4);

        return personList;
    }
}
