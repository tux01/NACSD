package com.connectVice.socket;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.ByteBuffer;

import com.connectVice.server.Request;

public class ReceiverTcp implements Receiver {
	
	private int port;
	private ServerSocket server;
	private static int BUFSIZE = 8192;
	
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
	
	public void run(String host, int port) {
		System.out.println("Preparando socket para receber dados");
		while(true)
		{
			try {
				Socket client = server.accept();
			    run(host, port, client.getInputStream());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
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
	
	private void run(String host, int port, InputStream in) {
		//Implementar a chamada para outro processo
	}

}
