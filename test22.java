import java.util.Scanner;

public class test22 {
    public static void main(String[] args) {
   //0~100 사이 정수를 키보드로부터 입력 받아
   Scanner scan = new Scanner(System.in);
   int inputValue = scan.nextInt();
    //100 초과 0미만 -> "입력 값 오류"
   if(inputValue>100 || inputValue <0){
        System.out.println("입력 값 오류"); 
   }
    //아래 등급표의 등급을 출력해라
    
   // 90이상 ->a
   else if(inputValue>=90){
    System.out.println("A");
   }
   // 80이상 ->b
   else if(inputValue>=80){
    System.out.println("b");
   }
   // 70이상 ->c
   else if(inputValue>=70){
    System.out.println("c");
   }
   // 60이상 ->d
   else if(inputValue>=60){
    System.out.println("d");
    

   }
   // 60미만 ->f
   else{
    System.out.println("f");
   }


    }
} 

