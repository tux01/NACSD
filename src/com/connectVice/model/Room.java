package com.connectVice.model;

import java.util.ArrayList;

//Classe que representa uma sala no Lobby
public class Room implements Roomnable {

	ArrayList<Contactable> contacts;
	Contactable owner;
	String name;
	String description;
	
	//Dependencia para instância da classe Room
	public Room(Contactable owner, String name, String description) {
		this.owner = owner;
		this.name = name;
		this.description = description;
	}

	//Atualiza dados da sala
	@Override
	public void updateRoom(Roomnable room) {
		if(this.owner.equals(room.getOwner())) {
			this.name = room.getName();
			this.description = room.getDescription();
		}
	}

	//Adiciona contato na sala caso já não exista
	@Override
	public void addContact(Contactable contact) {
		for(Contactable c : this.contacts) {
			if(c.isContact(contact.getNickName()))
				return;
		}
		this.contacts.add(contact);
		
	}

	//Remove um usuário da sala
	@Override
	public void removeContact(String nickName) {
		for(Contactable c : this.contacts) {
			if(c.isContact(nickName)) {
				this.contacts.remove(c);
				return;
			}
		}
		
	}

	//Retorna o dono da sala
	public Contactable getOwner() {
		return owner;
	}

	//Retorna o nome da sala
	public String getName() {
		return name;
	}
	
	//Retorna a descrição da sala
	public String getDescription() {
		return description;
	}
}
