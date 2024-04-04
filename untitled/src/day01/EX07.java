package day01;

public class EX07 {

    public static void main(String[] args) {
        // 객체 생성, 객체의 변수 출력
        Laptop samsung = new Laptop("삼성");
        Laptop lg = new Laptop("LG");
        System.out.println(lg.brand);
    }
}
 class Laptop{
     String brand;
     Laptop() {

    }
    Laptop(String brand){
        this.brand = brand;
    }
 }