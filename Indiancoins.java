package _13_GreedyAlgorithm;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Arrays;

public class Indiancoins {
    public static void main(String[] args) {
      /*   int coins[]={1,2,5,10,20,50,100,200,500,2000};
        int amount=590;
        int count=0;
        for(int i=coins.length-1;i>=0;i--){
            if(amount>=coins[i]){
                count+=amount/coins[i];
                amount=amount%coins[i];
            }
            if(amount==0){
                break;
            }
        }
        System.out.println("minimum number of coins required is "+count);
    */
    Integer coins[]={1,2,5,10,20,50,100,200,500,2000};
    
    Arrays.sort(coins,Comparator.reverseOrder());
    int amount=590;
    int countofcoins=0;
    ArrayList<Integer> list=new ArrayList<>();
    for(int i=0;i<coins.length;i++){
    if(coins[i]<=amount){
        while(coins[i]<=amount){
            countofcoins++;
            list.add(coins[i]);
            amount-=coins[i];
        }
    }
}
System.out.println("total coins required are "+countofcoins );
for(int i=0;i<list.size();i++){
    System.out.print(list.get(i)+" ");
}
    }
}
