package com.example.hpenvy15.shapeup;

/**
 * Created by Brenda.
 */

public class sessionretro {
    private int Id;
    private int user_id;
    private String exercise_name;
    private int sets;
    private int reps;

    public sessionretro( int id, int user_id, String exercise_name,int sets,  int reps) {
        this.Id=id;
        this.exercise_name = exercise_name;
        this.sets = sets;
        this.reps = reps;
        this.user_id = user_id;

}
    public int getId() {
        return Id;
    }
    public int getUser_id() {
        return user_id;
    }


    public String getName() {
        return exercise_name;

    }
    public int getSets() {
        return sets;
    }
    public int getReps() {
        return reps;
    }

}


