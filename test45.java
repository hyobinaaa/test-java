public class test45 {
    public static void main(String[] args) {
        // 3차원 배열

        int bar[][][] = {{{1,2,3},{4,5,6}},{{7,8,9},{10,11,12}}};

        // bar[2][2][3]

        // bar[0]
        // 1 2 3
        // 4 5 6


        //bar[1]
        //7 8 9
        //10 11 12

        // Matrix 
       for(int i= 0; i < bar.length;i++){
        // row
        for(int j = 0;j < bar[i].length; j++){
            // col
            for(int k = 0; k < bar[i][j].length; k++){
                System.out.print(bar[i][j][k] + "\t");

            }
        }
       }
    }
    
}
