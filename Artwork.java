class Artwork{
 	private String title;
	private int year;
	private Artist artist;
	Artwork(String title,int year,Artist artist){
		this.title=title;
		this.year=year;
		this.artist=artist;
	}
	Artwork(String title, int year){
		this.title=title;
		this.year=year;
		this.artist=new Artist("Unkown");
	}
	//Shallow Copy
	/*Artwork(Artwork a,boolean shallow){
		this.title=a.title;
		this.year=a.year;
		this.artist=a.artist;
	}*/
	public Artwork shallowCopy(){
	return new Artwork(this.title,this.year,this.name)
	}



	//Deep Copy
	Artwork(Artwork a){
	this.title=a.title;
	this.year=a.year;	
	this.artist=new Artist(a.getArtist().getName());
	}
	public Artwork deepCopy(){
	return new Artwork(this.title,this.year,new Artwork(this.name)
	}
	public void setTitle(String title){
		this.title=title;
	}
	public String getTitle(){
		return title;
	}
	public void setYear(int year){
	 	this.year=year;
	}
	public int getYear(){
		return year;
	}
	public void setArtist(Artist artist){
		this.artist=artist;
	}
	public Artist getArtist(){
		return artist;
	}
	
	public String toString(){
	return String.format("Name: %s  \nTitle:  %s\nYear: %d",artist.getName(),getTitle(),getYear());
	}
	public void display(){
	System.out.println("Title : "+getTitle());
	System.out.println("Year : "+getYear());
	artist.display();
	}

}