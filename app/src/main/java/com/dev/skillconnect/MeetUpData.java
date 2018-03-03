package com.dev.skillconnect;

/**
 * Created by Admin on 03-03-2018.
 */

public class MeetUpData {
    String name;
    String post;
    String interest;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getPost() {
        return post;

    }

    public void setPost(String post) {
        this.post= post;
    }
    public String getInterest() {
        return interest;
    }

    public void setInterest(String interest) {
        this.interest = interest;
    }




    public MeetUpData(String name, String post, String interest) {
        this.name = name;
        this.post = post;
        this.interest = interest;

    }
}
