class Solution {
    public int smallestEvenMultiple(int n) {
        int EvenMultiple;
        if (n%2==0){
         EvenMultiple = n; 
        }
         else {
            EvenMultiple = 2*n;
            }
        return EvenMultiple;
        }

    }
