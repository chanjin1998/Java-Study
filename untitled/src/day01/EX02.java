package day01;

public class EX02 {
    public static void main(String[] args) {
        // switch 구문 , num = 9=> a, 8=>b, 7=> c 6이하 f
       int age = 22;
       switch(age/10){
           case 3:
               System.out.println("30대입니다.");
               break;
           case 2:
               System.out.println("20대입니다.");
               break;
           case 1:
               System.out.println("10대입니다.");
               break;
           case 0:
               System.out.println("어린이입니다.");
               break;
       }

    }
}
