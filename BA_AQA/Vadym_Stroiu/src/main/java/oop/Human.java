package oop;

import javax.sound.midi.Soundbank;

/**
 * class from work with object og the human
 */
public class Human {
    private String name; // name
    private int height;
    private int weight;
    private int age;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if (height <= 0) {
            System.out.println("Height cant be <0");
        return;

    }

    this.height =height;

}
    public  void go() {
        System.out.print("I am going, "+" my name "+name);

    }

    public  String speak(){ return  "Hello I am a human";
                    }
    public  void  eat() {
        if (height > 0) {
            System.out.println("I am eat. And my heighr" + height);
        }
    }

}
