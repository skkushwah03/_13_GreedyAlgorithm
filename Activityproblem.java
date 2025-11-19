package _13_GreedyAlgorithm;
import java.util.*;

public class Activityproblem {
    public static void main(String[] args) {
        int start[] = {1, 3, 0, 5, 8, 5};
        int end[] = {2, 4, 6, 7, 9, 9};
        int n = start.length;

        System.out.println("Following activities are selected:");

        ArrayList<Integer> list = new ArrayList<>();

        // Create array to store activity index, start and end times
        int activities[][] = new int[n][3];

        for(int i = 0; i < n; i++){
            activities[i][0] = i;      // Activity index
            activities[i][1] = start[i]; // Start time
            activities[i][2] = end[i];   // End time
        }

        // Sort activities by end time
        Arrays.sort(activities, Comparator.comparingInt(o -> o[2]));

        // Select first activity
        int maxact = 1;
        list.add(activities[0][0]);
        int lastend = activities[0][2];

        // Iterate over remaining activities
        for(int i = 1; i < n; i++){
            if(activities[i][1] >= lastend){
                maxact++;
                list.add(activities[i][0]);
                lastend = activities[i][2];
            }
        }

        System.out.println("Maximum number of activities: " + maxact);
        for(int i = 0; i < list.size(); i++){
            System.out.print("A" + list.get(i) + " ");
        }
    }
}
