class Solution {
    public double my_power(double x,long n ){
        //for logn approach
         if(n==0)return 1;
         double temp=my_power(x,n/2);
         if(n%2==0)return temp*temp;
         else{return temp*temp*x;
         }
    }
    public double myPow(double x, int n) {
        long power=n;
    if(n<0){
       return 1.0/my_power(x,-power);
    }else return my_power(x,power);
     
    }
}