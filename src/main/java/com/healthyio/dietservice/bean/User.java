package com.healthyio.dietservice.bean;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue
    private int id;
    private String firstName;
    private String LastName;
    private String email;

    @OneToMany(mappedBy = "user",fetch = FetchType.LAZY)
    private List<Diet> dietList;

    protected User() {
    }

    public User(int id, String firstName, String lastName, String email) {
        super();
        this.id = id;
        this.firstName = firstName;
        this.LastName = lastName;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Diet> getDietList() {
        return dietList;
    }

    public void setDietList(List<Diet> dietList) {
        this.dietList = dietList;
    }
}
