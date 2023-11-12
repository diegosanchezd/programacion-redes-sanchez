package cliente;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import utils.conexion;

public class cliente extends conexion {

    DataInputStream disCli = null;

    public cliente() {
        super("cliente");
    }

    public void clienteOn() {
        try {

            ps.println("IP: " + sock.getInetAddress().getHostAddress() + "\nNombre: "
                    + sock.getInetAddress().getHostName() + "\nPort: " + sock.getPort() + "\nPort Local: "
                    + sock.getLocalPort() + "\n");

            dosCli = new DataOutputStream(sock.getOutputStream());
            disCli = new DataInputStream(sock.getInputStream());

            ps.println("enviando mensaje");
            dosCli.writeUTF("Hola...");
            dosCli.flush();

            // Hilo para recibir mensajes del servidor
            Thread recibeSocket = new Thread(new Runnable() {
                public void run() {
                    try {
                        while (true) {
                            msg = disCli.readUTF();
                            if (msg.equals("/exit")) {
                                ps.println("\t-------- Desconectado del servidor --------");
                                break;
                            }
                            ps.println("--" + msg);
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
            }, "RecibeSocket");

            recibeSocket.start();

            // Hilo para enviar mensajes desde la consola del cliente
            Thread envioMsgSocket = new Thread(new Runnable() {
                public void run() {
                    try {
                        while (true) {
                            ps.print("> ");
                            msgToSend = br.readLine();
                            ps.println();
                            if (msgToSend.equals("/exit")) {
                                ps.println("-------- Chat Cerrado --------");
                                dosCli.writeUTF("/exit");
                                dosCli.flush();
                                break;
                            }
                            if (msgToSend != null && !msgToSend.isEmpty()) {
                                dosCli.writeUTF(msgToSend);
                                dosCli.flush();
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
            }, "EnvioMsgSocket");

            envioMsgSocket.start();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

