import java.io.*;
public class HelloWorld
{
    public static void main(String[] args)throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in =new BufferedReader (read);
        int a,b,c;
        System.out.println("Enter A number");
        a=Integer.parseInt(in.readLine());
         System.out.println("Enter A number");
         b=Integer.parseInt(in.readLine());
          System.out.println("Enter A number");
          c=Integer.parseInt(in.readLine());
        if((a>b)&&(a>c))     
            System.out.println(a+"is the greatest number");
        if((c>b)&&(c>a))     
            System.out.println(c+"is the greatest number");
        if((b>c)&&(b>a))     
            System.out.println(a+"is the greatest number");
    }
}
