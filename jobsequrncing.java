package _13_GreedyAlgorithm;
import java.util.*;
public class jobsequrncing {
    static class job{
     int deadline;
     int profit;
     int id;
     public job(int i,int id,int p){
        this.id=id;
        this.deadline=i;
        this.profit=p;
     }
    }
    public static void main(String[] args) {
        int jobsinfo[][]={{4,20},{1,10},{1,40},{1,30}};
        ArrayList<job> jobs=new ArrayList<>();
        for(int i=0;i<jobsinfo.length;i++){
            jobs.add(new job(jobsinfo[i][0],i,jobsinfo[i][1]));
        }
        Collections.sort(jobs,(a,b)->b.profit-a.profit);
    ArrayList<Integer>seq=new ArrayList<>();
    int time=0;
    for(int i=0;i<jobs.size();i++){
        job curr=jobs.get(i);
        if(curr.deadline>seq.size()){
            seq.add(curr.id);
            time++;
        }
    
    }
    System.out.println("maximum job"+seq.size());
    for(int i=0;i<seq.size();i++){
        System.out.println(seq.get(i));
    }
    }


}
