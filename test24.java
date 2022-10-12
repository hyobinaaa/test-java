import java.util.Scanner;

public class test24 {
    public static void main(String[] args) {
        // 삼항연산자
        // 조건식? 참 일때 선택 값 : 거짓 일때 선택 값
        // 이유? if else를 간략하게 표시할때
        
      Scanner scan = new Scanner(System.in);
      int inputValue = scan.nextInt();
      String value;

      System.out.println((inputValue == 1) ? "남성" : "여성");
       // 1 -> 남성
       if(inputValue == 1) {
        value = "남성";
     }
     // 그외 -> 여성
     else {
        value = "여성";
     }
     
  }
}

      
      

        
    
    