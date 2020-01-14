interface A{
	void a();
	private b;
}
class m extends A
{
public void a(){System.out.println("hey");
}
class test
{
	public static void main(String args[])
	{
		A x = new m();
		x.a();
	}
}
}