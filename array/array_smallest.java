import javax.swing.text.StyledEditorKit;

public class array_smallest {
    public static void main (String[]args)
    {
        int [] arr = {40,20,50,30,100};
        int small = arr[0];
        for (int i = 1;i<arr.length;i++){
            if (arr[i]<small){
                small = arr[i];
            }
        }
        System.out.println("Smallest element in the array is: " + small);}
    
}
