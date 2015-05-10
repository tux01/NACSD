package com.connectVice.client.UI;

import com.connectVice.factory.SocketFactory;
import com.connectVice.factory.SocketFactory.Protocol;
import com.connectVice.factory.SocketFactory.Type;
import com.connectVice.socket.Receiver;
import com.connectVice.socket.Sender;

public class Chat {
	
	public static void main(String[] args) {
		Receiver tcpReceiver = SocketFactory.createSocketReceiver(3333, "localhost", Type.RECEIVER, Protocol.TCP);
		tcpReceiver.start();
	}

}
