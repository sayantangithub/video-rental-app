package com.wipro.service;

import java.util.Scanner;

import com.wipro.videobean.VideoStore;

public class VideoLauncher {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		VideoStore videoStore=new VideoStore();
		do {
			System.out.println("1.Add Video:");
			System.out.println("2.Check out video:");
			System.out.println("3.Return Video:");
			System.out.println("4.Recieve Rating:");
			System.out.println("5.List Inventory:");
			System.out.println("6.Exit:");
			System.out.print("Enter your choice(1...6):");
			int ch=sc.nextInt();
			sc.nextLine();
			//Read the choice 
			String name;
			switch(ch) {
				case 1:
					System.out.println("Enter the name of the video you want to add");
					name=sc.nextLine();
					videoStore.addVideo(name);
					System.out.println("Video "+name+" added successfully.");
					break;
				case 2:
					System.out.println("Enter the name of the video you want to checkout:");
					name=sc.nextLine();
					videoStore.doCheckOut(name);
					System.out.println("Video "+name+" checked out successfully.");
					break;
				case 3:
					System.out.println("Enter the name of the video you want to Return:");
					name=sc.nextLine();
					videoStore.doReturn(name);
					System.out.println("Video "+name+" returned successfully.");
					break;
				case 4:
					System.out.println("Enter the name of the video you want to rate");
					name=sc.nextLine();
					System.out.println("Enter the rating for the video");
					int rating=sc.nextInt();
					videoStore.recieveRating(name,rating);
					System.out.println("Rating "+rating+" has been mapped to the video "+name+".");
					break;
				case 5:
					videoStore.listInventory();
					break;
				case 6:
					if(sc!=null)
						sc.close();
					System.exit(0);
					break;
			}
		}while(true); 
	}
}
