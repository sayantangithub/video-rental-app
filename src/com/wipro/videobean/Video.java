package com.wipro.videobean;

public class Video {
	private String videoName; 
	private boolean checkOut;
	private int rating;
	public Video(String name) {
		videoName=name;
	}
	public String getName() {
		return videoName;
	}
	public void doCheckOut() {
		checkOut=true;
	}
	public void doReturn() {
		checkOut=false;
	}
	public void recieveRating(int rating) {
		this.rating = rating;
	}
	public int getRating() {
		return rating;
	}
	public boolean getCheckOut() {
		return checkOut;
	}  
}
