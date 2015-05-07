package com.connectVice.factory;

import com.connectVice.socket.ReceiverTcp;
import com.connectVice.socket.SenderTcp;
import com.connectVice.socket.Socketable;

public class SocketFactory {
	
	public enum Protocol { TCP, UDP }
	public enum Type { SENDER, RECEIVER }

	public static Socketable createSocket(int port, String host ,Type type, Protocol protocol) {
		
		if(type.equals(Type.RECEIVER) && protocol.equals(Protocol.TCP))
			return new ReceiverTcp(port);
		if(type.equals(Type.SENDER) && protocol.equals(Protocol.TCP));
		return new SenderTcp(port, host);
		
	}
	
}
