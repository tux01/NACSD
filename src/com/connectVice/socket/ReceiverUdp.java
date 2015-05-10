package com.connectVice.socket;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

import com.connectVice.server.Request;

//Classe Socket receiver em UDP
public class ReceiverUdp implements Receiver {
	
	private Integer port;
	private DatagramSocket listenSocket;
	private static int BUFSIZE = 8192;
	
	//Define porta
	public ReceiverUdp(int port) {
		this.port = port;
	}

	//Inicia o socket;
	@Override
	public void start() {
		try {
			listenSocket = new DatagramSocket(port);
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	//Escuta o socket para receber os dados
	public void run(String host, int port) {
		byte[] buffer = new byte[BUFSIZE];
		while(listenSocket!=null) {
			DatagramPacket packet = new DatagramPacket(buffer,BUFSIZE);
			Request r = null;
			try {
				listenSocket.receive(packet);
				run(host, port, packet.getData());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	//Fecha a conexão
	@Override
	public void close() {
		listenSocket.close();
		
	}

	//Envia os dados recebidos do socket para outro processo.
	private void run(String host, int port, byte[] in) {
		// Implementar a chamada para outro processo
	}
	
}
