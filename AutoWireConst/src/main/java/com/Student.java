package com;

public class Student {
    private String name;
    private int id;
    private Address address;

    public Student(String name, int id, Address address) {
        this.name = name;
        this.id = id;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public Address getAddress() {
        return address;
    }
    public void display(){
        System.out.println(getId());
        System.out.println(getName());
        System.out.println(getAddress());
    }
}
