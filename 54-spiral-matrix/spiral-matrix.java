import java.util.*;
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> result=new ArrayList<>();

        int n=matrix.length;
        int m=matrix[0].length;
        int srow=0, scol=0, erow=n-1,ecol=m-1;

     while(srow<=erow && scol<=ecol){
         //TOP boundary for first row-> 1,2,3
          for(int j=scol;j<=ecol;j++){
            result.add(matrix[srow][j]);
          }
        //RIGHT boundary for last col->6,9
        for(int i=srow+1;i<=erow;i++){
            result.add(matrix[i][ecol]);
        }  
        //BOTTOM  boundary for last row->8,7
        for(int j=ecol-1;j>=scol;j--){
            if(srow==erow){
                break;
            }
            result.add(matrix[erow][j]);
        }  
         //LEFT boundary for first col->4
        for(int i=erow-1;i>=srow+1;i--){
            if(scol==ecol){
                break;
            }
            result.add(matrix[i][scol]);
        } 
        srow++;erow--;scol++;ecol--;
     }
       
        return result;
    }
}