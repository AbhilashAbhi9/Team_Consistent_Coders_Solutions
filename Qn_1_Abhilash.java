import java.io.*;
public class Sq_star_pat {
    static void star_box(int rows,int columns){
        int i,j;
        for(i=1;i<=rows;i++){
            for(j=1;j<=columns;j++){
                if (i == 1 || i == rows || j == 1 || j == columns)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
       int rows=8,columns=22;
        star_box(rows,columns);
    }
}
