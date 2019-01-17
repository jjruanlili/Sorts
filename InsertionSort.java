package sort.Sorts;

/**
 * 插入排序  时间复杂度n的2次方
 * 将数字看为|前部分有序,通过j--遍历维护,i则遍历|后面无序部分
 * 6(j)|3(i)24  => 3(j)|6(i)24 => 36(j)|2(i)4
 */
public class InsertionSort {
    public static void insert(int[] arr){
        int tmp = 0;
        for(int i=1;i<arr.length;i++){
            for(int j =i-1;j>=0;j--){
                tmp= arr[j+1];
                if(arr[j+1]<arr[j]){
                    arr[j+1]=arr[j];
                    arr[j]=tmp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {6,3,2,4};
        InsertionSort bs = new InsertionSort();
        bs.insert(arr);
        for(int i : arr){
            System.out.println(i);
        }
    }
}
