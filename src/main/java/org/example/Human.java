package org.example;

public class Human extends Alived{
    private String name;
    private int maxDistance = 40000;
    private int maxHeight = 3;

    public Human(String name) {
        this.name = name;
    }

    @Override
    public boolean run(int distance) {
        if (maxDistance >= distance){
            System.out.println("Человек успешно пробежал беговую дорожку");
            return true;
        } else {
            System.out.println("Человек не пробежал беговую дорожку");
            return false;
        }
    }

    @Override
    public boolean jump(int height) {
        if (maxHeight >= height){
            System.out.println("Человек успешно перепрыгнул стену");
            return true;
        } else {
            System.out.println("Человек не перепрыгнул стену");
            return false;
        }
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", maxDistance=" + maxDistance +
                ", maxHeight=" + maxHeight +
                '}';
    }
}
