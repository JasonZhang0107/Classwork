import java.util.Random;
package shape;

public class shapeUtilities 
{
	public static shape getRandomShape()
	{
		random r = new Random();
		
		int x = r.nextInt(3);
		switch(x)
		{
			case 0:
				return new circle(r.nextInt(100)+1);
			case 1:
				return new rectangle()
		}
	}
	public static double sumPerimeter(shape[] shapeArr)
	{
		int sum = 0;
		for(int x=0; x<shapeArr.length(); x++)
		{
			sum = sum + shapeArr[x].perimeter;
		}
		return sum;
	}
	public static double sumArea(shape[] shapeArr)
	{
		int sum = 0;
		for(int x=0; x<shapeArr.length(); x++)
		{
			sum = sum + shapeArr[x].area;
		}
		return sum;
	}
}
