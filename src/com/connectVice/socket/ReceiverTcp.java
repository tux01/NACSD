package com.connectVice.socket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import com.connectVice.server.Request;

public class ReceiverTcp implements Receiver {
	
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
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public Request getRequest() {
		System.out.println("Preparando socket para receber dados");
		
		try {
			Socket client = server.accept();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ProcessBuilder pb = new ProcessBuilder("");
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
