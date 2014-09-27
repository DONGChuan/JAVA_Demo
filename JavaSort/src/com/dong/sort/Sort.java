package com.dong.sort;

public class Sort {
	
	// Change the content of position i and j in the table
	private static void swap(int a[], int i, int j) { 
	    int tmp = a[i]; 
	    a[i] = a[j]; 
	    a[j] = tmp; 
	  } 
	
	//Selection Sort
    public static void selectSort(int[]a) {  
    	
	    int minIndex = 0; // Index of the lowest value
	    for(int i=0;i<a.length;i++) {
	    	minIndex = i;
	    	
	    	// Find the position of the lowest value
    		// and stocks in minIndex
	    	for(int j=i+1;j<a.length;j++) {
	    		if(a[j]<a[minIndex]) {
	    			minIndex=j;
	    		}
	    	}
	    	// If it finds a lower value than its of the position i
	    	// We swap the two values
		    if(minIndex!=i) {
		    	swap(a, i, minIndex);
		    }
	    }
	    showSortResult(a);
    }
    
    //Bubble Sort
    public static void bubbleSort(int[]a) {
    	for(int i = a.length-1; i > 0; --i){
    		for(int j = 0; j < i; ++j) {
    			if(a[j+1]<a[j]) {	
    				swap(a, j, j+1);
    			}
    		}
    	}
    	showSortResult(a);
    }
    
    //Insertion Sort
    public static void insertSort(int[]a){
    	
    	for(int i = 1;i < a.length;i++) {
    		for(int j = i; j > 0; j--){
    			if(a[j] < a[j-1]){
    				swap(a, j, j-1);
    			}else{
    				break;
    			}
    		}
    	}
    	showSortResult(a);
    }
    
    //Quick Sort
	public void quickSort(int a[],int low,int high)
	{
		int l = low;
		int h = high;
		int pivot = a[low];
	 
		while(l<h) {
			
			// From right to left to find a value smaller
			// then pivot
			while(l<h && a[h] >= pivot) h--;
			
			if(l<h) {
				swap(a, l, h);
				l++;
			}
			
			// From left to right to find a value bigger
			// then pivot
			while(l<h && a[l] <= pivot) l++;
			 
			if(l<h) {
				swap(a, l, h);
				h--;
			}
		}
	
		if(l>low) quickSort(a,low,h-1);
		if(h<high) quickSort(a,l+1,high);
		
	}
    
	public static void main(String args[]) { 
		
	    int table[] = new int[] { 37, 47, 23, -5, 19, 56 }; 
		
	    selectSort(table);
	    bubbleSort(table);
	    insertSort(table);
	    
	} 
	
	private static void showSortResult(int a[]) {
		for (int i = 0; i < a.length; i++) { 
	    	System.out.println(a[i]); 
	    }
	}
}
