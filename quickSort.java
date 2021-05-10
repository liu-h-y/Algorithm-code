package leecode.randomTest;

public class quickSort {
    public static void subSort(int []data,int start,int end){//双指针
        if(start>end)return;
        int partion=data[start];
        int i=start;
        int j=end;
        while(i<j){
            while(i<j&&data[j]>=partion)j--;
            while(i<j&&data[i]<=partion)i++;
            if(i<j) {
                int temp = data[j];
                data[j] = data[i];
                data[i] = temp;
            }
        }
        data[start]=data[i];
        data[i]=partion;
        subSort(data,start,i-1);
        subSort(data,i+1,end);
    }
    public static void quickSort(int []data,int start,int end){ //单指针
        if(start>end)return;
        int partion = data[start];
        int j=start;
        for(int i=start+1;i<=end;i++){
            if(data[i]<partion){
                j++;
                int temp=data[j];
                data[j]=data[i];
                data[i]=temp;
            }
        }
        int temp=data[start];
        data[start]=data[j];
        data[j]=temp;
        quickSort(data,start,j-1);
        quickSort(data,j+1,end);
    }
    public static void main(String[]args){
        int []a={1,3,4,2,6,7,6,7,2,1,};
        for(int b:a){
            System.out.print(b+" ");
        }
        System.out.println();
        subSort(a,0,a.length-1);
        for(int b:a){
            System.out.print(b+" ");
        }

    }
}
