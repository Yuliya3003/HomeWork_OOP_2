package org.example;

public class Cat extends Alived{

    private int maxDistance = 50000;
    private int maxHeight = 10;

    public Cat(String name) {
        super(name);
    }

    @Override
    public boolean run(int distance) {
        if (maxDistance >= distance){
            System.out.println("Кот успешно пробежал беговую дорожку");
            return true;
        } else {
            System.out.println("Кот не пробежал беговую дорожку");
            return false;
        }
    }

    @Override
    public boolean jump(int height) {
        if (maxHeight >= height){
            System.out.println("Кот успешно перепрыгнул стену");
            return true;
        } else {
            System.out.println("Кот не перепрыгнул стену");
            return false;
        }
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + super.getName() + '\'' +
                ", maxDistance=" + maxDistance +
                ", maxHeight=" + maxHeight +
                '}';
    }
}
