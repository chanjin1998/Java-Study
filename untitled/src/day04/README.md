DAO 클래스: 데이터 액세스 객체(Data Access Object)로, 회원 관리에 필요한 기능들을 구현합니다. 내부에는 HashMap을 사용하여 ID를 키로 하고, 비밀번호와 이름을 값으로 하는 데이터베이스를 관리합니다.

signUp(String id, String pw, String name): 새로운 회원을 등록하는 메서드입니다. 주어진 ID, 비밀번호, 이름을 받아서 HashMap에 저장합니다.

signIn(String id, String pw): 회원 로그인을 처리하는 메서드입니다. 주어진 ID와 비밀번호를 사용하여 회원을 인증하고, 인증되면 환영 메시지를 출력합니다.

modifyInfo(String id, String pw, String newName): 회원 정보를 수정하는 메서드로, 회원을 인증한 후에 새로운 이름으로 정보를 업데이트합니다.

withdraw(String id, String pw): 회원 탈퇴를 처리하는 메서드로, 회원을 인증한 후에 데이터베이스에서 해당 회원 정보를 삭제합니다.

main 메서드: 프로그램의 진입점입니다. 사용자에게 메뉴를 제공하고, 입력에 따라 적절한 DAO 메서드를 호출하여 기능을 수행합니다. 반복문을 통해 사용자가 프로그램을 종료할 때까지 계속해서 메뉴를 보여줍니다.

이 프로그램은 간단한 콘솔 기반의 회원 관리 시스템으로, 사용자가 회원 가입, 로그인, 회원 정보 수정, 회원 탈퇴와 같은 기능을 수행할 수 있습니다. 데이터베이스가 없어도 HashMap을 활용하여 데이터를 관리하고, 이를 통해 회원 관리를 구현하였습니다.
