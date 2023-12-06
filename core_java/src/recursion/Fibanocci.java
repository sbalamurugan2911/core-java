package recursion;

public class Fibanocci {
	
	int first =-1,second=1;
	
	public void fibanocci(int n) {
		
		if(n>0) {
			
			int third=first+second;
			System.out.print(third+" ");
			first=second;
			second=third;
			fibanocci(n-1);
		}
	}

	public static void main(String[] args) {
		Fibanocci f=new Fibanocci();
		f.fibanocci(20);

	}

}
