package day04;
import java.util.HashMap;
import java.util.Scanner;

public class DAO {
    private HashMap<String, String[]> database; // ID를 키로 하고, [비밀번호, 이름] 배열을 값으로 하는 HashMap

    public DAO() {
        database = new HashMap<>();
    }

    // 회원 가입 기능
    public void signUp(String id, String pw, String name) {
        String[] userInfo = {pw, name};
        database.put(id, userInfo);
        System.out.println("회원 가입이 완료되었습니다.");
    }

    // 로그인 기능
    public boolean signIn(String id, String pw) {
        if (database.containsKey(id)) {
            String[] userInfo = database.get(id);
            if (userInfo[0].equals(pw)) {
                System.out.println("로그인 성공! 환영합니다, " + userInfo[1] + "님");
                return true;
            } else {
                System.out.println("비밀번호가 일치하지 않습니다.");
                return false;
            }
        } else {
            System.out.println("존재하지 않는 ID입니다.");
            return false;
        }
    }

    // 회원 정보 수정 기능
    public void modifyInfo(String id, String pw, String newName) {
        if (signIn(id, pw)) {
            String[] userInfo = database.get(id);
            userInfo[1] = newName;
            System.out.println("회원 정보가 수정되었습니다.");
        } else {
            System.out.println("회원 정보 수정에 실패했습니다.");
        }
    }

    // 회원 탈퇴 기능
    public void withdraw(String id, String pw) {
        if (signIn(id, pw)) {
            database.remove(id);
            System.out.println("회원 탈퇴가 완료되었습니다.");
        } else {
            System.out.println("회원 탈퇴에 실패했습니다.");
        }
    }

    public static void main(String[] args) {
        DAO dao = new DAO();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. 회원 가입");
            System.out.println("2. 로그인");
            System.out.println("3. 회원 정보 수정");
            System.out.println("4. 회원 탈퇴");
            System.out.println("5. 종료");
            System.out.print("메뉴를 선택하세요: ");
            int menu = scanner.nextInt();
            scanner.nextLine(); // 버퍼 비우기

            switch (menu) {
                case 1:
                    System.out.print("ID를 입력하세요: ");
                    String signUpId = scanner.nextLine();
                    System.out.print("비밀번호를 입력하세요: ");
                    String signUpPw = scanner.nextLine();
                    System.out.print("이름을 입력하세요: ");
                    String signUpName = scanner.nextLine();
                    dao.signUp(signUpId, signUpPw, signUpName);
                    break;
                case 2:
                    System.out.print("ID를 입력하세요: ");
                    String signInId = scanner.nextLine();
                    System.out.print("비밀번호를 입력하세요: ");
                    String signInPw = scanner.nextLine();
                    dao.signIn(signInId, signInPw);
                    break;
                case 3:
                    System.out.print("ID를 입력하세요: ");
                    String modifyId = scanner.nextLine();
                    System.out.print("비밀번호를 입력하세요: ");
                    String modifyPw = scanner.nextLine();
                    System.out.print("새로운 이름을 입력하세요: ");
                    String newName = scanner.nextLine();
                    dao.modifyInfo(modifyId, modifyPw, newName);
                    break;
                case 4:
                    System.out.print("ID를 입력하세요: ");
                    String withdrawId = scanner.nextLine();
                    System.out.print("비밀번호를 입력하세요: ");
                    String withdrawPw = scanner.nextLine();
                    dao.withdraw(withdrawId, withdrawPw);
                    break;
                case 5:
                    System.out.println("프로그램을 종료합니다.");
                    System.exit(0);
                default:
                    System.out.println("올바른 메뉴를 선택해주세요.");
            }
        }
    }
}