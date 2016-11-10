package hipster.model;

public class hipster
{
	private String name;
	
	public hipster(String name)
	{
		this.name = name;
	}
	
	public String toString()
	{
		String description = "My name is " + name;
		
		return description;
	}

}
