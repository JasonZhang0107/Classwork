
public class reference 
{

	public static void main(String[] args) 
	{
		String[] shoppingList = {"brown rice", "broccoli", "salmon"};	
		doubleArray(shoppingList);
		
	}
	public String doubled(String str1)
	{
		str1 = str1 + str1;
		return str1;
	}
	public String doubleArray(String[] array)
	{
		String list = "";
		for(int x=0; x<array.length; x++)
		{
			list = doubled(array[x]);
		}
		return list;
	}
}
