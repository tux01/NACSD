package com.connectVice.socket;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;

public class SenderTcp implements Sender {
	
	private Integer port;
	private String host;
	private Socket clientSocket;
	
	public SenderTcp(int port, String host) {
		this.port = port;
		this.host = host;
	}

	@Override
	public void start() {
		try {
			clientSocket = new Socket(host, port);
		}
		catch (Exception ex) {
			
		}
		
	}
	
	public boolean isConnected() {
		return clientSocket != null ? clientSocket.isConnected() : false;
	}
	
	public void send(Object send) {
		try {
			ObjectOutputStream out = new ObjectOutputStream(clientSocket.getOutputStream());
			out.writeObject(send);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void close() {
		try {
			clientSocket.shutdownOutput();
			clientSocket.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
