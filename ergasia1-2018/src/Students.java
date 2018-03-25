
public class Students extends Users{
	
	private final String registrationNumber;

	public Students(String username, String name, String surname, String dept, String regNum) {
		super(username, name, surname, dept);
		registrationNumber=regNum;
		System.out.println("New Student created!");
	}

	public String getRegistrationNumber() {
		return registrationNumber;
	}
	
	public String getStudentInfo(){
		return getUserInfo()+" "+getRegistrationNumber() ;
	}	

}
