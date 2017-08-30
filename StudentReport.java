
public class StudentReport {
	
	
	private String Name;
	private int RollNo;
	private String Course;
	private int marksOfSub1;
	private int marksOfSub2;
	private int marksOfSub3;
	private float percentage;
	private char Grade;
	
	public StudentReport() {           //default constructor
		
		Name=null;
		RollNo=0;
		Course=null;
		marksOfSub1=0;
		marksOfSub2=0;
		marksOfSub3=0;
		percentage=0;
		Grade='D';
	}

	public StudentReport(String name,int rollno,String course,
			int marksofsub1,int marksofsub2,int marksofsub3) {
		this(marksofsub1,marksofsub2);
		Name=name;
		RollNo=rollno;
		Course=course;      //only showing constructor overloading
		
		
	}
	
	public StudentReport(int marksofsub1,int marksofsub2) {
		this();
		marksOfSub1=marksofsub1;
		marksOfSub2=marksofsub2;
		
	}
	
	public StudentReport(int marksofsub3) {
		
		this();
		marksOfSub3=marksofsub3;
	}
	
	public void getData(String name,String course,int rollno,
			int marksofsub1,int marksofsub2,
			int marksofsub3) {
		
		Name=name;
		RollNo=rollno;
		Course=course;
		marksOfSub1=marksofsub1;
		marksOfSub2=marksofsub2;
		marksOfSub3=marksofsub3;
	}
	
		
		
	
	/**
	 * @return the name
	 */
	
    public String getName() {
		return Name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		Name = name;
	}

	/**
	 * @return the course
	 */
	public String getCourse() {
		return Course;
	}

	/**
	 * @param course the course to set
	 */
	public void setCourse(String course) {
		Course = course;
	}

	/**
	 * @return the marksOfSub1
	 */
	public int getMarksOfSub1() {
		return marksOfSub1;
	}

	/**
	 * @param marksOfSub1 the marksOfSub1 to set
	 */
	public void setMarksOfSub1(int marksOfSub1) {
		this.marksOfSub1 = marksOfSub1;
	}

	/**
	 * @return the marksOfSub2
	 */
	public int getMarksOfSub2() {
		return marksOfSub2;
	}

	/**
	 * @param marksOfSub2 the marksOfSub2 to set
	 */
	public void setMarksOfSub2(int marksOfSub2) {
		this.marksOfSub2 = marksOfSub2;
	}

	/**
	 * @return the marksOfSub3
	 */
	public int getMarksOfSub3() {
		return marksOfSub3;
	}

	/**
	 * @param marksOfSub3 the marksOfSub3 to set
	 */
	public void setMarksOfSub3(int marksOfSub3) {
		this.marksOfSub3 = marksOfSub3;
	}
	
	
	public void calculatePercent() {
		
	 percentage=(marksOfSub1+marksOfSub2+marksOfSub3)/3;	
		
	}
	
	public float returnPercent() {
		

		return percentage;
	}
	
	public void calculateGrade() {
		
		if(percentage>90) {
			
			Grade='A';
		}
		
		else if(percentage<80) {
			
			Grade='B';
		}
		
		else if(percentage<70) {
			
			Grade='C';
		}
		
		else {
			
			Grade='D';
		}
	}
	
	public char returnGrade() {
		return Grade;
		
		
	}
	public void printReport() {
		
		System.out.println("Name is "+ Name);
		System.out.println("RollNo is "+ RollNo);
		System.out.println("Course is"+Course);
		System.out.println("Marks of subject 1 is: "+marksOfSub1);
		System.out.println("Marks of subject 2 is: "+marksOfSub2);
		System.out.println("Marks of subject 3 is: "+marksOfSub3);
		System.out.println("Percentage of the student is: "+percentage);
		System.out.println("Grade of the student is: "+Grade);
	}
	
	

}
