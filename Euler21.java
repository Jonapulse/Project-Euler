package problems;

import java.lang.Error;
import java.util.*;
import java.io.*;

public class Euler21 {
	//Whoops, actually this is Euler22
	public static void main(String args[]){
		ArrayList<String> nameList = getNameFile("names.txt");
		Collections.sort(nameList);
		int score = 0;
		for(int i = 0; i < nameList.size(); i++){
			score += (i+1) * nameValue(nameList.get(i));
		}
		System.out.println(score);
	}
	
	public static ArrayList<String> getNameFile(String fileName){
		ArrayList<String> names = new ArrayList<String>();
		try{
			BufferedReader file = new BufferedReader(new FileReader(fileName)); 
			while(true){
				String line = file.readLine();
				if(line == null) break;
				StringTokenizer tok = new StringTokenizer(line, "\" ,");
				while(tok.hasMoreTokens()){
					names.add(tok.nextToken());
				}
			}
		} catch(IOException ex){
			throw new Error("File problem!");
		}
		return names;
	}
	
	public static int nameValue(String name){
		int nameVal = 0;
		for(int i = 0; i < name.length(); i++){
			nameVal += name.charAt(i) - 'A' + 1;
		}
		return nameVal;
	}
}
