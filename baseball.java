import java.util.Scanner;

public class baseball {
    public static void main(String[] args) {
        // 숫자야구 게임

        // 숫자 야구 게임 유저와 카운터 변수

        int Computer[] = new int[3]; // 컴퓨터가 무작위로 입력한 변수
        int My[] = new int [3]; // 내가 무작위로 입력한 변수
        int strike = 0; // 스트라이크 나타내는 변수
        int ball = 0;  //  볼 나타내는 변수


       
        // 중복 숫자가 있으면 전단계로 돌아가게 한다

       for(int i = 0; i < Computer.length; i++){
        Computer[i] = (int)(Math.random() * 9  + 1); // 숫자 랜덤 돌려서 
            for(int j = 0; j < i; j++){ // 숫자를 비교해서 같은 숫자 있는지 확인
        if(Computer[i] == Computer[j]){ // 만약에 숫자 중복시
            i--;
            break; // 빠져 나가게 한다
            
            

          }
        }
     } 

        // 내가 입력한 숫자와 비교해서 볼 스트라이크 구분 하기
        Scanner scn = new Scanner(System.in);
        int count = 1;
        while(true) {
            for(int i =0; i < My.length; i++){
                System.out.println("시도 횟수:" + count);
                count++; // 입력 할때 시도 횟수 증가
                My[i] = scn.nextInt(); 
                for(int j = 0; j < i; j++){
                    if(My[j] == My[i]){
                        // i에 들어간 중복된 숫자 확인
                        System.out.println("정수 3개 값을 입력하세용~~^^");
                        i--;
                        break;
                    }
                }
            }
            // 두개 비교 하여 ball 과 strike 결과 내기

        }






    }
    
}
