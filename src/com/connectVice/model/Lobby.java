package com.connectVice.model;

import java.util.ArrayList;

//Classe da estrutura do servidor (Salas e usuários autenticados)
public class Lobby {
	
	//Lista de contatos
	private ArrayList<Contactable> onlines;
	//Lista de salasa
	private ArrayList<Roomnable> rooms;
	
	//Adiciona uma sala caso já não exista
	public void addRoom(Roomnable room) {
		for(Roomnable r : rooms) {
			if(r.getName().equals(room.getName()))
				return;
		}
		this.rooms.add(room);
	}
	
	//Registra um novo usuário do Lobby
	public void registerUser(Contactable contact) {
		this.onlines.add(contact);
	}
	
	//Retorna a lista de usuários autenticados no Lobby
	public ArrayList<Contactable> returnOlines(String client) {
		return this.onlines;
	}
	
	//Retorna a lista de salas registradas no Lobby
	public ArrayList<Roomnable> returnRooms(String client) {
		return this.rooms;
	}

}
