package com.connectVice.model;

public interface Contactable {
	
	void sendMessage(Message message);
	void sendPrivateMessage(Message message);
	boolean isContact(String nickName);
	String getNickName();
	String getIp();

}
