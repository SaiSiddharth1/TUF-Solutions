class Solution {
    public int minimumMultiplications(int[] arr, int start, int end) {
       int mod = (int) 1e5;
       int[] dist = new int[mod];
       Arrays.fill(dist,Integer.MAX_VALUE);

       Queue<int[]> pq = new LinkedList<>();
       pq.add(new int[]{start,0});
       dist[start] = 0;
       while(!pq.isEmpty()){
        int[] curr = pq.remove();
        int s = curr[0];
        int lvl = curr[1];
        if(s == end) return lvl;
        for(int x : arr){
            int newS = (s * x) % mod;
            int newlvl = lvl + 1;
            if(newlvl < dist[newS]){
                dist[newS] = newlvl;
                if(newS == end) return newlvl;
                pq.add(new int[]{newS,newlvl});
            }
        }
       }
       return -1;
    }
}
