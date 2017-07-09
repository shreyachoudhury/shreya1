import java.io.*;
public class HelloWorld
{
    public static void main(String[] args)throws IOException
    {
        int a=4563;
        int n=0,c=0;
        n=a;
        while(n>0)
        {
            n=n/10;
           c++;
           n=n%10;
        }
        System.out.println("count is:"+c);
        
        }
    }

