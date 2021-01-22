import java.util.Scanner;

class Movie{
	
	private int movieId;
	private String director;
	private int	rating;
	private int budget;
	
	Movie(){
		
	}
	Movie(int a,String b,int c,int d){
		
		this.setMovieId(a);
		this.setDirector(b);
		this.setRating(c);
		this.setBudget(d);
	}
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public int getBudget() {
		return budget;
	}
	public void setBudget(int budget) {
		this.budget = budget;
	}
	
}
public class MovieManagement {
	
	public static void main(String args[]) {
		
		Movie m[]=new Movie[4];
		System.out.println("Enter Details of Movie:");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<m.length;i++) {
			
			int a=sc.nextInt();
			sc.nextLine();
			String b=sc.nextLine();
			int c=sc.nextInt();
			int d=sc.nextInt();
			m[i]=new Movie(a,b,c,d);
		}
		
		System.out.println("Enter Director's Name");
		 sc.nextLine();
		String dd=sc.nextLine();
		int rr=sc.nextInt();
		int bb=sc.nextInt();
		double res=findAvgBudgetByDirector(m,dd);
		if(res>0) {
			System.out.println(res);
		}
		else {
			System.out.println("Sorry Not Found Director");
		}
		int id=0;
		 id=getMovieByRatingBudget(m,rr,bb);
		if(id>0) {
			System.out.println(id);
		}
		else {
			System.out.println("Not Found");
		}
		
	}
	
	public static double findAvgBudgetByDirector(Movie arr[],String director) {
		
		int res = 0;
		int avg;
		int j=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i].getDirector().equalsIgnoreCase(director)) {
				
				System.out.println(arr[i].getDirector());
				System.out.println(arr[i].getBudget());
				res=res+arr[i].getBudget();
				j++;
			}
			
	
		}
		
		if(j>0) {
			
			avg=res/j;
			return avg;
		}
	
		
		return 0;
	}
	
	public static int getMovieByRatingBudget(Movie arr[],int rating,int budget) {
		
		for(int i=0;i<arr.length;i++) {
			if((arr[i].getRating()==rating) && (arr[i].getBudget()==budget) && 
					(arr[i].getBudget()%arr[i].getRating()==0)) {
				
				return arr[i].getMovieId();
			}
		}
		return 0;
	}

}
