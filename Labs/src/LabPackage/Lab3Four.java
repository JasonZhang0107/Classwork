package LabPackage;

public class Lab3Four
{
	public static void main(String[] args)
	{
		int[] array = {8, 6, 9, 2, 3};
		
		partition(array, 0, array.length-1);
		for(int i = 0; i<array.length; i++)
		{
			System.out.println(array[i]);
		}
	}
	public static void partition(int[] list1, int front, int back)
	{
		int pivotValue = list1[0];
		int low = 1;
		int lowValue = list1[low];
		int high = list1.length-1;
		int highValue = list1[high];
		
		while(low < high)
		{
			while (lowValue < pivotValue && low < high)
			{
				low++;
				lowValue = list1[low];
			}
			while(highValue > pivotValue)
			{
				high--;
				highValue = list1[high];
			}
			swapInt(list1, low, high);
			high--;
		}
		System.out.println("High position: " + high + "\nLow Position " + low);
		swapInt(list1, high, 0);
		
	}
	public static void quickSort(int[] list1, int front, int back)
	{
		
	}
	public static void customSort()
	{
		
	}
	public static void swapInt(int[] array1, int x, int y)
	{
		int temp = array1[x];
		array1[x] = array1[y];
		array1[y] = temp;
	}
}
