package com.connectVice.socket;

import java.net.DatagramSocket;
import java.net.SocketException;

public class ReceiverUdp implements Socketable {
	
	private Integer port;
	private DatagramSocket listenSocket;
	
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

	@Override
	public void close() {
		// TODO Auto-generated method stub
		
	}

}
