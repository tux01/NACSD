package com.connectVice.model;

import java.util.ArrayList;

public class Lobby {
	
	private ArrayList<Contactable> onlines;
	private ArrayList<Roomnable> rooms;
	
	public void addRoom(Roomnable room) {
		for(Roomnable r : rooms) {
			if(r.getName().equals(room.getName()))
				return;
		}
		this.rooms.add(room);
	}
	
	public void registerUser(Contactable contact) {
		this.onlines.add(contact);
	}
	
	public ArrayList<Contactable> returnOlines(String client) {
		return this.onlines;
	}
	
	public ArrayList<Roomnable> returnRooms(String client) {
		return this.rooms;
	}

}
