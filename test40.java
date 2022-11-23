import java.util.Scanner;

public class test40 {
    public static void main(String[] args) {
        //배열(array)

        int bar[] = new int[4];

        for(int i =0  , j = 5; i < bar.length; i++ , j--){

            bar [i] = j;

        }

        int foo[];

        foo = bar;

        foo[0] = 10;

        System.out.println(bar[0]);
       


        
       
    }
    
}
