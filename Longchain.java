
package _13_GreedyAlgorithm;
import java.util.*;
public class Longchain {
    public static void main(String[] args) {
        int arr[][]={{5,24},{39,60},{5,28},{27,40},{50,90}};
        Arrays.sort(arr,Comparator.comparingInt(o->o[1]));
        int chainlen=1;
        int lastend=arr[0][1];//last selected end time
        for(int i=1;i<arr.length;i++){
            if(arr[i][0]>=lastend){
                chainlen++;
                lastend=arr[i][1];
            }
        }
        System.out.println("longest chain is "+chainlen);
    }
}
