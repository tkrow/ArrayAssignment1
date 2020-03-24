
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Part1();		
		
		System.out.println("");
		
		Part2();
	}
	
	public static void Part1(){
		// Part 1 of the assignment
				// Creates the two arrays
				int[] intArray1 = {1,2,3,4,5,6,7,8,9,10};
				int[] intArray2 = new int[intArray1.length];

				// this section will reverse and place the 
				// contents of intArray1 into intArray2
				int max = intArray1.length - 1;
				int min = 0;
				for(int i = 0; i < intArray1.length; i++){
					intArray2[min] = intArray1[max];
					min++;
					max--;					
				}
				
				// returns every int in intArray2 in reverse 
				// order from intArray1
				for(int j = 0; j < intArray2.length; j++) {
					System.out.println(intArray2[j]);
				}
	}
	
	public static void Part2() {
		// Part 2 of the assignment
			
		// Creates the two arrays
		int[] intArray1 = {1,2,3,4,5,6,7,8,9,10};
		int[] intArray2 = new int[intArray1.length - 1];

		// this section will remove the index to be removed
		// by simply not copying it into the second array
		int index = 0;
		int indexRemoved = 6;
		for(int i = 0; i < intArray1.length; i++) {
			if(index < indexRemoved) {
				intArray2[index] = intArray1[index];
				index++;
			}
			if(index == indexRemoved) {
				intArray2[index] = intArray1[index + 1];
				index++;
			}
			if(index > indexRemoved & index != intArray1.length - 1) {
				intArray2[index] = intArray1[index + 1];
				index++;
			}
		}		
		
		// returns every int in intArray2 without
		// the one value from intArray1
		for(int j = 0; j < intArray2.length; j++) {
			System.out.println(intArray2[j]);
		}
	}
}