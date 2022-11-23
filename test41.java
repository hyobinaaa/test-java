public class test41 {
    public static void main(String[] args) {
        // 난수 발생
        // Math.random(); // -> 0이상 ~ 1미만의 실수 값.

        // 1~10
        //0 ~ 9.9999999999
      
        // 로또 번호 생성 프로그램 작성
        // 1 ~ 45 중복되지 않은 정수 6개 랜덤으로 선택
        // 정수 6개는 배열에 저장.
         
        int lotto[] = new int[6]; // 배열 6개 들어 갈수있도록 선언
        

         //로또 번호 나열
        
        for(int foo = 0 ; foo < lotto.length ; foo++){ // 6번 반복
            
            int randomNum  = (int)(Math.random() * 45) + 1; //로또 번호 랜덤으로 출력
            
            for(int bar = 0 ; foo < bar ; bar++ ){ //랜덤 넘버 를 배열에 집어 넣음
                if(randomNum == lotto[bar]){
                    foo--;
                }   
                
                
            }
            lotto[foo] = randomNum;
            

        }
        for(int i = 0;i<lotto.length;i++)
            System.out.println(lotto[i]);
        
    }
    
}
