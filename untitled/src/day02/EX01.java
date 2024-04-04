package day02;

import java.lang.reflect.Method;

public class EX01 {
    public static void main(String[] args) {
        Animal dog = new Animal("강아지","멍멍");
        Animal cow = new Animal("송아지","음메");
        System.out.println(dog.name);
        dog.cry();
        cow.cry();
        cow.cry();
    }
}
// 동물 클래스, 이름(String), 울음소리(method)
class Animal{
    String name;
    String sound;
    Animal() {

    }
    Animal(String name){
        this.name = name;
    }
    Animal(String name, String sound){
        this.name = name;
        this.sound = sound;
    }
    void cry(){
        this.sound = sound;
        System.out.println(sound);
    }
}