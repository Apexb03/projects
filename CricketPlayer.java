import java.util.Arrays;
import java.util.jar.Attributes.Name;

public class CricketPlayer {
	String name;
	int noOfInnings;
	int totalRuns;
	float batAvg;
	public CricketPlayer(String name, int noOfInnings, int totalRuns, float batAvg) {
		super();
		this.name = name;
		this.noOfInnings = noOfInnings;
		this.totalRuns = totalRuns;
		this.batAvg = batAvg;
	}
	static int sortCricketplayer(){
		int totalRuns[]={500,400,730,300,300};
		System.out.println("Sorted Total Runs:");
		Arrays.sort(totalRuns);
		for(int i=0;i<totalRuns.length;i++)
			System.out.println("Runs:" +totalRuns[i]);
		System.out.println("\n");
		return 1;
	}
	void sortCricketPlayer(int totalRuns){
		System.out.println("PLAYER DETAILS:");
		System.out.println("Player Name:" +name);
		System.out.println("No of Innings:" +noOfInnings);
		System.out.println("Bat Average:" +batAvg);
		System.out.println("\n");
	}
}
