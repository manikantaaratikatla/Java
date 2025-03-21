package myFirstProgram;
import java.util.Arrays;
public class Strings {

	public static void main(String[] args) {
		/*String s1="Palak";
		String s2="Palak";
		s1=s1.concat("abc");
		System.out.println(s1);
		String s3=new String("Palak");
		if(s1==s3) {
			System.out.println("true");
		}
		else {
			System.out.println("False");
		}
		System.out.println(s1.equals(s3));
		int i=s1.compareTo(s2);
		System.out.println(i);
		
		String rev=" ";
		for(int j=s1.length()-1;j>=0;j--) {
			rev=rev+s1.charAt(j);
		}
		if(s1.equals(rev)) {
			System.out.println("pal");
		}
		else {
			System.out.println("not pal");
		}
		*/
		/*
		String s1="keep";
		String  s2="peek";
		if(s1.length()==s2.length()) {
			char c1[]=s1.toCharArray();
			char c2[]=s2.toCharArray();
			Arrays.sort(c1);
			Arrays.sort(c2);
			boolean b=Arrays.equals(c1,c2);
			if(b) {
				System.out.println("anagram");
			}
			else {
				System.out.println("not anagram");
			}
				
			}
		else {
			System.out.println("not anagram because of length");
		}
*/
		/*
		String s1="I am fine";
		int ccount=0;
		int scount=0;
		for(int j=0;j<s1.length();j++) {
			char c=s1.charAt(j);
			if(c!=' ') {
				ccount++;
			}
			else {
				scount++;
			}
		}
		System.out.println("char count is: "+ ccount);
		System.out.println("Space count is :"+scount);
		String sa[]=s1.split(" ");
		System.out.println("wcount "+ sa.length);
		*/	
		/*
		String x="Palak";
		String z="I am not fine";
		int ix=z.indexOf('f');
		System.out.println(ix);
		String nz=z.replace("not ", "");
		System.out.println(nz);
		int iz=nz.indexOf('f');
		System.out.println(iz);
		*/
		/*
		        String str = "Hello World!";

		        
		        str = str.toLowerCase();

		        int vowels = 0, consonants = 0;

		        for (int i = 0; i < str.length(); i++) {
		            char ch = str.charAt(i);

		            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
		                vowels++;
		            }
		            else if (ch >= 'a' && ch <= 'z') {
		                consonants++;
		            }
		        }

		        System.out.println("Number of vowels: " + vowels);
		        System.out.println("Number of consonants: " + consonants);
*/
	}

}
