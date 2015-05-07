package com.connectVice.server;

import com.connectVice.factory.SocketFactory;
import com.connectVice.factory.SocketFactory.Protocol;
import com.connectVice.factory.SocketFactory.Type;
import com.connectVice.socket.Socketable;

public class SenderChat {

	public static void main(String[] args) {
		int port = 9533;
		String host = "";
		
		Socketable socketReceiver = SocketFactory.createSocket(port, host, Type.SENDER, Protocol.TCP);
		
		socketReceiver.start();

	}
	
}
