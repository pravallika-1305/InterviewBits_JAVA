import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int tc = scn.nextInt();
        int i,j;
        int n = 1;
        while(tc!= 0) {
            System.out.println("Case #" + n + ":");
            int rows = scn.nextInt();
            for(i = 0;i < rows; i++){
                for(j = 0;j < rows; j++){
                    if ((i + j == ((rows - 1) / 2)) || (j - i == ((rows - 1) / 2)) || (i - j == ((rows - 1) / 2)) || (i + j == ((3 * (rows - 1)) / 2)))
                                System.out.print('*');
                            else
                                System.out.print(' ');
                }
                System.out.print('\r');
                }
        
            tc = tc - 1;
            n = n + 1;
    }
    }
}