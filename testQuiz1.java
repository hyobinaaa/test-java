import java.util.Scanner;



public class testQuiz1 {
    public static void main(String[] args) {
        // 구구단 프로그램 만들기
        while(true){
            System.out.println("------------");
            System.out.println("1. 구구단 출력");
            System.out.println("2. 프로그램 출력");
            System.out.println("------------");

            // 입력값 1을 받았을때
            Scanner scan = new Scanner(System.in);
            int inputValue = scan.nextInt();
            if(inputValue==1){
                System.out.println("출력할 구구단의 단을 입력하세요. 구구단의 단은 2~9사이 입력");
                // 구구단 출력
                while(true){
                    int foo = scan.nextInt();
                    if(foo>=2 && foo<=9){
                        for(int firstValue =1 ; firstValue<=9 ; firstValue++){
                            System.out.println(foo + "x" + firstValue + "=" + (foo*firstValue));
                        } break;
                    } else{
                        System.out.println("2~9사이 정수를 입력하세요");
                    }
                }// 예외처리
            } else if(inputValue==2){
                System.out.println("이용해주셔서 감사합니다");
                break;
            } else {
                System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
            }
        }



       
    }
}


