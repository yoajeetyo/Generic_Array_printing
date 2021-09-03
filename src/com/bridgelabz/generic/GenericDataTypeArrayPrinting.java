package com.bridgelabz.generic;

public class GenericDataTypeArrayPrinting <X,Y,Z> {
	
	private X[] myXArray;
	private Y[] myYArray;
	private Z[] myZArray;
	
	public GenericDataTypeArrayPrinting(X[] myXArray, Y[] myYArray, Z[] myZArray) {
		super();
		this.myXArray = myXArray;
		this.myYArray = myYArray;
		this.myZArray = myZArray;
	}

	public void toPrint() {
		GenericDataTypeArrayPrinting.toPrint(myXArray);
		GenericDataTypeArrayPrinting.toPrint(myYArray);
		GenericDataTypeArrayPrinting.toPrint(myZArray);
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
		
		new GenericDataTypeArrayPrinting<Integer,Double,Character>(intArray,douubleArray,charArray).toPrint();
	}

}

