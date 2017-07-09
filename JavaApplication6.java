import java.io.*;
public class HelloWorld
{
    public static void main(String[] args)throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in =new BufferedReader (read);
        int y;
        System.out.println("Enter A year");
        y=Integer.parseInt(in.readLine());
        if(((y%400)==0)&&(((y%100)!=0)&&((y%4)==0)))
        System.out.println("it is a leap year");
        else
        System.out.println("it is not a leap year");
    }
}
