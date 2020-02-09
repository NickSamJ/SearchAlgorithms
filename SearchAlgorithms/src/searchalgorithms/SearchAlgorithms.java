/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searchalgorithms;

/**
 *
 * @author user
 */
public class SearchAlgorithms {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[] arr1000 = new int[1000]; // creating array for tests
        
        // Filling array with sorted numbers from 0 to 999
        for(int i=0; i<arr1000.length;i++){
            arr1000[i]=i;
        }
        
        int numberToSearch = 400; // Number to find in 
        
        //** Outputs fot Linear algotithm    
        long startTimeLinear = System.nanoTime();
        
        int resultLinear = linearSearch(arr1000, numberToSearch);
//        int result = binarySearch(arr1000, numberToSearch);
                
        long stopTimeLinear = System.nanoTime();
        
        long executionTimeLinear = stopTimeLinear-startTimeLinear;
        
        System.out.printf("***** Linear search algorithm *******\n"
                + " - Execution time: %d\n"
                + " - Result: %d\n", 
                executionTimeLinear, 
                resultLinear
            );
        
        
        //** Outputs fot Binary algotithm    
        long startTimeLBinary = System.nanoTime();
        
        int resultBinary =  binarySearch(arr1000, numberToSearch);
        
        long stopTimeBinary = System.nanoTime();
        
        long executionTimeBinary = stopTimeBinary-startTimeLBinary;
        
        System.out.printf("\n\n***** Binary search algorithm *******\n"
                + " - Execution time: %d\n"
                + " - Result: %d\n", 
                executionTimeBinary, 
                resultBinary
            );
        
    }
    
    public static int linearSearch(int[] arr, int number){
        int counter = 0;
        while(counter<arr.length && arr[counter]!=number){
            counter++;
        }
        int result = -1;
        if(arr[counter]==number){
            result = counter;
        }
        return result;
    }
    
    public static int binarySearch(int[] arr, int number) {
		
        int left = 0;
        int right =  arr.length-1;
        int middle  = (left+right)/2;
        while(left<=right && arr[middle]!=number) {
                if(number<arr[middle]) {
                        right = middle-1;
                }else {
                        left = middle+1;
                }
                middle = (right+left)/2;
        }
        int result = -1;
        if(arr[middle]==number) {
                result = middle;
        }
        return result;
    }
    
}
