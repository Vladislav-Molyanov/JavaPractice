package thirdHomework;
// Реализовать алгоритм сортировки слиянием и выборкой.
// (Самое эффективное , это изучить эти сортировки на Питоне , и постараться написать их на java)
public class programOne {
// Сорировка слиянием
    public static void mergeSort(int[]array, int left, int right) {
        if (right <= left) return;
        int pivot = (left+right)/2;
        mergeSort(array, left, pivot);
        mergeSort(array, pivot+1, right);
        merge(array,left,pivot,right);
    }
   
   public static void merge(int[] array, int left, int mid, int right) {
        int lengthLeft = mid - left + 1;
        int lengthRight = right - mid;
    
        int leftArray[] = new int [lengthLeft];
        int rightArray[] = new int [lengthRight];
    
        for (int i = 0; i < lengthLeft; i++)
            leftArray[i] = array[left+i];
        for (int i = 0; i < lengthRight; i++)
            rightArray[i] = array[mid+i+1];
    
        int leftIndex = 0;
        int rightIndex = 0;
    
        for (int i = left; i < right + 1; i++) {
            if (leftIndex < lengthLeft && rightIndex < lengthRight) {
                if (leftArray[leftIndex] < rightArray[rightIndex]) {
                    array[i] = leftArray[leftIndex];
                    leftIndex++;
                }
                else {
                    array[i] = rightArray[rightIndex];
                    rightIndex++;
                }
            }
            else if (leftIndex < lengthLeft) {
                array[i] = leftArray[leftIndex];
                leftIndex++;
            }
            else if (rightIndex < lengthRight) {
                array[i] = rightArray[rightIndex];
                rightIndex++;
            }
        }
    }
    
    // Сортировка выборкой
    public static void selecrionSort(int[] arg) {
        for (int i = 0; i < arg.length; i++) {
            int min = arg[i];
            int minId = i;
                for (int j = i+1; j < arg.length; j++) {
                    if (arg[j] < min) {
                        min = arg[j];
                        minId = j;
                    }
                }
            int temp = arg[i];
            arg[i] = min;
            arg[minId] = temp;

        }
    }
    public static void main(String[] arg) {
        int array[] = new int[] {4,3,1,7,6,9,5};
        for (int i : array) {
            System.out.print(i);
        }
        System.out.println("Отсортированный массив");
        mergeSort(array, array.length-array.length,array.length-1);
        // selecrionSort(array);

        for (int i : array) {
            System.out.println(i);
        }
    }
}
