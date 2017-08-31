public class WeightCalculator
{
	public static void main(String[] args)
	{
		double earth = Double.parseDouble(args [0]);
		double mars = earth * .32;
		double jupiter = earth * 2.36;
		double venus = earth * .91;
		double saturn = earth * 1.06;
		
		System.out.println("earth" + earth);
		System.out.println( "mars" + mars);
		System.out.println( "jupiter" + jupiter);
		System.out.println( "venus" + venus);
		System.out.println( "saturn" + saturn);
		
	}
}