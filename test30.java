import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;
import javax.print.DocFlavor.STRING;

public class test30 {
    public static void main(String[] args) {
        // Scanner scn = new Scanner(System.in);

        // // 콘솔로부터 문자열 입력
        // String inputString = scn.next();

        // // 입력 받은 문자열에서 첫번째 글자를 반환
        //  char inputChar = inputString.charAt(0);

        // 입력 알파벳이 "d" 이며 "참" 아니면 "거짓"을 출력하는 코드 작성
        //System.out.println(inputChar);

        // if(inputChar=='d'){
        //     System.out.println("참");
        // }
        // else{
        //     System.out.println("거짓");
        // }

        // 입력 알파벳이 f t u k 일 경우 해당  값 출력 , 
        // 그외 값 아무것도 출력 하지 않음
        // 그외 값 "잘못된 입력 값"
        // 예) a -> "잘못된 입력값"
        // 예) t -> t

        // if(inputChar=='f'){
        //     System.out.println('f');
        // }
        // else if(inputChar=='t'){
        //     System.out.println('t');
        // }
        // else if(inputChar=='u'){
        //     System.out.println('u');

        // }
        // else if(inputChar=='k'){
        //     System.out.println('k');
        // }
        // else{
        //     System.out.println("잘못된 입력 값");
        // }
        Scanner scn = new Scanner(System.in);
        
        // 콘솔로부터 문자열 입력
        String inpuString = scn.next();
        
        // 입력 받은 문자열에서 모든 글자를 반환

        int countH = 0;
        int countT = 0;
        int countp = 0;
        int countETC = 0;
        
        for (int i = 0; i < inpuString.length() ; i++){

            char inputChar = inpuString.charAt(i);

            // 'h', 't' , 'p' -> 글자 별 발생 빈도를 출력하라
            // hhtttppppabc -> h:2 , t : 3 , p:4
            // 그 외 3개
            // 조건 식 먼저 만들고 생각을 해라
            


            if(inputChar=='h'){
                countH++;
            }
            else if(inputChar=='t'){
                countT++;

            }
            else if(inputChar=='p'){
                countp++;

            }
            else{
               countETC++;
            }
            
    }
    System.out.println("h:"+ countH +"\nt:" + countT +"\np:"+ countp + "\n그외 :" +countETC); // 값이 분리 되어서 나옴
}
        }
       
    
    

