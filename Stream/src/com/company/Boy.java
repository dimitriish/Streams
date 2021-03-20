package com.company;

public class Boy {
    private final String name;
    private final int age;

    Boy(final String name, final int age) {
        this.name = name;
        this.age = age;
    }

    /**
     *
     * @return  = name*/
    public String getName() {
        return name;
    }

    /**
     *
     * @return = age */
    public int getAge() {
        return age;
    }

    /***/
    @Override
    public String toString() {
        return name + "-" + age;
    }
}