class isPalindromeProgram {
    public boolean isPalindrome(int x) {
        int sum=0;
        int t=x;
        if(t>=0){
            while(t!=0){
                int r=t%10;
                sum=sum*10+r;
                t=t/10;
            }
            if(sum==x){
                return true;
            }
        }
        return false;
    }
}
