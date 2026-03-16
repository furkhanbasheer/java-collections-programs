public class array_crud {
    public static void main(String[] args) {
        int [] arr = {10, 20, 30, 40, 50};
        System.out.println("Initial Array:");
        for (int i =0;i<arr.length;i++){
            System.out.print(arr[i] + " ");

        }
        // update array by java
        arr[2] = 35;
        System.out.println("\nUpdated Array:");
        for (int i =0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
