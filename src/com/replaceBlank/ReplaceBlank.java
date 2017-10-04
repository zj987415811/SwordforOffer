package com.replaceBlank;

public class ReplaceBlank {
	public ReplaceBlank(String orignString) {
		if(orignString==null)
		{
			return;
		}
		int orignLength=orignString.length();
		int newi=0;
		StringBuilder newString=new StringBuilder();
		while(newi<orignLength) {
			if(orignString.charAt(newi)==' ') 
			{
				newString.append("02%");
			}else {
				newString.append(orignString.charAt(newi));
			}
			++newi;
		}
		System.out.println(newString);
		
	}
}
