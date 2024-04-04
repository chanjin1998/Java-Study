package day02;
// 우리는 상점에서 핸드폰 구매한다.
// 쏘니가 핸드폰을 샀다.
// 베컴도 핸드폰을 샀다.

// 쏘니가 핸드폰을 켰다. "야 내 핸드폰 켜볼게" -> "삐비빅" (핸드폰이 내는 소리)
// 베컴도 핸드폰을 켰다. "turn on" -> "bbeep" (핸드폰이 내는 소리)
public class EX03 {
    public static void main(String[] args) {
        Person sonny = new Person("흥민","야 내 핸드폰 켜볼게");
        Person beckham = new Person("베컴","turn on");

        Phone samsung = new Phone("삼성","삐비빅");
        Phone apple = new Phone("애플","bbeep");

        samsung.turnOn(sonny);
        sonny.say();
        apple.turnOn(beckham);
        beckham.say();
        samsung.ring();
        apple.ring();
    }
}


class Person{
    String name;
    String word;
    Person(){
    }
    Person(String name, String word){
        this.name = name;
        this.word = word;
    }
    void say(){
        System.out.println(word);
    }
}
class Phone{
    String brand;
    String sound;
    Phone(String brand,String sound) {
        this.brand = brand;
        this.sound = sound;
    }
    void turnOn(Person person) {
        System.out.println(person.name+"가 "+this.brand+"핸드폰을 켰습니다.");
    }
    void ring(){
        System.out.println(sound);
    }
}
//class Samsung{
//    String brand = "삼성";
//    String sound =  "삐비빅";
//}
//class Apple{
//    String brand = "애플";
//    String sound = "bbeep";
//}