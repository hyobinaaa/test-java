import java.util.Scanner;

public class test28 {
    public static void main(String[] args) {
       // 연산자 프로그램 만들기


       // 1이상의 값만 입력 가능, 그 이외에 값은 다음과 같은 msg 출력
       // 정수값 입력 받기
       Scanner scan = new Scanner(System.in);
       int foo = 1; // 정수 입력 시 카운트 증감 시 필요 위함
       
       // 예외 처리
       for(;;){
        int inputValue = scan.nextInt();
        if(inputValue<1){
            System.out.println("1이상 양수를 입력해주세요");
        }else if(inputValue==20000){
            System.out.println("이용해주셔서 감사합니다");
        }

        //몇번째 값인지 메뉴얼 출력
        else{
            System.out.println(foo + "번째 입력 값은 = " + inputValue);

            // 삼항 연산자 사용 하여 어떤게 참,거짓 인지 판단하여 출력 되게 하기 위함
            System.out.println(inputValue%2==0? "짝수 입니다" : "홀수 입니다");
            // 입력 받은 정수가 3의 배수인지 7의 배수인지 구분 위함 
            if(inputValue%3==0){
                System.out.println("3의 배수 입니다.");
            }
            if(inputValue%7==0){
                System.out.println("7의 배수 입니다.");
            }foo++;// 정수 입력시 몇번째 입력인지 카운터 증가를 위함
        }
    
    
    }






       }

    }                
        




    
    

