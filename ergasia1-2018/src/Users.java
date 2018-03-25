
public class Users {

	/**
	 * @param args
	 */
	private String username,name,surname,department;
	private static int counter=0;
	
	public Users (String username,String name,String surname,String dept){
		this.username =username;
		this.name =name;
		this.surname=surname;
		this.department=dept;
		counter+=1;
		System.out.println("New User created!");
	}
	//Getters
	public String getUsername(){
		return username;
	}
	public String getName(){
		return name;
	}
	public String getSurname(){
		return surname;
	}
	public String getDepartment(){
		return department;
	}
	public static int getCounter(){
		return counter;
	}
	
	//Setters
	public void setUsername(String set){
		this.username =set;
	}
	public void setName(String set){
		this.name =set;
	}
	public void setSurname(String set){
		this.surname =set;
	}
	public void setDepartment(String set){
		this.department =set;
	}
	
	public String getUserInfo(){
		return getName()+" "+ getSurname()+" "+getDepartment();
	}
	

}
