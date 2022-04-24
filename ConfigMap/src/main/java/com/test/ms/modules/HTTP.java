package com.test.ms.modules;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.client.RestTemplate;

public class HTTP {
    private String name;
    private int id;
    HTTP(String name,int id){this.name=name;this.id=id;};
    HTTP(){};
    public void setName(String name){this.name=name;}
    public String getName(){return name;}
    public void setId(int id){this.id=id;}
    public int getId(){return id;}

}
