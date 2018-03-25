
public class Secretaries extends Users{
	private final int secretaryID;
	public Secretaries(String username, String name, String surname, String dept,int ID) {
		super(username, name, surname, dept);
		secretaryID =ID;
		System.out.println("New Secretary created!");
	}
	public int getSecretaryID() {
		return secretaryID;
	}

	public String getSecretaryInfo(){
		return getUserInfo() +" "+getSecretaryID();
	}
}
