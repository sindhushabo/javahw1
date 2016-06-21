package hw2;

public class prime_numbers {
	
	public static void main (String args[]){

       
        System.out.println("Prime numbers between 1 and 50");
        for(int i=2; i < 50; i++){
               
                boolean p = true;
               
                for(int j=2; j < i ; j++){
                       
                        if(i % j == 0)//for composite numbers this is true
                        	{
                                p = false;
                                break;
                        }
                }
                if(p){
                        System.out.println(i);
        }    
	}
	}
}
