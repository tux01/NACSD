package com.connectVice.server;

import com.connectVice.factory.SocketFactory;
import com.connectVice.factory.SocketFactory.Protocol;
import com.connectVice.factory.SocketFactory.Type;
import com.connectVice.socket.Sender;

public class SenderChat {

	public static void main(String[] args) {
		int port = 9533;
		String host = "";
		
		Sender socketReceiver = SocketFactory.createSocketSender(port, host, Type.SENDER, Protocol.TCP);
		
		socketReceiver.start();

	}
	
}
