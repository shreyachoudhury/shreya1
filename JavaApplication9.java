import java.io.*;
public class HelloWorld
{
    public static void main(String[] args)throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in =new BufferedReader (read);
        int N,s=0;
        System.out.println("Enter n");
        N=Integer.parseInt(in.readLine());
        int i=0;
        for(i=1;i<=N;i++)
        {
            s=s+i;
        }
        System.out.println("sum is "+s);
        }
    }

