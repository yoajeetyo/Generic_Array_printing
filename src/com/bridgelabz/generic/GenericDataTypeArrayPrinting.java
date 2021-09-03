package com.bridgelabz.generic;

public class GenericDataTypeArrayPrinting <T> {
	
	private T[] inputArray;
	
	public GenericDataTypeArrayPrinting(T[] inputArray) {
		super();
		this.inputArray = inputArray;
	}
	
	public void toPrint() {
		GenericDataTypeArrayPrinting.toPrint(this.inputArray);
	}

	public static <E> void toPrint(E[] inputArray) {
		for (E element : inputArray) {
			System.out.print(element+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Integer[] intArray = {2,3,6,16};
		Double[] douubleArray = {2.1,3.6,6.7,16.65};
		Character[] charArray = {'a' , 'b' , 'c' , 'd'};
		
		new GenericDataTypeArrayPrinting(intArray).toPrint();
		new GenericDataTypeArrayPrinting(douubleArray).toPrint();
		new GenericDataTypeArrayPrinting(charArray).toPrint();
	}

}

