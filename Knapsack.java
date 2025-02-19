import java.util.*;
class Item{
	int weight,profit;
	double ratio;
	Item(int weight,int profit){
		this.weight=weight;
		this.profit=profit;
		this.ratio=(double) profit/weight;
	}
}
public class Knapsack{
	public static double getmaxprofit(Item[] items, int m){
		Arrays.sort(items,(a,b) -> Double.compare(b.ratio,a.ratio));
		double maxprofit=0;
		System.out.println("Items placed in the bag:");
		for(Item n:items){
			if(n.weight<=m){
				maxprofit += n.profit;
				System.out.println("Item:(Weight: " + n.weight +",profit: " + n.profit +") - Taken Fully");
				m = m - n.weight;
				}
			else{
				double fraction = (double) m / n.weight;
				maxprofit += n.profit * fraction;
				System.out.println("Item:(Weight: " + n.weight*fraction +",profit: " + n.profit*fraction +") - Taken " + fraction*100 +"%");
				break;
			}
		}
		return maxprofit;
		}
	public static void main(String[] args){
		Item[] items = { new Item(18,25), new Item(15,24), new Item(10,15)};
		int m = 20;
		double maxprofit = getmaxprofit(items,m);
		System.out.println("Maximum profit in knapsack:"+maxprofit);
	}
}
