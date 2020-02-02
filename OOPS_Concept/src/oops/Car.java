package oops;

public class Car /*
						 * Statement that create a new class. public is an access modifier. class is a
						 * blueprint of the object that we are creating
						 */


{

    private int doors;
    private int wheels;
    private String model; // we can not access in main java. to do that we have to create a public methode
    private String engine;
    private String colour;
    public void setmodel(String model)
    {
    	String validmodel = model.toLowerCase();
    	if(validmodel.equals("careera") || validmodel.equals("911"))
    	{
    		this.model=model;
    	}
    	//this.model=model;
    	else {
    		this.model="unknown";
    	}
    }
    
    public String getmodel(){
    	return this.model;
    	
    }

	

}
