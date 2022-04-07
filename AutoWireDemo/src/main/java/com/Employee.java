package com;

public class Employee {
    private String name;
    private Address address1;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address1;
    }

    public void setAddress(Address address) {
        this.address1 = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", address=" + address1 +
                '}';
    }
}
