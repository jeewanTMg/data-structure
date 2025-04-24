package linearDataStructure.array.arrayproblem;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
*
*There are n servers numbered from 0 to n - 1 connected by undirected server-to-server connections forming a network where connections[i] = [ai, bi] represents a connection between servers ai and bi. Any server can reach other servers directly or indirectly through the network.

A critical connection is a connection that, if removed, will make some servers unable to reach some other server.

Return all critical connections in the network in any order.



Example 1:


Input: n = 4, connections = [[0,1],[1,2],[2,0],[1,3]]
Output: [[1,3]]
Explanation: [[3,1]] is also accepted.
Example 2:

Input: n = 2, connections = [[0,1]]
Output: [[0,1]]


Constraints:

2 <= n <= 105
n - 1 <= connections.length <= 105
0 <= ai, bi <= n - 1
ai != bi
There are no repeated connections.
*
*
* */
public class SolutionExampleBFSandDFS {
    private int time =0;
    public List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer>[] graph = new ArrayList[n];
        int[] disc = new int[n]; // Discovery time of nodes
        int[] low = new int[n];  // Lowest reachable discovery time
        Arrays.fill(disc, -1);   // Mark all nodes as unvisited

        // Build the adjacency list graph
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }
        for (List<Integer> conn : connections) {
            graph[conn.get(0)].add(conn.get(1));
            graph[conn.get(1)].add(conn.get(0));
        }

        // Run DFS from node 0 (assuming graph is connected)
        dfs(0, -1, graph, disc, low, result);

        return result;
    }

    private void dfs(int u, int parent, List<Integer>[] graph, int[] disc, int[] low, List<List<Integer>> result) {
        disc[u] = low[u] = ++time; // Set discovery & lowest time
        for (int v : graph[u]) {
            if (v == parent) continue; // Ignore the parent node
            if (disc[v] == -1) { // If v is unvisited
                dfs(v, u, graph, disc, low, result);
                low[u] = Math.min(low[u], low[v]); // Update low[u] after DFS

                // If removing (u, v) disconnects the graph, it's a bridge
                if (low[v] > disc[u]) {
                    result.add(Arrays.asList(u, v));
                }
            } else { // If already visited, update low[u]
                low[u] = Math.min(low[u], disc[v]);
            }
        }
    }


    /*
    * Given a string s and an integer k, reverse the first k characters for every
    * 2k characters counting from the start of the string.
     If there are fewer than k characters left, reverse all of them.
* If there are less than 2k but greater than or equal to k characters,
* then reverse the first k characters and leave the other as original.

Example 1:
Input: s = "abcdefg", k = 2
Output: "bacdfeg"
*
Example 2:
Input: s = "abcd", k = 2
Output: "bacd"*/

    public static String reverseStr(String s, int k) {
        char[] arr = s.toCharArray();
        int n = arr.length;

        for (int i = 0; i < n; i += 2 * k) {
            // Determine the end index for reversing (reverse k characters or remaining)
            int left = i, right = Math.min(i + k - 1, n - 1);
            // Reverse the k characters
            while (left < right) {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        return new String(arr);

    }

    public static int camelcase(String s) {
        // Write your code here
        //saveChangesInTheEditor
        char[] datas = s.toCharArray();
        String resultEach = "";
        List<String> result = new ArrayList<>();
        for(char data: datas) {
            if(Character.isUpperCase(data)) {
                result.add(resultEach);
                resultEach ="" + data;
            } else {
                resultEach = resultEach + data;
            }
        }

        return result.size();

    }

    public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
        // Write your code here
        List<Integer> uniqueRanks = new ArrayList<>();
        for (int score : ranked) {
            if (uniqueRanks.isEmpty() || uniqueRanks.get(uniqueRanks.size() - 1) != score) {
                uniqueRanks.add(score);
            }
        }

        List<Integer> result = new ArrayList<>();
        int index = uniqueRanks.size() - 1; // Start from the lowest ranked player

        for (int score : player) {
            // Move up the ranks while player's score is higher
            while (index >= 0 && score >= uniqueRanks.get(index)) {
                index--;
            }
            // Rank is index + 2 since rank starts from 1
            result.add(index + 2);
        }
        return result;
    }


    public void testing(){

        /*
        *
        * 1234
        * 5678
        * 9123
        * 1286
        * */

    }

    public static void main(String[] args) {
//        String input = "abcdefg";
//        String result =reverseStr(input,2);
//
//        System.out.println(result);

//        int x =camelcase("saveChangesInTheEditor");
//        System.out.println(x);

        List<Integer> ranked = Arrays.asList(100,90,90,80);
        List<Integer> player = Arrays.asList(70,80,105);

//        List<Integer> ans=compareTriplets(listAlice,listBob);
        List<Integer> ans  = climbingLeaderboard(ranked,player);
        System.out.println(ans);

    }

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> result = new ArrayList<>();
        Integer bob = 0;
        Integer alice = 0;

        for(int i=0;i<a.size();i++) {
            if(a.get(i) == b.get(i)) {
                //do nothing
            } else if(a.get(i) > b.get(i)) {
                alice++;
            } else {
                bob++;
            }
        }

        result.add(alice);
        result.add(bob);
        return result;
    }




}
