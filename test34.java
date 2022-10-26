import java.util.Scanner;

public class test34 {
    public static void main(String[] args) {
       Scanner scn = new Scanner (System.in);

       int n = 0;
       // N값 입력 받기
       // 예외 처리 음수이면 재입력
       while(true){
        System.out.println("N 값을 입력 하세요");
        
        n = scn.nextInt();
        
        if(n >= 1)
            break;
       }
       int sum = 0;
       int firstValue = 0;
       boolean IsFoundFirstValue = false;
       // 1~N 값까지 순회
       for(int  iCount = 1;iCount <= n ; iCount++){
        // 7의 배수 값 
        if(iCount % 7 == 0)
            sum += iCount;
        // 누적 값이 처음으로 100을 넘기는 7의 배수 값 확인
        if(sum >= 100)
            firstValue = iCount;
            IsFoundFirstValue = true;
       }
       
       // 누적값 출력
       System.out.println(sum);
       
       if(IsFoundFirstValue)
           System.out.println(firstValue);
        // 누적값이 100 을 넘길 경우 처음으로 100을 넘기는 7의 배수값 출력


    }    
}
