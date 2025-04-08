package com.wipro.videobean;

public class VideoStore {
	
	private Video[] store;
	
	public void addVideo(String name) {//ABC
		int storeSize;
		Video video=new Video(name);
		try {
			storeSize=store.length;
		} catch (Exception e) {
			storeSize=0;
		}
		Video[] newStore=new Video[storeSize+1];
		newStore[storeSize]=video;
		for(int i=0;i<storeSize;i++)
			newStore[i]=store[i];
		
		store=newStore;
	}
	public void doCheckOut(String name){
		if(store==null) {
			System.out.println("store is empty");
		}
		for(Video video:store) {
			if(video.getName().equals(name)){          //name is equal to already stored video name
				video.doCheckOut();
			}
		}
	}
	public void doReturn(String name) {
		if(store==null) {
			System.out.println("store is empty");
		}
		for(Video video:store) {
			if(video.getName().equals(name))        //name is equal to already stored video name
				video.doReturn();
		}
	}
	public void recieveRating(String name,int rating) {
		if(store==null) {
			System.out.println("store is empty");
		}
		for(Video video:store) {
			if(video.getClass().equals(name))
				video.recieveRating(rating);
		}
	}
	public void listInventory() {
		if(store==null) {
			System.out.println("store is empty");
		}
		System.out.println("---------------------------------------------------------");
		System.out.printf("%-15s %-6s %-20s %-6s %s\n", "Video Name", "|", "Checkout Status", "|", "Rating");
		for(Video video:store)
			System.out.printf("%-15s %-6s %-20s %-6s %s\n",video.getName(),"|", video.getCheckOut(),"|",video.getRating());
	}
}
