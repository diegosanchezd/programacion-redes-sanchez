package SocketTCP;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class cliente extends conexion {

	InputStreamReader isrCli = null;
	BufferedReader read = null;
	DataInputStream disCli;

	public cliente() {
		super("cliente");
	}

	public void clienteOn() {
		try {

			ps.println("IP: " + sock.getInetAddress().getHostAddress() + 
					"\nNombre: " + sock.getInetAddress().getHostName() + 
					"\nPort: " + sock.getPort()  + 
					"\nPort Local: " + sock.getLocalPort() +
					"\n"
					);

			dosCli = new DataOutputStream(sock.getOutputStream());
			disCli = new DataInputStream(sock.getInputStream());
			
			ps.println("enviando mensaje");
			dosCli.writeUTF("truco");
			dosCli.flush();

			while (true) {
				msg = disCli.readUTF();
				ps.println("--"+msg);
				if(msg.equals("RE TRUCO")) {
					ps.println("Nos cantó el RE");
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				sock.close();
				disCli.close();
				dosSer.close();
				servSock.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}