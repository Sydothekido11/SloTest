package input.model;

public class SloModel
{
	private String movie;
	private int family;
	private double height;
	
	
	public SloModel()
	{
		movie = "";
		family = 6;
		height = 176.5;		
	}
	
	public SloModel (String movie, int family, double height)
	{
		this.movie = movie;
		this.family = family;
		this.height = height;
	}
	
	public String getMovie()
	{
		return movie;
	}
	
	public int getFamily()
	{
		return family;
	}
	
	public double getHeight()
	{
		return height;
	}
	
	
	public void setMovie(String movie)
	{
		this.movie = movie;
	}
	
	public void setFamily(int family)
	{
		this.family = family;
	}
	
	public void setHeight(double height)
	{
		this.height = height;
	}

	//public String toString()
	//{
		//String sloInfo = "Your favorite movie is " + movie + " and you have " + family + " people in your family and you are " + height + " centimeters tall.";
		
		//return sloInfo;
	//}
}







