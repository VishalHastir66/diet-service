package com.healthyio.dietservice.bean;

import javax.persistence.*;

@Entity
@Table(name = "diet_preference")
public class Diet {

    @Id
    @GeneratedValue
    private int id;
    private String dietData;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    protected Diet() {
    }

    public Diet(int id, String dietData) {
        super();
        this.id = id;
        this.dietData = dietData;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDietData() {
        return dietData;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setDietData(String dietData) {
        this.dietData = dietData;
    }
}
