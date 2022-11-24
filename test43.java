public class test43 {
    public static void main(String[] args) {
        // 1 ~ 50 사이 정수 중 난수로 10개를 선택하시오.

        final int THE_NUM_OF_ELEMNT = 10; // 파이널은 상수를 의미
        
        int bar [] = new int[THE_NUM_OF_ELEMNT];

        for(int i = 0; i < 10 ; i++){
            bar[i] = (int)(Math.random()*50) + 1;
        }
        for(int i = 0; i < 10 ; i++)
            System.out.println(" " + bar[i]);
    }

    
}
