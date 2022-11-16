public class test37 {
    public static void main(String[] args) {
        

        for(;;){ // 반복문
            int foo = 0; // 변수선언
            int bar = 2;
            while(true){ // 참일때
                if(foo > 2){
                    break; // foo 3이 되면 빠져나감

                }
                for(;;){
                    if(bar > 4)
                        break; // bar 가 5이상이면 빠져나감

                    bar++; // 증가
                    System.out.println(1);
                }
                foo++; // 증가
                System.out.println(2);
            }
            System.out.println(3);
            break;
        }
    }
    
}
