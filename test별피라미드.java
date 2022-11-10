

public class test별피라미드 {
    public static void main(String[] args) {
        // 별 피라미드 만들기

        // 별 행 만들기
        for(int starrow = 0 ; starrow < 4 ; starrow++){ // 행이 4개 이다

            // 별 라인 만들기 

            for(int starline = 0 ; starline < 3 - starrow  ; starline++){ // 라인도 4줄이다

                System.out.print(" ");
            }
            
            // 일반적인 삼각형 모양에서 라인 더만들기 

            for(int starline = 0 ; starline < 2 * starrow + 1 ;starline++){
                System.out.print("*");
            }
            System.out.println(" ");
            
        }

        

    }

} 
        
    
    

