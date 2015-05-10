package com.connectVice.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import javax.sound.midi.Receiver;

import com.connectVice.factory.SocketFactory;
import com.connectVice.factory.SocketFactory.Protocol;
import com.connectVice.factory.SocketFactory.Type;
import com.connectVice.socket.Sender;

public class ReceiverChat {

	public static void main(String[] args) {
		int port = 9533;
		String host = "";
		
		com.connectVice.socket.Receiver socketServer = SocketFactory.createSocketReceiver(port, host, Type.SENDER, Protocol.TCP);
		
		socketServer.start();

	}

}
