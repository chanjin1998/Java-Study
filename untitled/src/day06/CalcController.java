package day06;

public class CalcController {
    CalcModel calcModel;
    CalcController(CalcModel calcModel){
        this.calcModel = calcModel;
        new CalcView(this);
    }
    public int plus(int num1, int num2){
        return calcModel.plus(num1,num2);
    }
    public int minus(int num1, int num2){
        return calcModel.minus(num1,num2);
    }
    public int multi(int num1, int num2){
        return calcModel.multi(num1,num2);
    }
    public int divide(int num1,int num2){
        return calcModel.divide(num1,num2);
    }
}