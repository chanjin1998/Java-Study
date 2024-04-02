package day03;

public class EX04 {
    // 레시피 - getInfo()
    // 파스타 레시피 - makeSource
    // 스테이크 레시피 -- grill
}

//abstarct 붙이면 객체 못 만듬
//추상 메소드가 1개 이상 포함되어있다면 반드시 추상 클래스로 선언되어야한다.
abstract class Receipt {
    String name;

    Receipt() {
    }

    Receipt(String name) {
        this.name = name;
    }

    void getInfo(String name) {
        System.out.println("이 레시피는" + name + "셰프님의 레시피입니다.");
    }
}
class PastaReceipt extends Receipt{
    String name;
    //접근 제어자 abstract 인터페이스 이름(변수명)
    //인터페이스에거는 필드 대신 상수를 선언할 수 있습니다.
}

class SteakReceipt extends Receipt{
    SteakReceipt(String name){

    }
}
