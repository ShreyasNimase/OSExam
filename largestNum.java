public class largestNum{
	public static void main(String [] args){
	
	int start = 1000;
	int end = 9999;
	int res = 0;
	for(int i=start;i>=start && i<= end;i++){
		if(i%10 == 0 && i%13==0){
			res=i;
		}
	}
	System.out.println("Largest 4 digit number divisible by 10 and 13 is " + res);
}
}