import java.util.*;

class Pair {
    int node;
    long distance;

    Pair(int node, long distance) {
        this.node = node;
        this.distance = distance;
    }
}

class Solution {
    public int countPaths(int n, int[][] roads) {

        int mod = (int)1e9 + 7;

        // Step 1: Build graph
        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        for (int i = 0; i < roads.length; i++) {
            int u = roads[i][0];
            int v = roads[i][1];
            int wt = roads[i][2];

            adj.get(u).add(new Pair(v, wt));
            adj.get(v).add(new Pair(u, wt));
        }

        // Step 2: Distance and ways array
        long[] dist = new long[n];
        long[] ways = new long[n];

        Arrays.fill(dist, Long.MAX_VALUE);

        PriorityQueue<Pair> pq =
            new PriorityQueue<>((a, b) -> Long.compare(a.distance, b.distance));

        dist[0] = 0;
        ways[0] = 1;

        pq.offer(new Pair(0, 0));

        // Step 3: Dijkstra with path counting
        while (!pq.isEmpty()) {

            Pair current = pq.poll();
            int node = current.node;
            long d = current.distance;

            if (d > dist[node]) continue;

            for (Pair neighbor : adj.get(node)) {
                int next = neighbor.node;
                long newDist = d + neighbor.distance;

                if (newDist < dist[next]) {
                    dist[next] = newDist;
                    ways[next] = ways[node];
                    pq.offer(new Pair(next, newDist));
                }
                else if (newDist == dist[next]) {
                    ways[next] = (ways[next] + ways[node]) % mod;
                }
            }
        }

        return (int)(ways[n - 1] % mod);
    }
}