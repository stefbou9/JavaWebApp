
public class Courses {
	
	private String courseID,courseName,courseDescription;
	private Professors professor;
	
	public String getCourseID() {
		return courseID;
	}
	public void setCourseID(String courseID) {
		this.courseID = courseID;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getCourseDescription() {
		return courseDescription;
	}
	public void setCourseDescription(String courseDescription) {
		this.courseDescription = courseDescription;
	}
	public Professors getProfessor() {
		return professor;
	}
	public void setProfessor(Professors professor) {
		this.professor = professor;
	}

}
