public class Run{
	public static void main(String args[]){
	Artist a=new Artist("jannat");
	Artwork aw=new Artwork("Garden",2024,a);
	System.out.printf("====First Artwork====\n");
	aw.display();
	Artwork aw1=new Artwork("Untitle",2010);
	aw1.setTitle("Wood");
	aw1.setYear(2005);
	System.out.printf("====Second  Artwork====\n");
	aw1.display();
	System.out.printf("====Shallow copy of Artwork 1====\n");
	Artwork temp=aw;
	temp.display();	
	System.out.printf("====Deep copy of Artwork 1====\n");
	Artwork.temp1=new Artwork(aw);
	System.out.printf("====Shallow copy of Artwork 1 before changes====\n");
	aw.display();
	System.out.printf("====Deep copy of Artwork 1 before changes====\n");
	aw1.display();
	artist.setName("Rose");
	System.out.printf("====Shallow copy of Artwork 1 after changes====\n");
	temp.display();
	System.out.printf("====Deep copy of Artwork 1 after changes====\n");
	temp1.display();
   	System.out.print("")
}
}