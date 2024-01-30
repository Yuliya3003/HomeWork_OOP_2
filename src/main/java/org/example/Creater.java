package org.example;

public abstract class Creater {

    protected boolean crossObctacle(Obstacle obstacle){
        if (obstacle instanceof Treadmill){
            if (run(((Treadmill) obstacle).getLength())) {return true;}

        } else if (obstacle instanceof Wall) {
            if(jump(((Wall) obstacle).getHeight())) {return true;}}

        return false;
    }

    public abstract boolean run(int distance);
    public abstract boolean jump(int height);


}
