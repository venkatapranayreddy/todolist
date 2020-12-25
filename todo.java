package com.company;

import java.util.ArrayList;

public class todo {

	private ArrayList<String> todolist =new ArrayList<String>();

	//ADD LIST ITEM
	public void additem(String item) {
		todolist.add(item);
		
	}
	
	//remove list item
	public void removeitem(int index) {
		String myitem = todolist.get(index);
		todolist.remove(index);
	}
	
	
	
	//print complete list item
	public void printtodolist() {
		System.out.println("the todolist consist of:"+ todolist.size()+ " items \n");
		
		for(int i =0; i < todolist.size(); i++) {
			System.out.println("item position" + (i+1) + "is" + todolist.get(i));
		}
	}
	
	// update the list 
	public void updatetodolist(int index, String List) {
		todolist.set(index, List);
		System.out.println("updatation completed at postion" + (index+1));
		
		
	}
	
	// search feature for user
	public String finditem(String searchitem) {
		int index = todolist.indexOf(searchitem);
		if (index == -1)
		{
			return null;
		} else {
			return todolist.get(index);
			
		}
	}
}
