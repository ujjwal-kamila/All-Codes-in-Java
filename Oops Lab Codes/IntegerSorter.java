public class IntegerSorter {
    int a1, a2, a3, a4, a5;
    public IntegerSorter() {
        a1 = a2 = a3 = a4 = a5 = 0;
    }
    // Parameterized constructor
    public IntegerSorter(int b1, int b2, int b3, int b4, int b5) {
        a1 = b1;
        a2 = b2;
        a3 = b3;
        a4 = b4;
        a5 = b5;
    }
    public void sort() {
        int[] arr = {a1, a2, a3, a4, a5};
        int temp; 
        System.out.print("Input integers: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }        
        // Bubble sort
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.print("\nSorted integers: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    public static void main(String[] args) {
        IntegerSorter obj = new IntegerSorter(10, 5, 1, 18, 11);
        obj.sort();
    }
}
