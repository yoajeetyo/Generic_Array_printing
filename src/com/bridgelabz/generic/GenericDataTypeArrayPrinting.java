package com.bridgelabz.generic;

public class GenericDataTypeArrayPrinting {
	
	private static <E> void toPrint(E[] inputArray) {
		for (E element : inputArray) {
			System.out.print(element+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Integer[] intArray = {2,3,6,16};
		Double[] douubleArray = {2.1,3.6,6.7,16.65};
		Character[] charArray = {'a' , 'b' , 'c' , 'd'};
		
		toPrint(intArray);
		toPrint(douubleArray);
		toPrint(charArray);
	}

}

