package handsOn;

class Sort {
    public static void main(String args[]) {
        int arr[] = { 12, 6, 35, 24, 66, 320, 666 };
        int j = 0;
        int i = 0;
        System.out.println("Before sort");
        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        int temp = 0;
        for (i = 0; i < arr.length; i++) {
            for (j = 1; j < (arr.length - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;

                }

            }
        }
        System.out.println("\nAfter Sort");
        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}