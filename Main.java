/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
		bank b1=new bank();
		b1.loanPercentageYear();
		
		bank b2=new Sbi();
		b2.loanPercentageYear();
		
		bank b3=new hdfc();
		b3.loanPercentageYear();
		
		bank b4=new icici();
		b4.loanPercentageYear();
		
		
	}
}
