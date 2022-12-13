import java.util.Scanner;

public class baseball {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        // 숫자 야구 게임(배열 이용)
        final int Num = 3; // 상수 고정값
        int [] randArray = new int [Num]; // 랜덤값 배열
        int [] UserArray = new int [Num]; // 유저값 배열
        int random = 0; // 랜덤 값
        int tried = 0; // 시도 횟수
        int out = 0; // out

        // 0 과 9 사이 난소 생성문 for문
        for(int i = 0; i < Num; i++) {  // 랜덤 값 for 문 생성문
            random = (int)(Math.random() * 9) + 1; // 랜덤 값 생성 0 ~ 9
        // 난수의 중복 확인 for문
        for(int j = 1;j < i; j++) {
            if(random == randArray[j]){  // 랜덤 값 인덱스 값 배열 동일 하면
                random = (int)(Math.random() * 9) + 1; // 랜덤 값 새로 설정
                j = -1; // j -1로 리턴
            } //if(1)
        } // for(2)
        randArray[i] = random; // 중복이 아닐 시 랜덤 배열 인덱스 [0~2] 에 랜덤 값 지정
        System.out.println(randArray[i]);
    }  // for(1)
    
    // 전체 반복문
    while(true){
        int Strike = 0; // 스트라이크 카운트
        int Ball = 0; // 볼 카운트
        tried ++; // 시도 횟수
        System.out.println("시도횟수 : " + tried);
        System.out.println("정수 3개를 입력하세용~~~^^");
    // 입력값 배열 index -> for 문
        for(int inputIndex = 0; inputIndex < Num; inputIndex++){ //Num -> 3번 반복
            while(true){ // 반복
                int inputValue = scn.nextInt(); // 입력값 생성
                UserArray[inputIndex] = inputValue; // 입력 값 배열 index[0 ~ 2] -> 입력 값
            if(UserArray.length == 3){ // 입력 값 배수가 3개이면 종료
                break; // 3개 되면 종료
                } //if(1)
            }   //for(1)
        }   //while(2)
        // break / ball / out 생성
        System.out.println();
        for(int indexI = 0; indexI < Num;indexI++){
            for(int indexj = 0 ;indexj < Num; indexj++){
                if(randArray[indexj] == UserArray[indexj] && indexI == indexj) {
                    Strike++; // 입력 값 / 랜덤 값 동일시 1씩 증가
                } //if문 (1)
                else if(randArray[indexI] == UserArray[indexj] && indexI !=indexj){
                    Ball++; // 입력 값 / 랜덤 값 동일 하지만 인덱스 가 다르면 ball 로 증가
                } // else if 
            } // for (2)
        }     // for(3)
            if(Strike == 0 && Ball == 0){ // strike 도 ball 도 아닐 경우
                out++;; // 아웃 카운트 증가
                System.out.println("OUT" + "아웃" + out + "번");
                System.out.println();
            }
            else if(Strike >=1 && Ball >=1 ){ // strike 도 ball 도 1이면 출력
                System.out.println(Strike + "Strike" + Ball + "Ball");
                System.out.println();
            }
            else if(Strike >= 1){ // strike 만 출력
                System.out.println(Strike + "Strike");
                System.out.println();
            }
            else if(Ball >= 1) { //ball 만 출력
                System.out.println(Ball + "Ball");
                System.out.println();
            }
            // 시도횟수 out 초과 시 종료
            if(tried >= 4){
                System.out.println("게임횟수 초과");
                System.out.println("아까비~~~졌네용...");
                System.out.println("정답은 :" + randArray[0] + randArray[1] + randArray[2]+ "입니다");
                break;
            }
            if(out >= 2){
                System.out.println("투 아웃 입니다.");
                System.out.println("당신의 패배 입니다.");
                break;
            }
            if(Strike == 3){
                System.out.println("3스트라이크");
                System.out.println(" 당신의 승리 입니다.");
                break;
            }
    
    
    
    
        } 
        }
        }
    

