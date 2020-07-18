package conscCal;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


class cost{
	cost() throws IOException{
		int total=0;
	BufferedReader read =new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter r = new BufferedWriter(new OutputStreamWriter(System.out));
		 
	r.write("Welcome to My Constructions \nPlease Select the type of material from the following \n1.standard materials \n2.above standard materials \n3.high standard material \n4.Fully automated House");
	r.flush();
	int m = Integer.parseInt(read.readLine());
	r.write("enter the area of the house(In square feets)");
	r.flush();
	
	int area = Integer.parseInt(read.readLine());
	
	if(m==1) {
		 total=1200*area;
	}
	if(m==2) {
		 total=1500*area;
	}
	if(m==3) {
		 total=1800*area;
	}
	if(m==4) {
		 total=2500*area;
	}
	
	 r.write("\nThe Estimated cost is "+total+" Rupees");
     r.flush();

	}
}

public class ConstCal {
	public static void main(String[] args) throws IOException
    { 
cost c =new cost();

    } 
}