import javax.swing.text.StyledEditorKit;

public class array_largest {
    public static void main (String[]args)
    {
        int [] arr = {40,20,50,30,100};
        int lar = arr[0];
        for (int i = 1;i<arr.length;i++){
            if (arr[i]>lar){
                lar = arr[i];
            }
        }
        System.out.println("Largest element in the array is: " + lar);}
    
}
