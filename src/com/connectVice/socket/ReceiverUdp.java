package com.connectVice.socket;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

import com.connectVice.server.Request;

public class ReceiverUdp implements Receiver {
	
	private Integer port;
	private DatagramSocket listenSocket;
	private static int BUFSIZE = 8192;
	
	public ReceiverUdp(int port) {
		this.port = port;
	}

	@Override
	public void start() {
		try {
			listenSocket = new DatagramSocket(port);
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
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

	@Override
	public void close() {
		// TODO Auto-generated method stub
		
	}

	private void run(String host, int port, byte[] in) {
		// Implementar a chamada para outro processo
	}
	
}
