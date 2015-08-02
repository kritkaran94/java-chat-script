import java.io.*;
import java.net.Socket;
import java.net.ServerSocket;

public class Server
{
	public static void main(String[] args) throws Exception
	{
		int pn=2000;

		ServerSocket ss=new ServerSocket(pn);
		Socket sk=ss.accept();

		BufferedReader cin=new BufferedReader(new InputStreamReader(sk.getInputStream()));
        PrintStream cout=new PrintStream(sk.getOutputStream());
		BufferedReader stdin=new BufferedReader(new InputStreamReader(System.in));

		while(true)
		{
			String s;

			s = cin.readLine();

			if(s.equalsIgnoreCase("BYE"))
			{
				cout.println("BYE");
				break;
			}

			System.out.print("Client : "+s+"\n");
			System.out.print("Server : ");
            s = stdin.readLine();
            cout.println(s);
		}

		ss.close();
		sk.close();
		stdin.close();
		cin.close();
		cout.close();
	}
}

