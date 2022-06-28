import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4j_Example {

	
		public static Logger log= LogManager.getLogger(Log4j_Example.class.getName());

	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		int n1=sc.nextInt();
		System.out.println("Enter second number");
		int n2=sc.nextInt();
		log.debug("checking for division");
		if(n1==0) {
			log.error("n1 value is 0");
		}
		else if(n2==0)
		{
			log.error("n2 value is 0");
		}
		int n3=n1/n2;	
		System.out.println(n3);
		log.info("log captured");
		
	}

}
