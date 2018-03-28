import java.util.InputMismatchException;
import java.util.Scanner;



public class Students extends Users{
	
	private final int registrationNumber;
	
	public Students(String username, String name, String surname, String dept, int regNum) {
		super(username, name, surname, dept);
		registrationNumber=regNum;
		System.out.println("New Student created!" );
	}
	
	private int getValue(){
		Scanner read = new Scanner(System.in);
		//int x=0;
		//String b = "";

		try{
			return read.nextInt();
		}
		catch(InputMismatchException e){
			System.out.println("Wrong input try again.");
			return getValue();
		}
	}
	
	public Students(){
		super() ;
		System.out.println("Students Registration Number (integer):");
		registrationNumber = getValue();
		System.out.println("New Student created!" );
	}

	public int getRegistrationNumber() {
		return registrationNumber;
	}
	
	public String getStudentInfo(){
		return getUserInfo()+" "+getRegistrationNumber() ;
	}	

}
