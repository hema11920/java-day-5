import java.util.*;
public class pattern3forchar{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=n;i>=1;i--)
        {
            for(int j=n;j>=i;j--)
            {
                System.out.print((char)(j+64));
            }
                System.out.println();
        }
    }
}
        