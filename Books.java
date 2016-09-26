
public class Books {
	void ReferenceSection(int iHrs){
		System.out.println("REFERENCE SECTION");
		System.out.println("Visitor is allowed for 4hrs");
		System.out.println("Visitor has visited for (hrs)" +iHrs);
		if(iHrs>=4)
			System.out.println("=>Visiting hours is over");
		else
			System.out.println("=>Enjoy the remaining hours");
		System.out.println("----------");
	}
	void DigitalSection(int iTime){
		System.out.println("DIGITAL SECTION");
		System.out.println("Open from 4:00pm to 6:00pm");
		if(iTime>=4 && iTime<=6){
			System.out.println("Time is (pm)" +iTime);
			System.out.println("=>Welcome to digital section ");
		}
		else{
			System.out.println("Time is (pm)" +iTime);
			System.out.println("Digital section is closed");
		}
		System.out.println("----------");		
	}
	void Penalty(int iDays){
		System.out.println("PENALTY");
		System.out.println("No of Days:" +iDays);
		int days = 0;
		if(iDays>=16 && iDays<21)
			days=iDays*20;
		if(iDays>=21 && iDays<28)
			days=iDays*50;
		if(iDays>=28 && iDays<35)
			days=iDays*150;
		if(iDays>=35)
			days=iDays*300;
		System.out.println("Penalty:" +days);
		System.out.println("----------");
	}
	void QuestionPaper(String Dept,int year){
		System.out.println("QUESTION PAPER SECTION");
		if(Dept=="CS"){
			System.out.println("Department:CS");
			System.out.println("Year:" +year);
		}
		if(Dept=="EE"){
			System.out.println("Department:EE");
			System.out.println("Year:" +year);
		}
		if(Dept=="EC"){
			System.out.println("Department:EC");
			System.out.println("Year:" +year);
		}
	}
}
