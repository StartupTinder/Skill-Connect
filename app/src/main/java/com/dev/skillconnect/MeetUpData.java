package com.dev.skillconnect;

/**
 * Created by Admin on 03-03-2018.
 */

public class MeetUpData {
    String name;
    int id;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public MeetUpData(String name, int id) {
        this.name = name;
        this.id = id;
    }
}
