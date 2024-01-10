import java.util.* ;

import java.io.*; 

public class Solution {

    public static ArrayList<ArrayList<Integer>> zeroMatrix(ArrayList<ArrayList<Integer>> matrix, Integer n, Integer m) {

        // Write your code here.

        int col = 1;

        // use matrix.get(0).get(..) as col hash

        // use matrix.get(..).get(0) as row hash

        for(int i=0;i<n;i++){

            for(int j=0;j<m;j++){

                if(matrix.get(i).get(j)==0){

                    matrix.get(i).set(0,0);

                    if(j!=0) matrix.get(0).set(j,0);

                    else col=0;

                }

            }

        }

        for(int i=n-1;i>0;i--){

          for(int j=m-1;j>0;j--){

            if(matrix.get(i).get(j)!=0){

              if(matrix.get(i).get(0)==0 || matrix.get(0).get(j)==0){

                    matrix.get(i).set(j,0);

              }

            }

          }

        }

        if(matrix.get(0).get(0)==0){

            for(int i=0;i<m;i++) matrix.get(0).set(i,0);

        }

        if(col==0){

            for(int i=0;i<n;i++) matrix.get(i).set(0,0);

        }

        return matrix;

    }

}

