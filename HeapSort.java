package leecode.randomTest;

public class HeapSort {
    public static void sort(int []arr){
        //1.构建大顶堆
        for(int i=arr.length/2-1;i>=0;i--){
            adjustHeap(arr,i,arr.length);
        }
        //2.调整堆结构，交换堆顶元素与堆尾元素
        for(int j=arr.length-1;j>0;j--){
            int temp=arr[0];
            arr[0]=arr[j];
            arr[j]=temp;
            adjustHeap(arr,0,j);
        }
        System.out.println(arr[0]);
    }
    public static void adjustHeap(int[]arr,int i,int length){
        int temp=arr[i];
        for(int k=i*2+1;k<length;k=k*2+1){
            if(k+1<length&&arr[k]<arr[k+1])k++;
            if(arr[k]>temp){
                arr[i]=arr[k];
                i=k;
            }
            else{
                break;
            }
        }
        arr[i]=temp;
    }
    public static void main(String[]args){
        int []a={1,3,4,2,6,7,6,7,2,1};
        for(int b:a){
            System.out.print(b+" ");
        }
        System.out.println();
        sort(a);
        for(int b:a){
            System.out.print(b+" ");
        }

    }
}
