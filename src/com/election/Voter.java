package com.election;

public class Voter {
    private String name;
    private int age;

    static final int VOTER_ELIGIBLE_AGE = 18;

    Voter(){
        name = null;
        age = 0;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
    public void getAgeCriteria(){
        if(age >= VOTER_ELIGIBLE_AGE){
            System.out.println(getName() + " Is Eligible to Vote");
        }
        else if (age > 0 && age < VOTER_ELIGIBLE_AGE) {
            System.out.println(getName() + " Is Not Eligible to Vote");
        }
        else{
            System.out.println("Age Can't Be Negative or Zero");
        }
    }
}
