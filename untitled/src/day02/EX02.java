package day02;

public class EX02 {
    public static void main(String[] args) {
        Coffee ediya = new Coffee("3000","hot","grande");
        ediya.getInfo();
    }
}

// 커피 class
// field : price, hot or ice, size
// method : getInfo() - sout => price, temp, size
// 생성자로 변수 받는 이유
class Coffee{
    String price;
    String temperature;
    String size;
    // 생성자
    Coffee(){

    }
    Coffee(String price, String temperature, String size){
        this.price = price;
        this.temperature = temperature;
        this.size = size;
    }
    void getInfo() {
        System.out.println("이 커피의 가격은 "+price+" 온도는 "+temperature+" 사이즈는 "+size);
    }
}
