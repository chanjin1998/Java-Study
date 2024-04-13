//package day05;
//
//public class EX01 {
//    // 블루투스 마이크
//    // 인터페이스 or 추상 클래스
//    // -> 블루수트 스피커 : sout(bgm)
//    // -> 마이크 : 노래를 부를 수 있음
//    // class BluetoothMic
//    // -> 음악도 나오고
//    // -> 노래도 부를 수 있고
//    BluetoothMic blue = new BluetoothMic();
//    blue.sing();
//    blue.listen("song");
//}
//interface Mic {
//    void sing();
//}
//
//interface Speaker {
//    void listen(String bgm);
//}
//
//class BluetoothMic implements Mic, Speaker {
//    @Override
//    public void sing() {
//        System.out.println("노래를 부릅니다.");
//    }
//    @Override
//    public void listen(String bgm) {
//        System.out.println("노래를 듣습니다: " + bgm);
//    }
//}
//// 나쁜 코드 => 클린 코드 작성법 => 코드 인스펙션 -> 리팩토링 -> 클린코드