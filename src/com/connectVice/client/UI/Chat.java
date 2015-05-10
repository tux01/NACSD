package com.connectVice.client.UI;

import com.connectVice.factory.SocketFactory;
import com.connectVice.factory.SocketFactory.Protocol;
import com.connectVice.socket.Receiver;

public class Chat {
	
	public static void main(String[] args) {
		Receiver tcpReceiver = SocketFactory.createSocketReceiver(3333, "localhost", Protocol.TCP);
		tcpReceiver.start();
	}

}
