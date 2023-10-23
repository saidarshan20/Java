public class trapped{
    public static int TrappingRainwater(int heights[]){
        int n = heights.length;

        //to store max of left
        int maxLeft[] = new int[n];
        maxLeft[0] = heights[0];
        for(int i=1; i<n; i++){
            maxLeft[i] = Math.max(heights[i], maxLeft[i-1]);
        }

        //to store max of right
        int maxRight[] = new int[n];
        maxRight[n-1] = heights[n-1];
        for(int i=(n-2); i>=0; i--){
            maxRight[i] = Math.max(heights[i], maxRight[i+1]);
        }

        //loop
        int trapped_water = 0;
        for(int i=0; i<n; i++){
            //find min
            int waterlevel = Math.min(maxLeft[i], maxRight[i]);
            
            //compute formula (water_level - height)*width //here width is equal to 1 so are going to ignor it.
            trapped_water += waterlevel - heights[i];
        }
        return trapped_water;
    }
    public static void main(String args[]){
        int height[] = {4,2,0,6,3,2,5};
        System.out.println(TrappingRainwater(height)); 
    }
}