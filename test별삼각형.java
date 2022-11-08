public class test별삼각형 {
    public static void main(String[] args) {
        // 별 삼각형

        // 별 행 만들기
        for(int stararow = 0 ; stararow <= 4 ; stararow++){
            // 별 라인 만들기
            for(int starline = 0 ; starline < stararow ; starline++){
                System.out.print("*");
            }
            System.out.println("");
        }

    }
    
}
