class Solution {
    public boolean isSameAfterReversals(int num) {
        boolean bool = true;
    if (num%10!=0){  
    bool = true;
    }
    else if(num!=0){ 
       if (num%10==0) {
        bool = false;}
        else { bool = true;}
    }
    
    return bool;
    }
}