/**
* This program displays a greeting for the reader.
* @version 1.0 2018-03-07
* @author KiOii(_EM_Cpper)
*/
public class Welcome
{
    public static void main(String[] args)
    {
        String greeting = "Hello,World!";
        System.out.println(greeting);
        for(int i = 0;i < greeting.length();i++)
       		System.out.print("=");
        System.out.println();
    }
}
