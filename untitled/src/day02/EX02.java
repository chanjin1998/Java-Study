package day02;

import java.util.Base64;

//Q 바리스타 춘식.
//chunsik.getCoffeeInfo() => 이 커피는 4500원입니다.
//chunsik.makeCoffee() => 커피 여기있습니다.
public class EX02 {
    public static void main(String[] args) {
        Coffee americano = new Coffee(4000,"hot","tall");
        Coffee ediya = new Coffee(3000,"hot","grande");
        ediya.setPrice(2000);
        ediya.getInfo();
        ediya.setPrice(5000);
        ediya.getInfo();

        Barista chunsik = new Barista("춘식");
        chunsik.getCoffeeInfo(americano);
        chunsik.makeCoffee();
    }
}

// 커피 class
// field : price, hot or ice, size
// method : getInfo() - sout => price, temp, size
// 생성자로 변수 받는 이유
class Coffee{
    // private 시용 시 중괄호 내에서만 사용가능 => 생성자 내에서 접근.
    // 필드 => 생성자 => 메소드 순서대로 작성.
    private int price;
    private String temperature;
    private String size;
    // 생성자
    Coffee(){

    }
    Coffee(int price, String temperature, String size){
        this.price = price;
        this.temperature = temperature;
        this.size = size;
    }
    // field 값을 설정한다.
    // 변경할 값을 검증하는 용도로 사용한다.
    void setPrice(int price){
        if (price >= this.price){
            this.price = price;
        }
    }
    // field 값을 불러온다.
    int getPrice(int price){
        return price;
    }
    void getInfo() {
        System.out.println("이 커피의 가격은 "+price+" 온도는 "+temperature+" 사이즈는 "+size);
    }
}

class Barista{
    String name;
    int price;
    // 생성자
    Barista(String name) {
        this.name = name;
    }

    void makeCoffee(){
        System.out.println("커피 여기 있습니다.");
    }
    void getCoffeeInfo(Coffee coffee){
        this.price = price;
        System.out.println("이 커피는 "+ coffee.getPrice(price) +"원 입니다.");
    }
}
