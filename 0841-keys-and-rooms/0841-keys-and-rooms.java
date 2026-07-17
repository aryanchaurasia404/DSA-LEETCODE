class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        
        boolean[] vis= new boolean[rooms.size()];
        dfs(rooms,0,vis);
        // Can DFS visit all nodes?
        for(int i=0; i<rooms.size(); i++){
            if(!vis[i]){
                return false;
            }
        }
        return true;
    }

    void dfs(List<List<Integer>> rooms, int index, boolean[] vis){
        //visit to what is inside each index
        vis[index]=true;

        //inside that index process elements 
        for(Integer i: rooms.get(index)){
          if(!vis[i]){
            dfs(rooms, i, vis);
          }
        }
        
    }
}