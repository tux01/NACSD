package com.connectVice.socket;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

//Classe Socket via TCP
public class ReceiverTcp implements Receiver {
	
	private int port;
	private ServerSocket server;
	private static int BUFSIZE = 8192;
	
	//Define porta
	public ReceiverTcp(int port) {
		this.port = port;
	}
	
	@Override
	//Inicia a configuração do server
	public void start() {
		
		try {
						
			System.out.println("Criando socket na porta " + this.port);
			
			server = new ServerSocket(this.port);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	//Ouve o socket para receber dados
	public void run(String destinationProcess, int port) {
		System.out.println("Preparando socket para receber dados");
		while(true)
		{
			try {
				Socket client = server.accept();
			    run(destinationProcess, port, client.getInputStream());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	//Fecha o socket server
	public void close() {
		try {
			server.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//Chama via socket (de preferência UDP) o outro processo para tratar os dados
	private void run(String destinationProcess, int port, InputStream in) {
		//Implementar a chamada para outro processo
	}

}
