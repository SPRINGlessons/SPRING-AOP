package com.antonromanov;

/**
 * Created by Anton on 18.04.2018 at 15:17.
 */
public class Magician implements MindReader {
    private String thoughts;


    public Magician() {
        this.thoughts = "-";
    }

    public void interceptThoughts(String thoughts) {
        System.out.println("Intercepting volunteers thoughts:   ");
        this.thoughts = thoughts;
        testing();
    }

    public String getThoughts() {
        return thoughts;
    }
    private void testing() {
        System.out.println(thoughts);
    }

}
