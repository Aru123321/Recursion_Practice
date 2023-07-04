public class array220 {
    public static boolean array220(int arr[], int index){
        if(index>=arr.length-1){
            return false;
        }
       
        if(arr[index+1]==10*arr[index]){
            return true;
        }
        return array220(arr, index+1);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,30};
        System.out.println(array220(arr,0));
    }
}
