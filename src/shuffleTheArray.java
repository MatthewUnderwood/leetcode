public class shuffleTheArray {
    public int[] shuffle(int[] nums, int n) {
        //declarations
        int[] shuffledArray = new int[n*2];
        int counter = 0;

        // loop for inputing even shuffles
        for(int i = 0; i < n; i++){
            shuffledArray[counter] = nums[i];
            counter++;
            counter++;
        }
        //reset the counter and another loop for odd shuffles
        counter = 1;
        for(int i = 0; i < n; i++){
            shuffledArray[counter] = nums[i + n];
            counter++;
            counter++;
        }
        return shuffledArray;
    }
}
