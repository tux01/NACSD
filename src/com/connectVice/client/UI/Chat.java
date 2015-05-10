package com.connectVice.client.UI;

import com.connectVice.factory.SocketFactory;
import com.connectVice.factory.SocketFactory.Protocol;
import com.connectVice.factory.SocketFactory.Type;
import com.connectVice.socket.Sender;

public class Chat {
	
	public static void main(String[] args) {
		Sender tcpReceiver = SocketFactory.createSocket(3333, "localhost", Type.RECEIVER, Protocol.TCP);
		tcpReceiver.start();
	}

}
