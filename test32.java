import java.util.Scanner;


public class test32 {
    public static void main(String[] args) {
            // 키보드로부터 정수 2개 입력 받아 , M~N 사이의 정수를 출력하라
            Scanner scn = new Scanner(System.in);
            //2개의 정수를 입력 받는다.
            System.out.println("M값을 입력하세요");
            int inputM = scn.nextInt();

            System.out.println("N값을 입력하세요");
            int inputN = scn.nextInt();
            
            if(inputM<inputN){
                System.out.println("M : " + inputM + " ~ N : " + inputN + "사이 정수 값은");
               // 정수 사이 m과n 사이 정수 출력
               for(int i = inputM; i<=inputN; i++){
                // 줄 바꿈 하면 안됨 그래서 ln 뺌
                System.out.print(i);
               }
            }
            else if(inputM>inputN){
                for(int i = inputN; i<=inputM; i++){

                }

                
            }
            else{
                
            }

        }
    
}
