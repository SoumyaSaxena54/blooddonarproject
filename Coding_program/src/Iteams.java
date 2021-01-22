import java.util.Scanner;

class Item{
    private int itemId;
    private String itemName;
    private String itemType;
    private double itemPrice;
    
    Item(){}
    Item(int a,String b,String c,double d){
        this.itemId=a;
        this.itemName=b;
        this.itemType=c;
        this.setItemPrice(d);
    }
    public int getitemId(){
        return itemId;
    }
    public void setitemId(int itemId){
        this.itemId=itemId;
    }
    public String getitemName(){
        return itemName;
        
    }
    public void setitemName1(String itemName){
        this.itemName=itemName;
    }
     public String getitemType(){
        return itemType;
        
    }
    public void setitemName(String itemType){
        this.itemType=itemType;
    }
    public double getitemPrice(){
        return getItemPrice();
    }
	public double getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}
   
    
}

public class Iteams{
    public static void main(String args[]){
        Item it[]=new Item[4];
        System.out.println("Enter Details");
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<it.length;i++){
            int a=sc.nextInt();
            sc.nextLine();
            String b=sc.nextLine();
            sc.nextLine();
            String c=sc.nextLine();
            double d=sc.nextDouble();
            it[i]=new Item(a,b,c,d);
        }
        
    }
   
}