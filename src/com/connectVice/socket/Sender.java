package com.connectVice.socket;

//Interface para imoplementar socket Sender
public interface Sender {

	void start();
	void close();
	void send(Object message);
	
}
