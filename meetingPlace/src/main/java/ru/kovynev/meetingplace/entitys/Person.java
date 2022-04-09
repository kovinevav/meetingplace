package ru.kovynev.meetingplace.entitys;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "person")
@Data
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_person")
    private int idPerson;
    @Column(name = "name")
    private String name;
    @Column(name = "sex")
    private Sex sex;
    @Column(name = "age")
    private int age;
    @Column(name = "city")
    private String city;

    public Person(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public Person() {

    }
}
