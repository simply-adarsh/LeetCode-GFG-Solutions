class Solution {
    public int fib(int n) {
        int a = 0;
        int b = 1;
        int ans = 0;
        if (n==0){
            ans = a;
        }
        else if(n==1){
            ans = b;
        }
        else{
            int i = 1;
            while(n>i){
                int temp = b;
                b=a+b;
                a=temp;
                ans = b;
                i++;
                
                
            }
        }
        return ans ;
    }
}