import java.util.*;

class Student{
	private int id;
	private String fname;
	private double cgpa;
	public Student(int id, String fname, double cgpa) {
		super();
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}
	public int getId() {
		return id;
	}
	public String getFname() {
		return fname;
	}
	public double getCgpa() {
		return cgpa;
	}
}

//Complete the code
public class Sorting
{
	public static void main(String[] args){
		System.out.println(3.75 - 3.75);
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		
		List<Student> studentList = new ArrayList<Student>();
		
		while(testCases>0){
			int id = in.nextInt();
			String fname = in.next();
			double cgpa = in.nextDouble();
			
			Student st = new Student(id, fname, cgpa);
			studentList.add(st);
			
			testCases--;
		}
		Collections.sort(studentList,(a,b)->{
			int p = 0;
			if(a.getCgpa() - b.getCgpa() <0) {p = 1;}
			if(a.getCgpa() - b.getCgpa() >0) {p = -1;}
			if(a.getCgpa() - b.getCgpa() == 0) {p = 0;}
			if(p==0 || p ==0.0) {
				return a.getFname().compareTo(b.getFname());
			}
			return p;
			});
      	for(Student st: studentList){
			System.out.println(st.getFname());
		}
	}
}



