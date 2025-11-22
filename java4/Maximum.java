package java4;

public class Maximum {
    static void main(String[] args) {
        int[] arr = {1,3,59,45,56 };
        System.out.println(maxRange(arr,1,2));
    }

//    static int max(int[] arr){
//        int max = Integer.MIN_VALUE;
    // if(arr.length == 0) return -1;
//        for(int i = 0;i<arr.length;i++){
//            if(arr[i]>max){
//                max = arr[i];
//            }
//        }
//        return max;
//    }

// work on edge cases here like array being null
    static int maxRange(int[] arr ,int a, int b){
    if(b>a){
        return -1;
    }
if(arr == null){
    return -1;
}

        int max = Integer.MIN_VALUE;
        for(int i = a;i<b;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
}
