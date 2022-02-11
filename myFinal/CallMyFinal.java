package myFinal;

        //A class with final keyword can not be inherited / extended.
		//We can create the object for final class and we can access the members of the final class thru its object.
		//We can have only concrete functions in a final class.

public class CallMyFinal
{
    MyFinal mf = new MyFinal();

	int sum = mf.addition(44,88);
	int var1;
	int var2 = 456;
	public void myAddition()
	{
		mf.addition(33,55);
	}
}
