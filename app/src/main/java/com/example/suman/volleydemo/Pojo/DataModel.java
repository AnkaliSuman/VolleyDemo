package com.example.suman.volleydemo.Pojo;

/**
 * Created by bapi on 4/1/17.
 */

public class DataModel {
    String name;
    String title;

    public DataModel(String name, String title) {
        this.name = name;
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
