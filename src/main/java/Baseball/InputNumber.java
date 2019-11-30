package Baseball;

import java.util.Scanner;

public class InputNumber {
    private static int inputNumber;
    private static Scanner sc = new Scanner(System.in);
    private static boolean[] usedNumber;

    public InputNumber(){}

    public void input(){
        System.out.println("���ڸ� �Է����ּ��� : ");
        inputNumber = sc.nextInt();
        if(!inputCheck(inputNumber)){
            input();
        }
    }

    private boolean inputCheck(int inputNumber){
        int temp = inputNumber;
        if((temp < 100) || (temp > 999)){
            return false;
        }

        while(temp != 0){
            int num = temp%10;
            if(usedNumber[num]) {
                return false;
            }
            usedNumber[num] = true;
            temp = temp/10;
        }
        return true;
    }

    public int getInputNumber(){
        return inputNumber;
    }

}
