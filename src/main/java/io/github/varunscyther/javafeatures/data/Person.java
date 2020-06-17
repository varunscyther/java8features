package io.github.varunscyther.javafeatures.data;

public class Person {

    private String surName;
	private String firstName;
	private String gender;
    private int age;

	public Person(String surName, String firstName, String gender, int age) {
		this.surName = surName;
		this.firstName = firstName;
		this.gender = gender;
		this.age = age;
	}

	public Person() {

	}

	public Person(String s) {
		this.firstName = s;
	}

	public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person{" +
				"surName='" + surName + '\'' +
				", firstName='" + firstName + '\'' +
				", gender='" + gender + '\'' +
				", age='" + age + '\'' +
				'}';
	}

	public void printAge() {
		System.out.println(age);
	}
}
