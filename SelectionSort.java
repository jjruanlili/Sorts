package sort.Sorts;

/**
 * 选择排序  时间复杂度n的2次方
 * i一直定在最前面 j逐渐后移与i比较  比i小则换位
 * 6(i)3(j)24 => 3(i)6(j)24 => 3(i)62(j)4 => 2(i)63(j)4
 */
public class SelectionSort {
    public static void select(int[] arr){
        int tmp = 0;
        for(int i = 0; i < arr.length-1; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[j] < arr[i]){
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {6,3,2,4};
        SelectionSort bs = new SelectionSort();
        bs.select(arr);
        for(int i : arr){
            System.out.println(i);
        }
    }
}
