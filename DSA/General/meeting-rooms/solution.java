class Solution {
    public boolean canAttendMeetings(int[][] i) {
        // Your code goes here
        Arrays.sort(i,(a,b)->{
            if(a[0] != b[0]){
                return Integer.compare(a[0],b[0]);
            }
            return Integer.compare(a[0],b[0]);
        });

        int[] curr = {i[0][0],i[0][1]};
        int s = curr[0];
        int e = curr[1];

        for(int x = 1 ; x < i.length ; x++){
            int ss = i[x][0]; 
            int ee = i[x][1];
            if(ss < e && ss > s){
                return false;
            }else if(ee <= e && ee > s) return false;
            s = ss;
            e = ee;
        }
        return true;
    }
}