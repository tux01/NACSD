package com.connectVice.socket;

import com.connectVice.server.Request;

public interface Receiver {
	
	void start();
	void close();
	void run(String host, int port);

}
