/*
 * 
 * CIS 2212 - Tuseday_class
 * Convert_Fahrenhuit_Celsius
 * Due September-11-18
 * 
 */
package loops;

class Celsius_Fahrentheit 
{
	//method 1
	//_fahrenhuit
	public static double celsius_to_fahrenhiet(double celsius)
	{
		//_var for converstion1
		double fahrenhuit = celsius * 9/5 + 32;
		
		return fahrenhuit; 
	}
	//////////////////////////////////////////////////////////////////////
	
	//method 2
	//_celsius
	public static double fahrenhiet_to_celsius(double fahrenhiet)
	{
		//_var for convertion2
		double celsius = (fahrenhiet - 32) * 5/9;
		
		return celsius;
	}
	//////////////////////////////////////////////////////////////////////
	
	public static void main(String[] args) 
	{
		//fahrenhiet_var_and_method
		double fahrenhiet = 32.0;
		double celsius_converstion = fahrenhiet_to_celsius(fahrenhiet);
		
		//celsius_var_and_method
		double celsius = 0.0;
		double fahrenhuit_coverstion =  celsius_to_fahrenhiet(celsius);
		
		//title for conversation graph
		System.out.println(" Celsius  Fahrenhuit\t|    Fahrenhuit   Celsius ");
		System.out.println("--------------------------------------------------");
		
		for (int i = 0; i < 20; i++)
		{
			//display data
			System.out.printf("%5.1f\t%8.2f\t|\t%3.1f\t%7.2f\n", celsius , fahrenhuit_coverstion, 
					fahrenhiet, celsius_converstion);
			
			//increment_for_celsius
			celsius += 2.5;
			fahrenhuit_coverstion += 4.5;
			
			//increment_for_fahrenhiet
			fahrenhiet += 5.0;
			celsius_converstion += 2.778;
			
			
	
		}
	}//end main
}//end class
