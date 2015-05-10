package com.connectVice.model;

//Classe de contato representando um usuário (com essa arquitetura também é possivel adicionar
//	grupos na sala)
public class User implements Contactable {
	
	private String ip;
	private String nickName;
	
	//Dependencias para poder criar uma classe User
	public User(String nickName, String ip) {
		this.ip = ip;
		this.nickName = nickName;
	}

	//Envia uma mensagem
	@Override
	public void sendMessage(Message message) {
		// TODO Auto-generated method stub
		
	}

	//Envia uma mensagem privada
	@Override
	public void sendPrivateMessage(Message message) {
		// TODO Auto-generated method stub
		
	}

	//Verifica se o nome enviado é um contato registrado no Lobby
	@Override
	public boolean isContact(String nickName) {
		return nickName.equals(this.nickName);
	}

	@Override
	public String getNickName() {
		return this.nickName;
	}

	@Override
	public String getIp() {
		return this.ip;
	}

}
