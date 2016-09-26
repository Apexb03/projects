
public class CricketPlayerDemo {

	public static void main(String[] args) {
		CricketPlayer[]c=new CricketPlayer[5];
		c[0]=new CricketPlayer("MSD", 5, 500, (float) 9.4);
		c[1]=new CricketPlayer("VK", 3, 400, (float) 8.9);
		c[2]=new CricketPlayer("ST", 10, 730, (float) 14);
		c[3]=new CricketPlayer("SR", 9, 300, 5);
		c[4]=new CricketPlayer("GG", 2, 300, 10);
		CricketPlayer.sortCricketplayer();
		int totalRuns = 0;
		for(int i=0;i<c.length;i++)
		{
			c[i].sortCricketPlayer(totalRuns);
		}
		
	}

}
