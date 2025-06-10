package proficinalTask;

import java.util.*;

public class GraphEx {

    public static void main(String[] args) {
        Map<String, List<String>> mp = new HashMap<String, List<String>>();
        mp.put("Reptile", Arrays.asList("Snake Pit"));
        mp.put("Bird Sanctuary", Arrays.asList("Parrot Pavilion"));
        mp.put("Mammal Zone", Arrays.asList("Lion Den", "Elephant Enclosure"));
        mp.put("Parrot Pavilion", new ArrayList<String>());
        mp.put("Lion Den", new ArrayList<String>());
        mp.put("Elephant Enclosure", new ArrayList<String>());

        bfs(mp, "Mammal Zone");
    }

    public static void bfs(Map<String, List<String>> zoo, String start) {
        Queue<String> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();

        queue.add(start);
        visited.add(start);

        while (!queue.isEmpty()) {
            String current = queue.poll();
            System.out.println("Visited : " + current);

            for (String neighbor : zoo.get(current)) {
                if (!visited.contains(neighbor)) {
                    queue.add(neighbor);
                    visited.add(neighbor);
                }
            }
        }
    }
}
