class Solution {
    public void shortestDistance(int[][] dist) {
        int n = dist.length;
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                if(dist[i][j] == -1){
                    dist[i][j] = (int) 1e9;
                }
                if(i == j) dist[i][j] = 0;
            }
        }
        for(int k = 0 ; k < n ; k++){
            for(int i = 0 ; i < n ; i++){
                for(int j = 0 ; j < n ; j++){
                    dist[i][j] = Math.min(dist[i][j],dist[i][k] + dist[k][j]);
                }
            }
        }
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                if(dist[i][j] == (int) 1e9){
                    dist[i][j] = -1;
                }
            }
        }
    }
}

