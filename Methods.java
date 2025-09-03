package test;

public class Methods {
	
	static int bookCount = 0;
	public String title = "";
	public String author = "";
	
	public static void main(String[] args) {
		
		
		
		

	}
	
	public static int getCount()
	{
		return bookCount;
	}
	
	public static void setCount(int i)
	{
		bookCount = i;
	}
	
	public void bookInfo()
	{
		System.out.println("Author: " + getAuthor() + ", Title: " + getTitle());
	}
	
	public String getTitle()
	{
		return title;
	}
	
	public void setTitle(String s)
	{
		title = s;
	}
	
	public String getAuthor()
	{
		return author;
	}
	
	public void setAuthor(String s)
	{
		author = s;
	}

}