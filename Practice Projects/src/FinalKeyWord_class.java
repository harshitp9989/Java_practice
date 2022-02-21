final class PersonalDetails
{
	public void phone()
	{
		System.out.println("8639686104");
	}
	
	public final void password() 
	{
		System.out.println("9999");
	}
}

class Virus extends PersonalDetails
{
	//look at the error; Virus can't extend PersonalDetails since the later is a final class
}

public class FinalKeyWord_class {
	public static void main(String Args[])
	{
		Virus ff = new Virus();
		ff.phone();
		ff.password();
	}

}
