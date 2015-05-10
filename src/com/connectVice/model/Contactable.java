package com.connectVice.model;

//Interface que define o contato (Usu�rio que pode receber mensagens e requisitar informa��es)
public interface Contactable {
	
	void sendMessage(Message message);
	void sendPrivateMessage(Message message);
	boolean isContact(String nickName);
	String getNickName();
	String getIp();

}
