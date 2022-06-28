package entities;

public class studentGrade {
	
	//criação das variáveis
	public String name;
	public double grade1;
	public double grade2;
	public double grade3;	
	
	public double sumGrades() {    //somatorio das notas
		return grade1 + grade2 + grade3;
	}
	
	public double passOrFail() { //verificação da condição de aprovação
		if (sumGrades() < 60.0) {
			return 60.0 - sumGrades();
		} 
		else {
			return 0.0;
		}		
	}
}
