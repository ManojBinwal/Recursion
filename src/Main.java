import java.util.Arrays;

public class Main {
    static int c = 0;

    public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//        int n = 12;
//        String str = "kayak";

       // int arr[] = {1, 2, 9, 4, 8, 3, 7, 5,10};
//        int arrs[] = new int[arr.length];
//        int n = sc.nextInt();
//         int count = Count(3456);                                      System.out.println(count);
//        int pow = Power(2,6);                                         System.out.print(pow);
//        String RevStr= Reverse(str);                                  System.out.println(RevStr);
//        PrintNaturalNUmbers(30);
//        long fib = PrintFibonacci(9);                                 System.out.println( fib);
//        boolean isPalndome= StringPalindrome(str);                    System.out.println(isPalndome);
//        String result = ""; result=DecimaltoBinary(n,result);         System.out.print(result);
//        int sum = SumofNaturalNumbers(n); System.out.println(sum);
//        int start = 0 , end = arr.length, mid = end/2;
//        int index = BinarySearch(arr,n,start,end);                    System.out.println(index);
//        int start=0, end=arr.length-1;
//        mergesort(arr,start,end);                                     System.out.print(Arrays.toString(arr));
//        boolean issorted=checkSort(arr);                              System.out.println(issorted);
//        int sum = SumofArrays(arr);                                   System.out.println(sum);

//         boolean isnum=CheckNumber(arr,10); System.out.println(isnum);

        System.out.println(2 + 3 + "bc");



    }

    private static boolean CheckNumber(int[] arr, int n) {
        if(arr.length==1) {return true;}
        int smallArray[]= new int[arr.length-1];
        for(int i=1; i<arr.length; i++) {
            smallArray[i-1]=arr[i];
        }
        return CheckNumber(smallArray,n);
    }

    private static int SumofArrays(int[] arr) {
        return SumofArrays(arr, 0);
    }

    private static int SumofArrays(int[] arr, int i) {
        if(i==arr.length){return 0;}
        return arr[i]+SumofArrays(arr, i+1);
    }

    private static boolean checkSort(int[] arr) {
        if (arr.length == 1) {
            return true;
        }
        if (arr[0] > arr[1]) {
            return false;
        }
        int smallArray[] = new int[arr.length - 1];
        for (int i = 1; i < arr.length; i++) {
            smallArray[i - 1] = arr[i];
        }
        boolean issmallarraysorted = checkSort(smallArray);
        return issmallarraysorted;
    }

    private static void mergesort(int[] arr, int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            mergesort(arr, start, mid);
            mergesort(arr, mid + 1, end);
            merge(arr, start, mid, end);
        }
    }

    private static void merge(int[] arr, int start, int mid, int end) {
        int temp[] = new int[end - start + 1];
        int i = start, j = mid + 1, k = 0;
        // while both of the subarrays have values then try to merge
        while (i <= mid && j <= end) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        while (j <= end) {
            temp[k++] = arr[j++];
        }
        for (i = start; i <= end; i++) {
            arr[i] = temp[i - start];
        }
    }


    private static int BinarySearch(int[] arr, int n, int start, int end) {
        if (start > end) {
            return -1;
        }
        int mid = (start + end) / 2;
        if (arr[mid] == n) {
            return mid;
        }
        if (arr[mid] > n) {
            return BinarySearch(arr, n, start, mid - 1);
        }
        return BinarySearch(arr, n, mid + 1, end);
    }

    private static int SumofNaturalNumbers(int n) {
        if (n == 0) {
            return 0;
        }
        return n + SumofNaturalNumbers(n - 1);

    }

    private static String DecimaltoBinary(int n, String result) {
        if (n == 0) return result;
        result = n % 2 + result;              //string does not need to be returned;
        return DecimaltoBinary(n / 2, result);
    }

    private static boolean StringPalindrome(String str) {

        if (str.length() == 0 || str.length() == 1) {
            return true;
        }
        if (str.charAt(0) == str.charAt(str.length() - 1)) {
            return StringPalindrome(str.substring(1, str.length() - 1));
        }
        return false;
    }

    private static long PrintFibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return PrintFibonacci(n - 1) + PrintFibonacci(n - 2);
    }

    private static void PrintNaturalNUmbers(int n) {
        if (n == 0) {
            return;
        }
        PrintNaturalNUmbers(n - 1);
        System.out.print(n + " ");
    }

    private static String Reverse(String str) {
        if (str.equals("")) {
            return "";
        }
        return Reverse(str.substring(1)) + str.charAt(0);

    }

    private static int Power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        return x * Power(x, n - 1);


    }

    private static int Count(int n) {
        if (n < 10) {
            return 1;
        }
        return 1 + Count(n / 10);

    }
}