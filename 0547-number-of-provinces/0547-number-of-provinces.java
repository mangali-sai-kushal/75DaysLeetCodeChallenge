class Solution {
        boolean[] visited;
        int[][] graph;
    public int findCircleNum(int[][] isConnected) {
        graph=isConnected;
        visited=new boolean[graph.length];
        int cnt=0;
        for(int i=0;i<graph.length;i++)
        {
            if(!visited[i])
            {
                dfs(i);
                cnt++;
            }
        }
        return cnt;
        
    }
    void dfs(int i)
    {
        visited[i]=true;
        for(int j=0;j<graph.length;j++)
        {
            if(!visited[j] && graph[i][j]==1)
            {
                dfs(j);
            }
        }
    }
}