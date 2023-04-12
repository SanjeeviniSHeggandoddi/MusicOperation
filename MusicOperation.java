package com.jspider.musicplayer.operation;

import java.util.ArrayList;
import java.util.Iterator;

import com.jspider.musicplayer.Song;
public class MusicOperation{
	Song s;
	ArrayList al=new ArrayList();
	public void addSong(Song s) {
		al.add(s);
		System.out.println("song Add succesfully");
}
	public void viewSong() {
		Iterator i=al.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
	public void removeSong(int id) {
		if(this.s!=null) {
			if(s.getId()==id) {
				al.remove(id);
				System.out.println("remove successfully");
			}
		}
		else {
			System.out.println("no song to remove");
		}
	}
	public void editSong(int id,String songName) {
		if(s.getId()==id) {
			s.setSongName(songName);
			System.out.println("edit successfully");
		}
	}
	//case2:playAllSong\n2.Play Random Song\n3.choose Song\n4.Go Back
	public void playAllSong() {
		Iterator i=al.iterator();
		while(i.hasNext()) {
			System.out.println(s.getSongName()+"Song is playing");
		}
	}
	public void randomSong() {
		System.out.println("tre Song Playing");
	}
	public void chooseSong(int id) {
		if(this.s!=null) {
			if(s.getId()==id) {
				System.out.println(s.getSongName()+"Song playing");
			}
			else {
				System.out.println("song is not to play");
			}
			}
	}
}