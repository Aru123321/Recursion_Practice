public class array6 {
    public static boolean array6(int arr[], int index){
        if (index >= arr.length) {
            return false;
        }
       
       if(arr[index]==6){// if inital index pe hi mil gya then fine
        return true;
       }
      
       //if 6 is not at index
      return  array6(arr, index+1);
      
    }

    public static void main(String[] args) {
     int arr[] = {1,3,4,6};
     System.out.println(array6(arr,0));   
    }
}
