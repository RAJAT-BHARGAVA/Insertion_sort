public class Insertion_sort {
    public static void main(String[]args){
        int [] arr = {4,6,5,2,1,-4};
        sort(arr);
        for(int i =0 ;i<arr.length ;i++){
            System.out.println(arr[i]);
        }

    }
    public static void sort(int []arr){
        for(int i=1;i<arr.length;i++){
            insertlstelement(arr,i);
        }
    }
    public static void insertlstelement(int []arr,int i){
        int item = arr[i];
        int j = i-1;
        while (j>=0 && arr[j]>item) {
            arr[j+1]=arr[j];
            j--;
        }
        arr[j+1]=item;
    }
}
