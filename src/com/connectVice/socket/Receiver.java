package com.connectVice.socket;

//Interface para criar socket Receiver
public interface Receiver {
	
	void start();
	void close();
	void run(String host, int port);

}
