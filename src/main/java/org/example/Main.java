package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Creater[] participants = {
                new Human("Артем"),
                new Cat("Шипа"),
                new Robot("R2D2")
        };

        Obstacle[] obstacles = {
                new Treadmill(4),
                new Wall(1),
                new Treadmill(7),
                new Wall(3),
                new Wall(4),
                new Treadmill(5)
        };

        List<Creater> winners = new ArrayList<>();

        for (Creater part: participants
             ) {
            boolean flag = true;
            for (Obstacle obstacle: obstacles
                 ) {
                if (!part.crossObctacle(obstacle)) {
                    flag = false;
                    break;
                }
                }

                if (flag == true){
                    winners.add(part);
                }
            }
        System.out.println();
        System.out.println("Победители:");

        for (Creater win:winners
             ) {
            System.out.println(win);
        }

        }
    }
