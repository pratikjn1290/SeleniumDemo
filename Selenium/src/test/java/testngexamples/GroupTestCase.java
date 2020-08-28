
package testngexamples;

import org.testng.annotations.Test;

public class GroupTestCase {

	@Test(groups = "Smoke")
	public void test1() {
		System.out.println("Test1");
		System.out.println("Smoke Passed");
	}

	@Test(groups = "Smoke")
	public void test2()


	{

		System.out.println("Test2");
		System.out.println("Smoke Passed");
	}

	@Test(groups = "Functional")
	public void test3()

	{
		System.out.println("Test3");
		System.out.println("Functional Passed");
	}

	@Test(groups = "Functional")
	public void test4()

	{
		System.out.println("Test4");
		System.out.println("Functional Passed");
	}
}
