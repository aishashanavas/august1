package p1;



public class stringoperations {

	public static void main(String[] args) {
		String s1="hello my world";
		String s2="hai";
		String s3="    Hello World";
		//concat
		System.out.println(s2.concat(s3));
		System.out.println(1+3+s2+3+4);//4hai34
		
		//equals
		System.out.println(s1.equals(s3));
		System.out.println(s1.equalsIgnoreCase(s3));
		
		//contains
		System.out.println(s1.contains("world"));
		
		//length
		System.out.println(s2.length());
		
		//touppercase and tolowercase
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		
		//startswith and endswith
		System.out.println(s1.startsWith("hello"));
		System.out.println(s1.endsWith("world"));
		
		//trim
		System.out.println(s3.trim());
		
		//charAt()
		System.out.println(s2.charAt(1));

		//split
		String[] ar=s1.split(" ");
		for(String e:ar) {
			System.out.println(e);
		}
		
		//replace
		System.out.println(s1.replace("my","our"));
		
		//substring
		System.out.println(s1.substring(0,3));
	}
	
	

}
