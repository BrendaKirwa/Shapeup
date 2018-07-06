package com.example.hpenvy15.shapeup;

/**
 * Created by Brenda.
 */

public class instructorretro {
    private int Id;
    private String instructor_name;
    private String gender;
    private String contact;
    private String email;

    public instructorretro( int id, String instructor_name, String gender,String email,  String contact) {
        this.Id=id;
        this.instructor_name = instructor_name;
        this.gender = gender;
        this.email = email;
        this.contact = contact;

    }
    public int getId() {
        return Id;
    }

    public String getName() {
        return instructor_name;

    }
    public String getEmail() {
        return email;
    }
    public String getContact() {
        return contact;
    }

    public String getGender() {
        return gender;
    }
}

