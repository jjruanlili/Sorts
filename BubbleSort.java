package sort.Sorts;

/**
 * 冒泡排序  时间复杂度n的2次方
 * 特点是每趟相邻两数比较
 * 6(j)3(j+1)24  => 36(j)2(j+1)4 => 326(j)4(j+1)
 */
public class BubbleSort {
    public static void bubble(int[] arr){
        int tmp=0;
        for(int i = 0;i<arr.length;i++){
            for(int j =0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    tmp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tmp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {6,3,2,4};
        BubbleSort bs = new BubbleSort();
        bs.bubble(arr);
        for(int i : arr){
            System.out.println(i);
        }
    }
}
