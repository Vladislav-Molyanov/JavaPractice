package fifthHomework;
// Реализовать алгоритм пирамидальной сортировки (HeapSort).

public class programThree {
    public static void main(String[] args) {
        int [] array = new int []{4,7,1,3,9,2,5,6};
        sort(array);
        System.out.println(array);
        for (int i : array) {
            System.out.println(i);
        }

    }
    public static void sort(int[] array) {
        int length = array.length;
        for (int i = length/2 -1; i >= 0; i--) {
            heapify(array, length, i);
        }

        for (int i = length - 1; i > 0; i--) {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;
            heapify(array, i, 0);
        }

    }

    public static void heapify(int[] array,int size, int nodeIndex) {
        int largest = nodeIndex;

        int left = nodeIndex * 2 + 1;
        int right = nodeIndex * 2 + 2;

        if (left < size && array[left] > array[largest]) {
            largest = left;
        }

        if (right < size && array[right] > array[largest]) {
            largest = right;
        }

        if (largest != nodeIndex) {
            int temp = array[nodeIndex];
            array[nodeIndex] = array[largest];
            array[largest] = temp;
            heapify(array, size, largest);
        }

    }
}
