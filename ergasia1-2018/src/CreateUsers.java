import java.util.Scanner;


public class CreateUsers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Users user = new Users("user1", "username", "surname", "financials");
		System.out.println(user.getUserInfo());
		
		Students stud = new Students("user2", "onoma", "epitheto", "informatics", "P16131") ;
		System.out.println(stud.getStudentInfo());
		
		Professors prof = new Professors("profUser"	, "profname", "profsurname", "informatics", 123456789);
		System.out.println(prof.getProfessorInfo());

		Secretaries sec = new Secretaries("secUser", "secName", "secSurname", "informatics", 100);
		System.out.println(sec.getSecretaryInfo());

		
		Scanner input = new Scanner(System.in);
		System.out.println("Give new name:");
		stud.setName(input.nextLine());
		System.out.println("Give Department");

		stud.setDepartment(input.nextLine());
		System.out.println(stud.getStudentInfo());
		input.close();
		
	}

}
