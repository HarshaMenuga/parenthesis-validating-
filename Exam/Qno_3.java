package exam;

public class Qno_3 {

	    public static void main(String[] args) {
	        
	        int variable=65;
	        for(int i=5;i>=1;i--) {
	            for(int j=1;j<=i;j++) {
	                System.out.print((char) variable +" ");
	            }
	            variable++;
	            System.out.println();
	        }

	    }

	}