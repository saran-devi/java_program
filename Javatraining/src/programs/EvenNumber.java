package programs;

public class EvenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=0;
		while(i<=98) {
			int s=i%2;
			if(s==0)
			System.out.print(i);
			else
			System.out.print(",");
			i++;
			
		}
	}

}
