import java.util.Scanner;

public class Main {

public static void main(String[] args){

	int[] candidatenum = new int[9];
	int numbers;
    int counter;
    int x = 0;
    int[] count = new int[9] ;
    int y = 0;
    
    Scanner kbd = new Scanner(System.in);
    
    System.out.println("Hello! To register your vote, enter the number of votes and the corresponding votes per line:");
    numbers = kbd.nextInt();	
    
    for(counter = 0; counter < numbers; counter++){
    	candidatenum[counter] = kbd.nextInt();
		count[counter] = 0;

    	for(x = counter; x < numbers; x++ ){
    		if(candidatenum[counter] == candidatenum[x]){
    			count[y] += 1;   
    		}
		    
    		else{
    			y = y + 1;
		        }
    	}
    }
    if(count[counter + 1] >= count[counter]){
    	System.out.println( " wins with " + count[counter + 1] + " votes out of " + (numbers));
    }
    else{
    	System.out.println("no candidate received a majority of the votes");
    }
}
}