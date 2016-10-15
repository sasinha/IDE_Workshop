
//find sum of all positive integers in an int[] array
//find average
//find number that comes up most / highest occurrence

import java.util.Arrays;
class IntArray{
    public static void main(String[] args){
       	int ARR_Len = 15;

        int[] intArr = new int[ARR_Len];
        int randNum;
		int maxRange = 5; //min = 0

        for(int i = 0; i<ARR_Len; i++){
            randNum = (int)(Math.random()*(maxRange+1)); //0-10
            //NOTE: int x = (int)(Math.random()*(max-min+1))+min;
            intArr[i] = randNum;
        }

		System.out.print("Array:");
        printIntArr(intArr);
        System.out.println("\n");

/*		int[] copyIntArr = Arrays.copyOf(intArr, intArr.length); //make copy so doesnt change original
		Arrays.sort(copyIntArr); //used to see if all numbers in range appeared
		printIntArr(copyIntArr);
		System.out.println("\n");
*/

        //find sum
		System.out.println("Finding Sum:");
        int sum = 0 ;
        for(int i: intArr){
			sum+=i;
		}
		System.out.println("Sum: " + sum);
		System.out.println();


		//find average
		System.out.println("Finding Avg:");
		double avg = (double)sum/intArr.length; //double because of integer division
		System.out.println("Avg: " + avg);
		System.out.println();



		//find higest occurence
		System.out.println("Finding highest occurrence:");
		int[] temp = new int[maxRange+1];
        for(int i: intArr){
			temp[i]++;
		}

//		printIntArr(temp);
//		System.out.println("\n");

		int maxIndex = 0;
		for(int i = 0; i<temp.length; i++){
			if(temp[i] > temp[maxIndex]){
				maxIndex = i;
			}
		}

		System.out.println( maxIndex + " came up the most. " + temp[maxIndex] + " times");
		System.out.println();


    }

 	static void printIntArr(int[] arr){
        for(int i: arr){
            System.out.print(" "+ i);
        }
	}

}