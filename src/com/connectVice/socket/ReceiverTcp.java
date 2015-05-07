package com.connectVice.socket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ReceiverTcp implements Socketable {
	
	private int port;
	private ServerSocket server;
	
	public ReceiverTcp(int port) {
		this.port = port;
	}
	
	@Override
	public void start() {
		
		try {
						
			System.out.println("Criando socket na porta " + this.port);
			
			server = new ServerSocket(this.port);
			
			while(true) {
				
				System.out.println("Preparando socket para receber dados");
				
				Socket client = server.accept();
				
				ProcessBuilder pb = new ProcessBuilder("");
				
				
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void close() {
		try {
			server.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
