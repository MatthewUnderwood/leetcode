public class CellsWithOddValuesInAMatrix {
    public int oddCells(int n, int m, int[][] indices) {

        int[][] Matrix = new int[n][m];
        int oddCount = 0;
        int indicesCounter = 0;

        while(indicesCounter < indices.length){
            int row = indices[indicesCounter][0];
            for(int i = 0; i < m; i++){
                Matrix[row][i] += 1;
            }
            int column = indices[indicesCounter][1];
            for(int j = 0; j < n; j++){
                Matrix[j][column] += 1;
            }
            indicesCounter++;
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(Matrix[i][j] % 2 != 0){
                    oddCount++;
                }
            }
        }
        return oddCount;
    }
}
