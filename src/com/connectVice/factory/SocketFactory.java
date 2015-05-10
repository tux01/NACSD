package com.connectVice.factory;

import com.connectVice.socket.Receiver;
import com.connectVice.socket.ReceiverTcp;
import com.connectVice.socket.ReceiverUdp;
import com.connectVice.socket.SenderTcp;
import com.connectVice.socket.Sender;

public class SocketFactory {
	
	public enum Protocol { TCP, UDP }
	//public enum Type { SENDER, RECEIVER }

	//Cria um novo SenderTCP (Factory para não instânciar diretamente na classe gerando menor acoplamento)
	public static Sender createSocketSender(int port, String host , Protocol protocol) {
		
		if( protocol.equals(Protocol.TCP));
			return new SenderTcp(port, host);
		
	}
	
	//Cria um novo ReceiverTCP (Factory para não instânciar diretamente na classe gerando menor acoplamento)
	public static Receiver createSocketReceiver(int port, String host, Protocol protocol) {
		if(protocol.equals(Protocol.TCP))
			return new ReceiverTcp(port);
		else
			return new ReceiverUdp(port);
	}
	
}
