import java.util.Scanner;

public class testQuiz2 {
    public static void main(String[] args) {
        // 연산자 프로그램 활용

        // 1 이상의 값만 출력 후 키보드 입력 값 화면에 출력

        Scanner scan = new Scanner(System.in);
        int foo = 1; // 정수 입력 받을때 마다 카운트 증가

        // 입력 횟수 출력후 키보드 값 화면에 출력

        for(;;){
            int inputValue = scan.nextInt();
            if(inputValue<1){
                System.out.println("1이상 양수를 입력 해주세요");
            }else if(inputValue==20000){
                System.out.println("이용해주셔서 감사합니다");
                break; // 20000 입력 받음 과 동시에 프로그램 종료
            }else{
                System.out.println(foo + "번째 입력 값은 = " + inputValue);

                System.out.println(inputValue%2==0? "짝수 입니다." : "홀수 입니다.");

                if(inputValue%3==0){
                    System.out.println("3의 배수입니다");
                }
                if(inputValue%7==0){
                    System.out.println("7의 배수입니다");
                }foo++;
            }
        }
    }
}
    


