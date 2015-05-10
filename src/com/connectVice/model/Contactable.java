package com.connectVice.model;

//Interface que define o contato (Usuário que pode receber mensagens e requisitar informações)
public interface Contactable {
	
	void sendMessage(Message message);
	void sendPrivateMessage(Message message);
	boolean isContact(String nickName);
	String getNickName();
	String getIp();

}
