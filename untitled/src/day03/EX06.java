package day03;

public class EX06 {
    public static void main(String[] args) {
        // Applephone : 배터리 용량(정수) 100
        // charge() + 10
        // use() -5
        // useKakao -5
        // useYoutube -10
        // 배터리 용량 확인
        // turn on
        // turn off
        Applephone apple = new Applephone();
    }
}

class Applephone{
    // field 값은 private가 가장 최적.
    private final int BATTERY_MAX_CAPA = 100; //final로 상수 지정, 최대 용량
    private int batteryStat = 70; // 배터리 현재 용량
    private boolean isOn  = true; // 꺼져있을 떄 false, 켜져 있을 때 true. isNotOff 부정부정 => 긍정(isOn)으로 사용
    Applephone(){

    }
    void charge(){
        if (this.batteryStat == BATTERY_MAX_CAPA){
            System.out.println("100%입니다.");
            return;
        }
        else if(batteryStat == 95){
                batteryStat += 5;
            }
        else{
            batteryStat += 10;
        }
        System.out.println(batteryStat+"%가 되었습니다.");
    }
    void operateKakao() {
        if (isOn){
            batteryStat -= 5;
            if(batteryStat == 0){
                turnOff();
            }

        }
    }
    void useYoutube() {
        if (isOn){
            batteryStat -= 10;
            if(batteryStat == 0){
                turnOff();
            }

        }
    }
    void printBattery(){
        System.out.println(batteryStat+"%");
    }

}

class Person{
    // charge(), useKakao()
    Applephone phone;

    //buyPhone
    void buyPhone(Applephone phone){
        this.phone = phone;
    }
    //charge
    void chargePhone(){
        phone.charge();
    }
    //useKakao
    void useKakao(Applephone phone){
        // 켜져있나?
        if(phone.isOn){
            phone.operateKakao();
        }
    }
}