import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {

    }
    public int missingNumber(int[] numbers, int size){
        for (int i = 1; i <= size; i++){
            if (!Arrays.stream(numbers).boxed().toList().contains(i)){
                System.out.println(i);
                return i;
            }
        }
        System.out.println(0);
        return 0;

    }
    public int missingNumberSort(int[] numbers, int size) {
        Arrays.sort(numbers);

        for (int i = 1; i < size; i += 1) {
            if (i != numbers[i - 1]) {
                System.out.println(i);
                return i;
            }
        }

        if (numbers.length == size && numbers[size - 1] == size) {
            System.out.println(0);
            return 0;
        }
        System.out.println(size);
        return size;
    }
    public int missingNum(int[] numbers, int size){
        int fullSum = 0;
        for (int i = 1; i <= size; i++){
            fullSum += i;
        }

        int sum = Arrays.stream(numbers).sum();
        System.out.println(fullSum - sum);
        return fullSum - sum;

    }

}
// I didn know how to implement the sort function but the other two are pretty similar