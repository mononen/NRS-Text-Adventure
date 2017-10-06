public class Car 
{
	//declare attributes of the object
	private String brand;
	private String model;
	private int horsepower;
	//no need for zero argument constructor
	//loaded constructor
	public Car(String brand, String model, int horsepower)
	{
		this.brand = brand;
		this.model = model;
		this.horsepower = horsepower;
	}
	//getters and setters
	public String getBrand()
	{
		return this.brand;
	}
	public void setBrand(String brand)
	{
		this.brand = brand;
	}
	public String getModel()
	{
		return this.model;
	}
	public void setModel(String model)
	{
		this.model = model;
	}
	public int getHorsepower()
	{
		return this.horsepower;
	}
	public void setHorsepower(int horsepower)
	{
		this.horsepower = horsepower;
	}
	
}