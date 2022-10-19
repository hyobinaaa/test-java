import javax.lang.model.util.ElementScanner14;

public class test29 {
    public static void main(String[] args) {
        // 흐름제어문 : 기본 , 선택 , 반복
        // 선택 + 반복 -> 조건식
        // 선택 또는 반복시 실행되는 문장은 
        // -> 기본 : 기본 조건식 다음 한 문장이 실행된다.
        // -> 그룹화 : {  }를 이용하여 선택 또는 반복문을 실행된다.
        //             실행되는 코드들을 그룹화 할 수 있다.
        // -> 조건식을 판단후 리턴 하는 결과값은 boolean 갑 (true , false)

       

      // 출력갑 2 , 3 
        

        // < 선택문 >

        // if : 1개중 0개 또는 1개
        // -> if (조건식) 실해 될 문장;


        // if - else : 2개 중에 1개 - > 선택 하는것은 무조건 하나만 선택(무조건 0이 될수없음)
        // cf , if 문에서는 최대로 선택 할수있는 갯수는 1개이다(max)
        if (3 > 3)
            System.out.println("참");
        else
            System.out.println("거짓");
        
        
        // if..... else if : n개 중에 1개 또는 0개 (두개 이상 선택 할려면 조건식을 변경 하던지 아니면 두개로 분리)
        if(2 > 3)
            System.out.println(1);
        else if(2 > 4)
            System.out.println(2);
        else if(2 > 1)
            System.out.println(3);
        else if(2 > 4)
            System.out.println(4);
        else if(2 > 4)
            System.out.println(5);

        System.out.println(6);
        // if -  else if.....else : n개 중에 1개
        if(2 > 3)
            System.out.println(1);
        else if (3 > 4)
            System.out.println(2);
        else if(3 > 4)
            System.out.println(4);
        else
            System.out.println(4);

        System.out.println(5);
        
        
        // switch : n개 중에 0 ~ n개 

    }       
}
