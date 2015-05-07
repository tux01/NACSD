package com.connectVice.model;

import java.util.ArrayList;

public class Room implements Roomnable {

	ArrayList<Contactable> contacts;
	Contactable owner;
	String name;
	String description;
	
	public Room(Contactable owner, String name, String description) {
		this.owner = owner;
		this.name = name;
		this.description = description;
	}

	@Override
	public void updateRoom(Roomnable room) {
		if(this.owner.equals(room.getOwner())) {
			this.name = room.getName();
			this.description = room.getDescription();
		}
	}

	@Override
	public void addContact(Contactable contact) {
		for(Contactable c : this.contacts) {
			if(c.isContact(contact.getNickName()))
				return;
		}
		this.contacts.add(contact);
		
	}

	@Override
	public void removeContact(String nickName) {
		for(Contactable c : this.contacts) {
			if(c.isContact(nickName)) {
				this.contacts.remove(c);
				return;
			}
		}
		
	}

	public Contactable getOwner() {
		return owner;
	}

	public String getName() {
		return name;
	}
	
	public String getDescription() {
		return description;
	}
}
