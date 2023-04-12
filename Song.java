package com.jspider.musicplayer;

public class Song {
	private int id;
	private String songName;
	private String singer;
	private String duration;
	public Song(int id,String songName,String singer,String duration) {
		this.id=id;
		this.songName=songName;
		this.singer=singer;
		this.duration=duration;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration=duration;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id=id;
	}
	public String getSongName() {
		return songName;
	}
	public void setSongName(String songName) {
		this.songName=songName;
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer=singer;
	}
	@Override
	public String toString() {
		return "Song [id="+id+", Title"+songName+", Singer="+singer+",Duration="+duration+ "]";
	}
	public void viewSong() {
		System.out.println("Id:"+ id);
		System.out.println("Title:"+ songName);
		System.out.println("Singer:"+ singer);
		System.out.println("Duration:"+ duration);
	}
}
	

	