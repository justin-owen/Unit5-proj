public class InsertionSort {
    public static void main(String[] args) {
        int [] arr = {5, 4, 3, 2, 1};
        for (int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
        insertionSort(arr);
        for (int i : arr){
            System.out.print(i + " ");
        }

    }
    public static void insertionSort(int[] array){
        for (int i = 1; i < array.length; i++){
            int num = array[i];
            int j = i - 1;
            while ((j > -1)&&(array[j] > num)){
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = num;
        }
    }
}
//Quick sort is the most efficient sorting algorithm
// The best case for runtime efficiency is O(n log n) and best case scenario is when they are already sorted
// The worst case scenario is if they are in reverse order and can be in runtimes of O(n^2)
// The average case for runtime efficiency is O(n log n) and the scenario is in random order