import java.util.Scanner;

public class test28 {
    public static void main(String[] args) {
        // 연산자 활용 프로그램 

        // 1이상의 값만 입력 하기, 그 이외에 값은 다음과 같은 msg 출력됨
        // 정수값 입력 받기
        Scanner scan = new Scanner(System.in);
        int foo = 1; // 다른 정수를 지정한 이유는 나중에 숫자 입력 하는 카운터 마다 올라 가기 위함
        
        // 먼저 예외 처리 하기 
        for(;;){
            int inputValue = scan.nextInt();
            if(inputValue<1){
                System.out.println("1이상 양수를 입력하세요");
            }
            else if(inputValue==20000){
                System.out.println("이용해주셔서 감사합니다");
            
            // 값을 입력 받았을때 짝,홀 판단 
            }
            else{
                System.out.println(foo + "번째 입력 값은 = " + inputValue);
            
            // 삼항 연산자로 입력 받은 값으로 의해서 짝수 인지 홀수인지 판단 하기 위함
                System.out.println(inputValue%2==0 ? "짝수 입니다." : "홀수 입니다.");

            // 3의 배수인지 7의 배수인지 확인하게 하는법 
                if(inputValue%3==0){
                    System.out.println("3의 배수 입니다.");
                if(inputValue%7==0){
                    System.out.println("7의 배수 입니다.");
                }
                }foo++; // 값을 입력 할때 마다 "몇번째인지 카운터 증가 시키키 위함"
            }

            }                
        
        
        }



    }
    

