package com.election;

public class VoterImpl {
    public static void main(String[] args) {
        Voter obj = new Voter();

        obj.setName("John");
        obj.setAge(10);

        obj.getAgeCriteria();
    }
}
