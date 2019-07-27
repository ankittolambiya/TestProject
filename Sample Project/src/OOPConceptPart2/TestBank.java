package OOPConceptPart2;

public class TestBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Static polymorphism
		
		HSBCBank bank=new HSBCBank();
		
		bank.credit();
		bank.debit();
		bank.transferMoney();
		bank.educationLoan();
		bank.carLoan();
		
		// Dynamic polymorphism
		
		USBank usBank=new HSBCBank();
		
		usBank.credit();
		usBank.debit();
		usBank.transferMoney();
		
	}

}
