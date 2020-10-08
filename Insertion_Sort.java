public class Insertion_Sort
{  
    public static void insertionSort(int array[]) 
    {  
        int n = array.length;  
        for (int j = 1; j < n; j++) //Next element
        {  
            int key = array[j];  
            int previous_element = j-1; //referring to the previous element  
            while ( (previous_element > -1) && ( array [previous_element] > key ) ) 
            {  
                array [previous_element+1] = array [previous_element];  
                previous_element--;  
            }  
            array[previous_element+1] = key;  
        }  
    }  
       
    public static void main(String args[])
    {    
        int[] arr1 = {4, 8, 6, 2, 7, 3, 1, 5};    
        System.out.println("Before Insertion Sorting");    
        for(int previous_element:arr1)
        {    
            System.out.print(previous_element+" ");    
        }    
        System.out.println();    
            
        insertionSort(arr1);//sorting array using insertion sort    
           
        System.out.println("After Insertion Sorting");    
        for(int previous_element:arr1)
        {    
            System.out.print(previous_element+" ");    
        }    
    }    
}  
