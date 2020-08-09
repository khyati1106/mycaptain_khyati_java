import java.util.Scanner;
public class Hello {
    public static void main(String[] args) {
        Scanner cs= new Scanner(System.in);
        int a,s=0;
        int x=0;
        int y=1;
        a=cs.nextInt();
        for(int i=0;i<a;i++){
            System.out.println(x);
            s=x+y;
            x=y;
            y=s;
        }
        //fibonaci series
        
    }
}
