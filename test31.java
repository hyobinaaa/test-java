import java.util.Scanner;



public class test31 {
    public static void main(String[] args) {
     
        // 구구단 출력
        for(int firstValue = 1; firstValue<=9; firstValue++){
            //짝수단 만 출력
            if(firstValue % 2 == 0){
                //단을 출력
                for(int inputValue =1; inputValue<=9;inputValue++){
                    System.out.print(firstValue+"x"+inputValue+"="+(inputValue*firstValue));
                    if(inputValue%3==0){
                        System.out.println();
                    }
                    // 식이 끝났을때 들여쓰기
                    else{
                        System.out.print("\t");
                    }
                }
                 // 줄바꿈
                System.out.println();
            }
            
        }
       


       
}
}
    


