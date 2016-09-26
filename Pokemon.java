
public class Pokemon {
	int iPokeID;
	String sPokeName;
	String sType;
	int iInitialCP;
	int iTotalMatchesPlayed;
	int iWon;
	int iLost;
	float fFinalCP;
	public Pokemon(int iPokeID, String sPokeName, String sType, int iInitialCP, int iTotalMatchesPlayed, int iWon,
			int iLost) {
		super();
		this.iPokeID = iPokeID;
		this.sPokeName = sPokeName;
		this.sType = sType;
		this.iInitialCP = iInitialCP;
		this.iTotalMatchesPlayed = iTotalMatchesPlayed;
		this.iWon = iWon;
		this.iLost = iLost;
		//this.fFinalCP = fFinalCP;
	}
	void calPokemonCP(){
		if(iWon>iLost)
		{
			if(iWon>=1 && iWon<=20)
				fFinalCP=(float) ((iWon-iLost)*0.1+iInitialCP);
			if(iWon>=21 && iWon<=40)
				fFinalCP=(float) ((iWon-iLost)*0.25+iInitialCP);
			if(iWon>=41 && iWon<=60)
				fFinalCP=(float) ((iWon-iLost)*0.4+iInitialCP);
			if(iWon>60)
				fFinalCP=(float) ((iWon-iLost)*0.5+iInitialCP);
		}
		else
		{
			if(iLost>=1 && iLost<=20)
				fFinalCP=(float) ((iLost-iWon)*0.1-iInitialCP);
			if(iLost>=21 && iLost<=40)
				fFinalCP=(float) ((iLost-iWon)*0.25-iInitialCP);
			if(iLost>=41 && iLost<=60)
				fFinalCP=(float) ((iLost-iWon)*0.4-iInitialCP);
			if(iLost>60)
				fFinalCP=(float) ((iLost-iWon)*0.5-iInitialCP);
		}
	}
	void display(){
		System.out.println("Pokemon Name:" +sPokeName);
		System.out.println("Pokemon ID:" +iPokeID);
		System.out.println("Pokemon Type:" +sType);
		System.out.println("Initial CP:" +iInitialCP);
		System.out.println("Total Matches Played:" +iTotalMatchesPlayed);
		System.out.println("Matches Won:" +iWon);
		System.out.println("Matches Lost:" +iLost);
		System.out.println("Final CP:" +fFinalCP);
	}
}
