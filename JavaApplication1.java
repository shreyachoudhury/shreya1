import java.io.*;
public class JavaApplication1
{
    public static void main(String[] args)throws IOException
    {
        int n=8;
        if(n>0)
            System.out.println("It is a positive number"+n);
        if(n<0)
            System.out.println("It is a negative number"+n);
        if(n==0)   
            System.out.println("Number is zero");
    }
}
