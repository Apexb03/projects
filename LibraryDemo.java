
public class LibraryDemo {

	public static void main(String[] args) {
		Library l=new Library(2, 16);
		Books b=new Books();
		b.ReferenceSection(2);
		b.DigitalSection(4);
		b.Penalty(16);
		b.QuestionPaper("EC", 2016);
	}

}
