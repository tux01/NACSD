package com.connectVice.server;

import com.connectVice.factory.SocketFactory;
import com.connectVice.factory.SocketFactory.Protocol;

public class ReceiverChat {

	//Inicia o socket
	public static void main(String[] args) {
		int port = 9533;
		String host = "";
		
		com.connectVice.socket.Receiver socketServer = SocketFactory.createSocketReceiver(port, host, Protocol.TCP);
		
		socketServer.start();

	}

}
