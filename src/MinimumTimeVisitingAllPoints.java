public class MinimumTimeVisitingAllPoints {
    public int minTimeToVisitAllPoints(int[][] points) {
        if(points == null || points.length <= 1) return 0;
        int lengthOne = points.length;
        int xi = 0;
        int yi = 0;
        int xi2 = 0;
        int yi2 = 0;
        int time = 0;
        for(int i = 0; i < lengthOne - 1; i++){
            xi = points[i][0];
            yi = points[i][1];
            xi2 = points[i + 1][0];
            yi2 = points[i + 1][1];
            int difX = xi - xi2;
            int difY = yi - yi2;
            if(Math.abs(difX) >= Math.abs(difY)){
                time = time + Math.abs(difX);
            }
            else{
                time = time + Math.abs(difY);
            }
        }
        return time;
    }
}
