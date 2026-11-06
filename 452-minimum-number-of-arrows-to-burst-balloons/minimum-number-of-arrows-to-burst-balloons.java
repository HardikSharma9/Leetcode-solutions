import java.util.Arrays;

class Solution {
    public int findMinArrowShots(int[][] points) {
        if (points.length == 0) return 0;
        
        // Sort by end position
        Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));
        
        int arrows = 1;
        int arrowPos = points[0][1]; // First arrow at the end of the first balloon
        
        for (int i = 1; i < points.length; i++) {
            // If the current balloon starts after the arrow position,
            // we need a new arrow
            if (points[i][0] > arrowPos) {
                arrows++;
                arrowPos = points[i][1]; // Place new arrow at this balloon's end
            }
        }
        
        return arrows;
    }
}