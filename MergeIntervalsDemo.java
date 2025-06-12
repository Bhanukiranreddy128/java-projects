package java11_6_2025;

import java.util.*;

public class MergeIntervalsDemo {

    public static int[][] merge(int[][] intervals) {
        if (intervals.length <= 1)
            return intervals;

        // Step 1: Sort intervals by start time
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> merged = new ArrayList<>();

        // Step 2: Iterate and merge
        int[] current = intervals[0];
        merged.add(current);

        for (int[] interval : intervals) {
            int currentEnd = current[1];
            int nextStart = interval[0];
            int nextEnd = interval[1];

            if (nextStart <= currentEnd) {
                // Overlapping — merge them
                current[1] = Math.max(currentEnd, nextEnd);
            } else {
                // No overlap — add new interval
                current = interval;
                merged.add(current);
            }
        }

        // Convert List to array
        return merged.toArray(new int[merged.size()][]);
    }

    public static void main(String[] args) {
        int[][] intervals = {
            {1, 3},
            {2, 6},
            {8, 10},
            {15, 18}
        };

        int[][] result = merge(intervals);

        System.out.println("Merged Intervals:");
        for (int[] interval : result) {
            System.out.println(Arrays.toString(interval));
        }
    }
}

