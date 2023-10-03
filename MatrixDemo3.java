//Java program to initialize how to declare traversing
//Ch.Henry
//3-10-2023
//MatrixDemo3.java
import java.io.*;
public class MatrixDemo3{
    public static void main(String args[]){
        int arr[][]=new int[3][3];
        arr[0][0]=11;
        arr[0][1]=22;
        arr[0][2]=33;
        arr[1][0]=44;
        arr[1][1]=55;
        arr[1][2]=66;
        arr[2][0]=77;
        arr[2][1]=88;
        arr[2][2]=99;
        System.out.println("Display the matrix elements");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    } 
}
