class Solution {
    public double myPow(double x, int n) {
        long N = n;
        boolean negative = N < 0;
        // handle negative number
        if(N < 0){
            N = -N;
        }
        double ans = 1.0;
        // binary exponantiation 
        while(N > 0){
            // if expomemmet is odd
            if(N % 2 == 1){
                ans *=  x;
            }
            x *= x;
            // divide exponent by 2
            N /= 2;
        }
        if(negative){
            ans = 1.0 / ans;
        }
        return ans;
        
    }
}