package loopsDemo;

public class Continue_Do_While {

	public static void main(String[] args) {
		
		int j =0;

	do {
	
		if(j==7) {
			
			j++;
			
			continue;
		}
		System.out.print(j+" ");
		
		j++;
		
	} while(j<10);
	
	
	}

}
