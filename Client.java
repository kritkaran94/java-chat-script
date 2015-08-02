/* 

    Krit Karan Singh

     IIIT Sricity

 */ 





import java.io.*;
import java.net.Socket;
import java.net.ServerSocket;


public class Client
{
  
  public static void main(String[] args) throws Exception
  {
  
     int pn=2000;
     
     Socket sk=new Socket("127.0.0.1",pn);

     BufferedReader sin=new BufferedReader(new InputStreamReader(sk.getInputStream()));
     PrintStream sout=new PrintStream(sk.getOutputStream());
     BufferedReader stdin=new BufferedReader(new InputStreamReader(System.in));

     String s;

     while( true )
     {
        System.out.print("Client : ");
        s=stdin.readLine();
        sout.println(s);
        s=sin.readLine();
        System.out.print("Server: "+s+"\n");
        if(s.equalsIgnoreCase("BYE"))
          break;
      
     }
         sk.close();
         sin.close();
         sout.close();
         stdin.close();

  }

}