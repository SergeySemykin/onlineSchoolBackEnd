package edu.onlineSchool.eSchool.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Pupils implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable=false,updatable = false)
    private Integer id;
    private String name;
    private String surname;
    @Column(nullable=true,updatable = true)
    private String patronymic;
    private String grade;
    private int performance;
    public Pupils(){}

    public Pupils( String name, String surname, String patronymic, String grade, Integer performance) {

        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.grade = grade;
        this.performance = performance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getPatronym() {
        return patronymic;
    }
    public void setPatronym(String patronym) {
        this.patronymic = patronym;
    }
    public String getGrade() {
        return grade;
    }
    public void setGrade(String grade) {
        this.grade = grade;
    }
    public int getPerformance() {
        return performance;
    }
    public void setPerformance(int performance) {
        this.performance = performance;
    }

    @Override
    public String toString(){
        return "Name: "+name+'\n'+ "Surname: "+surname+"\n"+"Patronym: "+patronymic+
                "\n"+"Grade: "+ grade+"\nPerformance: "+performance+"%";

    }
}
