package com.connectVice.model;

public class User implements Contactable {
	
	private String ip;
	private String nickName;
	
	public User(String nickName, String ip) {
		this.ip = ip;
		this.nickName = nickName;
	}

	@Override
	public void sendMessage(Message message) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sendPrivateMessage(Message message) {
		// TODO Auto-generated method stub
		
	}

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
