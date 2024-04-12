package day03;

public class EX06 {
    public static void main(String[] args) {
        Person son = new Person();
        ApplePhone iphone16 = new ApplePhone();
        son.buyPhone(iphone16);

        SamsungPhone galaxy2024 = new SamsungPhone();
        son.buyPhone(galaxy2024);

        // Person => ApplePhone 모든 기능
        // 30분까지
        // ApplePhone => SamsungPhone 기기변경
    }
}

class ApplePhone implements Phone{
    private final int BATTERY_MAX_CAPA = 100; // 배터리 최대 용량
    private int batteryStatus = 70; // 배터리 현재 용량
    private boolean isOn = true;

    public boolean getIsOn() {
        return isOn;
    }

    public void charge() {
        if (batteryStatus == BATTERY_MAX_CAPA) {
            System.out.println("100%입니다.");
            return;
        } else if (batteryStatus == 95) {
            batteryStatus += 5;
        } else {
            batteryStatus += 10;
        }

        System.out.println(batteryStatus
                + "%가 되었습니다.");
    }

    public void operateKakaotalk() {
        if (isOn) {
            batteryStatus -= 5;

            if (batteryStatus == 0);
//                turnOff();
        }
    }

    public void checkBatteryStatus() {
        System.out.println(batteryStatus+"%");
    }

    // useYoutube() -10
    // turnOn
    // turnOff
}

class SamsungPhone implements Phone{
    private final int BATTERY_MAX_CAPA = 100; // 배터리 최대 용량
    private int batteryStatus = 70; // 배터리 현재 용량
    private boolean isOn = true;

    public boolean getIsOn() {
        return isOn;
    }

    public void charge() {
        if (batteryStatus == BATTERY_MAX_CAPA) {
            System.out.println("100%입니다.");
            return;
        } else if (batteryStatus == 95) {
            batteryStatus += 5;
        } else {
            batteryStatus += 10;
        }

        System.out.println(batteryStatus
                + "%가 되었습니다.");
    }

    public void operateKakaotalk() {
        if (isOn) {
            batteryStatus -= 5;

            if (batteryStatus == 0);
//                turnOff();
        }
    }

    public void checkBatteryStatus() {
        System.out.println(batteryStatus+"%");
    }

    // useYoutube() -10
    // turnOn
    // turnOff
}
interface Phone{
    public abstract boolean getIsOn();
    void charge();
    void operateKakaotalk();
    void checkBatteryStatus();
}
class Person {
    Phone phone;
    ApplePhone phone1;
    // 자식과 부모 상위, 하위 객체 클래스는 대체해야함
    // buyPhone()
    void buyPhone(Phone phone) {
        this.phone = phone;
        System.out.println("success");

    }

    // charge()
    void chargePhone() {
        phone.charge();
    }

    // useKakaotalk()
    void useKakaotalk() {
        if (phone.getIsOn())
            phone.operateKakaotalk();
    }
}


// Q. 스캐너로 사용자에게 회원가입 입력, 로그인 입력, 회원정보 수정, 회원 탈퇴
// (1) 메뉴 1~4
// (2) 기능
// 스캐너 : 사용자 입력(id, pw, 이름) + 유효성
// DAO / Repository : DB와 소통 => class DAO Map db/