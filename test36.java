import java.util.Scanner;

public class test36 {
    public static void main(String[] args) {
       
            Scanner scn = new Scanner(System.in);
            int inputValue = 0; // 정수는 0
           
            while(true){
                inputValue = scn.nextInt();// 콘솔로 부터 정수 값 입력 받음
                // 조건이 0보다 클 경우
                if(inputValue > 0)
                    break; // 값이 입력 되서 값이 일치 하면 탈출하게 한다 

                    // 잘못된 입력 값 처리
                    // 값이 잘못되었으면 지금 구문이 실행된다
                    String Msg = "잘못된 입력값 입니다. 현재값";
                    if(inputValue == 0)
                        Msg += "0";
                    else
                        Msg += " 음수입니다.";


                System.out.println(Msg);
            }
            System.out.println(inputValue);
        }
          
    }

    
    

