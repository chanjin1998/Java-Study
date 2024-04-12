package day06;
// MVC 패턴
// Model - BE(DB, 로직), View - FE(화면), Controller - 화면을 켠다.

// 사용자 입력 : View
// 엔터 / 검색 버튼 클릭
// View => 데이터를 전달 => Controller(API) => 데이터를 전달, 연산 요청
// => Model(데이터 연산) => 결과 전달 => Controller => 결과 전달 => View => 다음페이지

// 다음 페이지(원하는 결과와 함께)
// swing 전체 import
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcView extends JFrame implements ActionListener{
    JTextField tf_num1 = new JTextField();
    JTextField tf_num2 = new JTextField();

    JButton btn_plus = new JButton("더하기");
    JButton btn_minus = new JButton("빼기");
    JButton btn_multi = new JButton("곱하기");
    JButton btn_divide = new JButton("나누기");

    JLabel la_result = new JLabel("결과 출력");
    // 필드에 생성자 금지!
    CalcController calcController;

    CalcView(CalcController calcController){
        this.calcController = calcController;

        btn_plus.addActionListener(this);
        btn_minus.addActionListener(this);
        btn_multi.addActionListener(this);
        btn_divide.addActionListener(this);

        setSize(500,400);
        setLayout(null);
        setVisible(true); // 화면 보이게
        setDefaultCloseOperation(EXIT_ON_CLOSE); // 종료버튼 클릭 시 프로그램 종료

        tf_num1.setBounds(50,70,50,40);
        tf_num2.setBounds(100,70,50,40);
        btn_plus.setBounds(150,70,80,40);
        btn_minus.setBounds(230,70,80,40);
        btn_multi.setBounds(310,70,80,40);
        btn_divide.setBounds(390,70,80,40);

        la_result.setBounds(50,100,200,40);

        add(tf_num1);
        add(tf_num2);
        add(btn_plus);
        add(btn_minus);
        add(btn_multi);
        add(btn_divide);
        add(la_result);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // 더하기 버튼이 클릭되면 아래 코드가 실행.
        if (e.getSource() == btn_plus){
            int num1 = Integer.parseInt(tf_num1.getText());
            int num2 = Integer.parseInt(tf_num2.getText());

//            la_result.setText(calcController.plus(num1,num2)+"");
            la_result.setText(Integer.toString(calcController.plus(num1,num2)));
        } else if (e.getSource() == btn_minus) {
            int num1 = Integer.parseInt(tf_num1.getText());
            int num2 = Integer.parseInt(tf_num2.getText());

            la_result.setText(Integer.toString(calcController.minus(num1,num2)));
        } else if (e.getSource() == btn_multi) {
            int num1 = Integer.parseInt(tf_num1.getText());
            int num2 = Integer.parseInt(tf_num2.getText());

            la_result.setText(Integer.toString(calcController.multi(num1,num2)));
        } else if (e.getSource() == btn_divide) {
            int num1 = Integer.parseInt(tf_num1.getText());
            int num2 = Integer.parseInt(tf_num2.getText());

            la_result.setText(Integer.toString(calcController.divide(num1,num2)));
        }
    }
}
