package com.antonromanov;

/**
 * Created by Anton on 18.04.2018 at 15:26.
 */
public class Volunteer implements Thinker {

    private String thoughts;

    public void thinkOfSomething(String thoughts) {
        this.thoughts = thoughts;
    }

    public String getThoughts() {
        return thoughts;
    }


}
