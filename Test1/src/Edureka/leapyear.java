package Edureka;

public class leapyear {

	public static void main(String[] args) {
		 int[] arr = new int[4];
		 arr[0]=1900; arr[1]=2014; arr[2]= 2004; arr[3]=2000;
		 
		 for(int i=0;i<arr.length;i++)
		 { 
			 if( arr[i]%400==0)
			 {
				 System.out.println(arr[i]+ " is a century leap year");
			 }
			 else if(arr[i]%4==0) 
				 System.out.println(arr[i]+ " is a non century leap year");
			 else 
				 System.out.println(arr[i]+ " is not a leap year");			  
		 }
	}

	}


