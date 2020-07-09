public class CreateTargetArrayInTheGivenOrder {
    public int[] createTargetArray(int[] nums, int[] index) {
        int length =  nums.length;
        int[] target = new int[length];
        for(int i = 0; i < length; i++){
            if(index[i] < i){
                //move everything above index up one and insert index value
                for(int j = 0; j < i - index[i] ; j++){
                    target[i - j] = target[i - (j + 1)];
                }
                target[index[i]] = nums[i];
            }
            else{
                target[index[i]] = nums[i];
            }
        }
        return target;
    }
}
