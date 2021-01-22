import java.util.Scanner;

class Bake{
	
	private int bakerId;
	private String bakerName;
	private char bakerClass;
	private double bakerRating;
	private boolean OnlineDelivery;
	
	Bake(){
		
	}
	Bake(int a,String b,char c,double d,boolean e){
		
		this.setBakerId(a);
		this.setBakerName(b);
		this.setBakerClass(c);
		this.setBakerRating(d);
		this.setOnlineDelivery(e);
	}
	public int getBakerId() {
		return bakerId;
	}
	public void setBakerId(int bakerId) {
		this.bakerId = bakerId;
	}
	public String getBakerName() {
		return bakerName;
	}
	public void setBakerName(String bakerName) {
		this.bakerName = bakerName;
	}
	public char getBakerClass() {
		return bakerClass;
	}
	public void setBakerClass(char bakerClass) {
		this.bakerClass = bakerClass;
	}
	public double getBakerRating() {
		return bakerRating;
	}
	public void setBakerRating(double bakerRating) {
		this.bakerRating = bakerRating;
	}
	public boolean isOnlineDelivery() {
		return OnlineDelivery;
	}
	public void setOnlineDelivery(boolean onlineDelivery) {
		OnlineDelivery = onlineDelivery;
	}
	
}
public class Bakers {
	
	public static void main(String args[]) {
		
		Bake bk[]=new Bake[4];
		System.out.println("Enter Details of Bakers:");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<bk.length;i++) {
			
			int a=sc.nextInt();
			sc.nextLine();
			String b=sc.nextLine();
			char c=sc.next().charAt(0);
			double d=sc.nextDouble();
			boolean e=sc.nextBoolean();
			bk[i]= new Bake(a,b,c,d,e);
			
		}
		
		System.out.println("Enter bakerid");
		int idd=sc.nextInt();
		System.out.println("Enter Class");
		char dc=sc.next().charAt(0);
		Bake li[]=sortBakersRatingOfClass(bk,dc);
		String delivery=findDeliveryType(bk,idd);
		
		

           System.out.println(delivery);
           for(int t=0;t<li.length;t++) {
        	   System.out.println(li[t].getBakerRating());
           }
          
	}
	
	public static String findDeliveryType(Bake arr[],int bakerid) {
		
		String ans=null;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i].getBakerId()==bakerid)
			{
			if(arr[i].isOnlineDelivery()==true) {
				
				ans="Online Delivery";
			}
			if (arr[i].isOnlineDelivery()==false) {
				
				ans="no online delivery";
			}
			}
			
			
				
			
		}
		
		return ans;
		
	}
	public static Bake[] sortBakersRatingOfClass(Bake arr[],char bakerClass) {
		
		
		int j=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i].getBakerClass()==bakerClass) {
				
				j++;
				
			}
		}
		Bake b[]=new Bake[j];
		Bake c[]=new Bake[1];
		j=0;
	    for(int t=0;t<arr.length;t++) {
	    	if(arr[t].getBakerClass()==bakerClass) {
	    		b[j]=arr[t];
	    		j++;
	    	}
	    }
	    int z=0;
	   for(int k=0;k<b.length-1;k++) {
		   for(int l=0;l<b.length-k-1;l++) {
			 if(b[l].getBakerRating()>b[l+1].getBakerRating()) {
				   
				   c[z]=b[l+1];
				   b[l+1]=b[l];
				   b[l]=c[z];
				   
			   }
			  
		   }} 
	    return b;
	    
	}
	}

	
		


