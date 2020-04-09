import java.util.ArrayList;

class Student {
	String index;
	String firstName;
	String lastName;
	ArrayList<Integer> grades = new ArrayList<Integer>(40);

	//TODO constructor

	public Student(String index, String firstName, String lastName, ArrayList<Integer> grades) {
		this.index = index;
		this.firstName = firstName;
		this.lastName = lastName;
		this.grades = grades;
	}

	//TODO seters & getters
	public String getIndex() {

		return index;
	}

	public void setIndex(String index) { this.index = index; }

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public ArrayList<Integer> getGrades() {
		return grades;
	}

	public void setGrades(ArrayList<Integer> grades) {
		this.grades = grades;
	}

	public double getAverage(ArrayList<Integer> grades) {
		//TODO
		int broj_ocenki = 0, zbir = 0;
		for (Integer i: grades) {
			zbir += i;
			broj_ocenki++;
		}
		return zbir/broj_ocenki;
	}

	public int ECTSCredits(ArrayList<Integer> grades) {
		//TODO
		int broj_ocenki = 0;
		for (Integer i: grades) {
			broj_ocenki++;
		}
		return broj_ocenki * 6;
	}
}