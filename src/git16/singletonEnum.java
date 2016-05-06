package git16;
import java.util.Scanner;

public enum singletonEnum {
	
	
	 INSTANCE, in;

		static Scanner InputScanner= new Scanner (System.in);
		
	    private String Institution;
	    private String Province;
	    private String City;

	    private String getInstitution() {
	       return this.Institution;
	    }

	    private String getProvince() {
	       return this.Province;
	    }

	    private String getCity() {
	       return this.City;
	    }

	public abstract class StudentReg {
		
		 
		
	public abstract String getInstitution();
	public abstract String getProvince();
	public abstract String getCity();



	 }
	 public void Stud (){
		 

	     System.out.println("Student Is attending Programming"); 
	     
	    

	      
	 }

	 @Override
	public String toString(){
		 
		 
	return "Institution= "+this.getInstitution()+", Province="+this.getProvince()+",City="+this.getCity();
	}

	public static void main(String[] args)  {

		
	        singletonEnum.INSTANCE.Stud();

	       
	        
	       
	        System.err.println(" ");    
	        System.out.println("Enter Institution: " ); 
	        String Institution= InputScanner.nextLine();    

	        System.out.println("Enter Province: " ); 
	        String Province= InputScanner.nextLine();    

	        System.out.println("Enter City");
	        String City = InputScanner.nextLine();


	        System.out.println("Institution: " + Institution + "   Province: " + Province + "   City: " + City); 
			
	}


	}