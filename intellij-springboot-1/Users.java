package com.yazan.test.modules;

 public class Users
{
    private int id;
    private String name;
    private String status;
    public Users() {}
    public Users(String name, int id) {this.name = name;this.id=id;}

    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return this.status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
}
