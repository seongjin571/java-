package jdbc.dto;

public class StudyMember {
	private int id;
	private String name;
	private String hometown;
	StudyMember(){
		
	}
	public StudyMember(int id, String name, String hometown){
		this.id = id;
		this.name = name;
		this.hometown = hometown;
	}
	public int getId(int id) {
		return id;
	}
	public String getName(String name) {
		return name;
	}
	public String getHometown(String hometown) {
		return hometown;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setHometown(String hometown) {
		this.hometown = hometown;
	}
	public String toString() {
		return "Id = " + id + ", name = " + name + ", hometown = "+hometown;
	}

}
