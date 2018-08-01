package wlamart;

import java.util.Arrays;

public class AnnagramArray {

	public static void main(String[] args) {
		
		String [] str = {"dog", "god", "muri","rium", "ogd"};
		
		areAnagram(str);
		

	}
	
	public static void areAnagram(String[] str) {
		
		String[] newArr = str.clone();
		
		for(int i = 0; i < str.length; i++) {
			char[] ch = str[i].toCharArray();
			Arrays.sort(ch);
			
			str[i] = new  String(ch);
		}
		for(int i = 0; i<str.length; i++) {
			for(int j = i+1; j<str.length; j++) {
				if(str[i].equals(str[j])){
					System.out.println("["+newArr[i] + "," + newArr[j]+"]");
				}
			}
		}
	}

}