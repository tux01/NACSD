package com.connectVice.factory;

import com.connectVice.socket.Receiver;
import com.connectVice.socket.ReceiverTcp;
import com.connectVice.socket.ReceiverUdp;
import com.connectVice.socket.SenderTcp;
import com.connectVice.socket.Sender;

public class SocketFactory {
	
	public enum Protocol { TCP, UDP }
	public enum Type { SENDER, RECEIVER }

	public static Sender createSocketSender(int port, String host ,Type type, Protocol protocol) {
		
		if(type.equals(Type.SENDER) && protocol.equals(Protocol.TCP));
			return new SenderTcp(port, host);
		
	}
	
	public static Receiver createSocketReceiver(int port, String host ,Type type, Protocol protocol) {
		if(type.equals(Type.RECEIVER) && protocol.equals(Protocol.TCP))
			return new ReceiverTcp(port);
		else
			return new ReceiverUdp(port);
	}
	
}
