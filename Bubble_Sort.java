public class Bubble_Sort
{  
    static void bubbleSort(int[] arr) 
    {  
        int n = arr.length;  
        int temp = 0;  
         for(int i=0; i < n; i++)
         {  
                 for(int j=1; j < (n-i); j++)
                 {  
                          if(arr[j-1] > arr[j])
                          {  
                                 //swaping elements  
                                 temp = arr[j-1];  
                                 arr[j-1] = arr[j];  
                                 arr[j] = temp;  
                         }  
                          
                 }  
         }  
  
    }

    public static void main(String[] args) 
    {  
                int arr[] ={4, 8, 6, 2, 7, 3, 1, 5};  
                 
                System.out.println("Before Bubble Sorting");  
                for(int i=0; i < arr.length; i++)
                {  
                        System.out.print(arr[i] + " ");  
                }  
                System.out.println();  
                  
                bubbleSort(arr);//using bubble sort  
                 
                System.out.println("After Bubble Sorting");  
                for(int i=0; i < arr.length; i++)
                {  
                        System.out.print(arr[i] + " ");  
                }  
   
        }  
}  
