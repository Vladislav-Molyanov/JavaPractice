//Реализовать алгоритм сортировки слиянием.

package homeworkThree;

import java.util.Arrays;

public class firstProgram {
    public static void main(String[] args) {
        int[] array = {0,5,41,1,9,2,71};
        System.out.println(Arrays.toString(sortArr(array)));

    }
    public static int[] sortArr(int[] array){
        if (array == null) return null;
        if (array.length < 2) return array;

        int leftPartArray[] = new int[array.length/2];
        System.arraycopy(array, 0, leftPartArray, 0, array.length/2);

        int rightPartArray[] = new int[array.length-leftPartArray.length];
        System.arraycopy(array, leftPartArray.length, rightPartArray, 0, array.length-leftPartArray.length);
        sortArr(leftPartArray);
        sortArr(rightPartArray);

        mergeArr(array, leftPartArray,rightPartArray);
        return array;
    }

    public static void mergeArr(int[] array, int[] leftPartArray, int[] rightPartArray) {
        int positionLeftArr = 0;
        int positionRightArr = 0;
        int len = array.length;

        for (int i = 0; i < len; i++) {
            if (positionLeftArr == leftPartArray.length){
                array[i] = rightPartArray[positionRightArr];
                positionRightArr++;
            } else if (positionRightArr == rightPartArray.length) {
                array[i] = leftPartArray[positionLeftArr];
                positionLeftArr++;
            } else if (leftPartArray[positionLeftArr] < rightPartArray[positionRightArr]) {
                array[i] = leftPartArray[positionLeftArr];
                positionLeftArr++;
            } else {
                array[i] = rightPartArray[positionRightArr];
                positionRightArr++;
            }
        }
    }
}
