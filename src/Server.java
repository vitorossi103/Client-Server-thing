import java.net.*;
import java.io.*;

public class Server {
	private static ServerSocket serverSocket;
	private static Socket clientSocket;
	private static BufferedReader bufferedReader;
	private static String input;

	public static void main(String[] args) {
		try {
			serverSocket = new ServerSocket(63400);
			clientSocket = serverSocket.accept();

			bufferedReader = new BufferedReader(new InputStreamReader(
					clientSocket.getInputStream()));
			
			// get client message
			
			// here's a change added a comment
			while ((input = bufferedReader.readLine()) != null) {
				System.out.println(input);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
