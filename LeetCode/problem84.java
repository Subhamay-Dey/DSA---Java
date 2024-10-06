package LeetCode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class problem84 {
    class Solution {
    Map<String, PriorityQueue<String>> graph = new HashMap<>();
    LinkedList<String> res = new LinkedList<>();
    
    public List<String> findItinerary(List<List<String>> tickets) {
        // Create the graph in lexical order using a PriorityQueue to maintain lexical order automatically
        for (List<String> ticket : tickets) {
            String start = ticket.get(0);
            String end = ticket.get(1);
            if (!graph.containsKey(start)) {
                graph.put(start, new PriorityQueue<>());  // PriorityQueue ensures automatic sorting
            }
            graph.get(start).add(end);
        }
        
        // Start DFS traversal from "JFK"
        dfs("JFK");
        return res;
    }
    
    private void dfs(String start) {
        // Use the PriorityQueue to get the smallest lexical order first
        while (graph.containsKey(start) && !graph.get(start).isEmpty()) {
            String next = graph.get(start).poll();  // Remove and get the smallest lexical destination
            dfs(next);
        }
        // Add the airport to the result as we backtrack
        res.addFirst(start);  // Add at the beginning to avoid reversing later
    }
}

}
