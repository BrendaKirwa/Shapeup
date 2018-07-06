package com.example.hpenvy15.shapeup;

/**
 * Created by Brenda.
 */

public class profileretro {

    private int id;
    private String name;
    private String username;
    private int age;
    private String email;
    private String gender;
    private int weight;
    private int height;
    private int target_weight;
    private String address;

    public profileretro( int id, String name, String username,String email,  int age, String gender, int weight, int height, int target_weight,String address) {
       this.id=id;
        this.name = name;
        this.username = username;
        this.age = age;
        this.gender = gender;
        this.email = email;
        this.weight = weight;
        this.height = height;
        this.target_weight = target_weight;
        this.address = address;
    }
    public profileretro(int id,String name,   int age, String gender, int weight, int height, int target_weight, String address) {
        this.name = name;
        this.email = email;
        this.gender = gender;
        this.weight = weight;
        this.height = height;
        this.target_weight = target_weight;
        this.address = address;
    }
        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public String getUsername() {
            return username;
        }

        public int getAge() {
            return age;
        }
    public String getEmaill() {
        return email;
    }
        public String getAddress() {
            return address;
        }

        public String getGender() {
            return gender;
        }

        public int getWeight() {
            return weight;
        }

        public int getHeight() {
            return height;
        }

        public int getTarget_weight() {
            return target_weight;
        }

}
