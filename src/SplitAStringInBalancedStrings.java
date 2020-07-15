public class SplitAStringInBalancedStrings {
    public int balancedStringSplit(String s) {
        int splitCount = 0;
        int lCount = 0;
        int rCount = 0;
        int lengthOfS = s.length();
        for(int i = 0; i < lengthOfS; i++){
            if(s.charAt(i) == 'R'){
                rCount++;
            }
            else{
                lCount++;
            }
            if(rCount ==  lCount){
                splitCount++;
                rCount = 0;
                lCount = 0;
            }
        }
        return splitCount;
    }

}
