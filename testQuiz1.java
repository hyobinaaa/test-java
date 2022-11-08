import java.util.Scanner;



public class testQuiz1 {
    public static void main(String[] args) {
        // 구구단 프로그램 만들기
        

        // 메뉴얼 출력하기
        while(true){
            System.out.println("------------");
            System.out.println("1. 구구단 출력");
            System.out.println("2. 프로그램 종료");
            System.out.println("------------");

            // 1을 입력 받았을때 
            Scanner scan = new Scanner(System.in);
            int inputValue = scan.nextInt();
            
                if(inputValue==1){
                    System.out.println("출력할 구구단의 단을 입력하세요. 구구단의 단은 2~9 사이 입력");
                    
                    // 구구단 공식 만들기
                    while(true){
                        int foo = scan.nextInt();
                        if(foo>=2 && foo<=9){
                            for(int firstValue=1; firstValue<=9; firstValue++){
                                System.out.println(foo + "x" + firstValue + "="+(foo*firstValue));
                            }break; // 구구단이 맞으면 아래 구문으로 빠져나가게 하기 위함이다

                            // 예외 처리
                        }else{
                            System.out.println("2~9 사이 정수를 입력해주세요");
                        }
                        }
                    } else if(inputValue==2){{
                        System.out.println("이용해주셔서 감사합니다.");
                        break; // '2' 를 입력 받으면 구구단 프로그램을 종료 시키키 위함이다
                    } 

                    } else{
                        System.out.println("잘못 입력하셨습니다. 다시입력하세요.");
                    }

                    }
                }
            }
            
                
         
        
       
    



