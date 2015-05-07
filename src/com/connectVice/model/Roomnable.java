package com.connectVice.model;

public interface Roomnable {

	void updateRoom(Roomnable room);
	void addContact(Contactable contact);
	void removeContact(String nickName);
	String getName();
	String getDescription();
	Contactable getOwner();
	
}
