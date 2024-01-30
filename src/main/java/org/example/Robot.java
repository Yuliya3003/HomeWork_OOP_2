package org.example;

public class Robot extends NotAlived{
    private String name;
    private int maxDistance = 20000;
    private int maxHeight = 1;

    public Robot(String name) {
        this.name = name;
    }

    @Override
    public boolean run(int distance) {
        if (maxDistance >= distance){
            System.out.println("Робот успешно пробежал беговую дорожку");
            return true;
        } else {
            System.out.println("Робот не пробежал беговую дорожку");
            return false;
        }
    }

    @Override
    public boolean jump(int height) {
        if (maxHeight >= height){
            System.out.println("Робот успешно перепрыгнул стену");
            return true;
        } else {
            System.out.println("Робот не перепрыгнул стену");
            return false;
        }
    }

    @Override
    public String toString() {
        return "Robot{" +
                "name='" + name + '\'' +
                ", maxDistance=" + maxDistance +
                ", maxHeight=" + maxHeight +
                '}';
    }
}
