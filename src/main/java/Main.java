import java.util.Scanner;
import java.util.Random;
import java.io.IOException;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws IOException{
        int rand = Create_RandomNum();
        System.out.println(rand);
        int input = input_Number();

        System.out.printf("숫자 : "+ input);
    }

    private static int Create_RandomNum(){
        Random random = new Random();
        int randNum = 0;
        boolean[] number = new boolean[10];
        int it = 0;
        while(it<3){
            int x = random.nextInt(9)+1;
            if(number[x]) continue;
            number[x] = true;
            randNum += x*Math.pow(10,it);
            it++;
        }

        return randNum;
    }

    private static int input_Number(){
        int input = 0;
        while(true){
            System.out.println("숫자를 입력하세요 : ");
            input = sc.nextInt();
            if(input >= 100 && input <= 999) {
                return input;
            }else{
                System.out.println("3자리 숫자를 입력해주세요.");
            }
        }
    }
}
