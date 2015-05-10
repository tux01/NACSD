package com.connectVice.model;

//Interface para implementar uma sala (salas do Lobby só podem ser adicionadas se as classes
//	implementarem essa interface).
public interface Roomnable {

	void updateRoom(Roomnable room);
	void addContact(Contactable contact);
	void removeContact(String nickName);
	String getName();
	String getDescription();
	Contactable getOwner();
	
}
