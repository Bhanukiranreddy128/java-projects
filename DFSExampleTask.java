package proficinalTask;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class DFSExampleTask {
    private Map<String, List<String>> connections = new HashMap<>();

    public void addConn(String name, String connection) {
        connections.computeIfAbsent(name, k -> new ArrayList<>()).add(connection);
        connections.computeIfAbsent(connection, k -> new ArrayList<>()).add(name);
    }

    public List<String> findSocialCircle(String person) {
        Set<String> visited = new HashSet<>();
        List<String> result = new ArrayList<>();
        dfsHelper(person, visited, result);
        return result;
    }

    private void dfsHelper(String person, Set<String> visited, List<String> result) {
        if (visited.contains(person)) return;
        visited.add(person);
        result.add(person);
        for (String neighbor : connections.getOrDefault(person, new ArrayList<>())) {
            dfsHelper(neighbor, visited, result);
        }
    }

    public List<String> findSocialCircleIterative(String person) {
        Set<String> visited = new HashSet<>();
        List<String> result = new ArrayList<>();
        Stack<String> stack = new Stack<>();
        stack.push(person);
        while (!stack.isEmpty()) {
            String current = stack.pop();
            if (!visited.contains(current)) {
                visited.add(current);
                result.add(current);
                for (String neighbor : connections.getOrDefault(current, new ArrayList<>())) {
                    stack.push(neighbor);
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        DFSExampleTask socialconn = new DFSExampleTask();
        socialconn.addConn("vamsi", "krishna");
        socialconn.addConn("krishna", "pandu");
        socialconn.addConn("pandu", "Praveen");
        socialconn.addConn("Praveen", "saketh");
        socialconn.addConn("saketh", "subash");
        socialconn.addConn("john", "doe");

        System.out.println("Recursive DFS (Social circle of vamsi):");
        System.out.println(socialconn.findSocialCircle("vamsi"));

        System.out.println("\nIterative DFS (Social circle of vamsi):");
        System.out.println(socialconn.findSocialCircleIterative("vamsi"));

        System.out.println("\nRecursive DFS (Social circle of john):");
        System.out.println(socialconn.findSocialCircle("john"));
    }
}
