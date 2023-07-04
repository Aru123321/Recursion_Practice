public class array11 {
    public static int array11(int arr[], int index){
        if(index>=arr.length){
            return 0;
        }
        int count = 0;
        if(arr[index]==11){// if 11 is at the index, assume array starts at the index
            count++;
        }
        count = count+array11(arr,index+1);
        return count;
    }
    public static void main(String[] args) {
        int arr[]={11,2,11};
        System.out.println(array11(arr,0));
    }
}
