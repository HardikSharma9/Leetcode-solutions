import java.util.*;


class Solution {
    public boolean dfs(int node, int dest, List<List<Integer>> adj, boolean[] visited) {
        if (node == dest) {
            return true;
        }
        visited[node] = true;
        for (int neighbor : adj.get(node)) {
            if (!visited[neighbor]) {
                if (dfs(neighbor, dest, adj, visited)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean validPath(int n, int[][] edges, int source, int destination) {
        // Build adjacency list
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        
        // Visited array to keep track of visited nodes
        boolean[] visited = new boolean[n];
        
        return dfs(source, destination, adj, visited);
    }
}