package day01;

public class EX06 {
    public static void main(String[] args) {
        Person person = new Person("찬진");
        Person dennis = new Person("데니스");
        Person andy = new Person("앤디");

        System.out.println(dennis.title);
    }
}
class Person {
    String title;
    Person() {

    }
    Person(String title){
        this.title = title;
    }
}