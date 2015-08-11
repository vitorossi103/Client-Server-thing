import java.net.*;
import java.io.*;

public class Client {
	private static Socket socket;
	private static PrintWriter printWriter;
	
	public static void main(String[] args) {
		try {
			socket = new Socket("localhost", 63400);
			printWriter = new PrintWriter(socket.getOutputStream(), true);
			
			printWriter.println("Hello World");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
