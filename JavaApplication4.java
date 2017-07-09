import java.io.*;
public class JavaApplication3
{
    public static void main(String[] args)throws IOException
    {
        char ch='a';
        int i,c=0;
         for(i=97;i<=122;i++)
         {
            if (((int)ch)==i)
              c++;
         }
      if(c==1)
         System.out.println("It is a character"+ch);
        else
            System.out.println("it is not a character" +ch);
            
    }
}
