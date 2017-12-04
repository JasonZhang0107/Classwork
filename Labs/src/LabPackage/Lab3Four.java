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
		int pivotValue = list1[front];
		int pivotPosition = front;
		int frontPosition = front;
		int backPosition = back;
		
		System.out.println("The Pivot is " + pivotValue);
		while(frontPosition < backPosition)
		{
			if(pivotValue > list1[backPosition])
			{
				if(pivotPosition < backPosition)
				{
					swapInt(list1, pivotPosition, backPosition);
					pivotPosition = backPosition;
					pivotValue = list1[pivotPosition];
					frontPosition++;
					backPosition--;
				}
				else
				{
					backPosition--;
				}
			}
			else
			{
				swapInt(list1, pivotPosition, backPosition);
				pivotPosition = backPosition;
				pivotValue = list1[pivotPosition];
				frontPosition++;
				backPosition--;
			}
		}
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
