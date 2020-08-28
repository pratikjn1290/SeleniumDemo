package testngexamples;

import org.testng.annotations.Test;

public class DepedancyExample {

	@Test(dependsOnGroups = "1", groups = { "Smoke" })
	public void test1() {
		System.out.println("Login Successfull");

	}

	@Test(dependsOnGroups = "1", priority = 3, groups = { "Functional" })
	public void test2() {
		System.out.println("Account Created");
	}

	@Test(priority = 1, groups = "1")
	public void test3()

	{
		System.out.println("Registration Successfull");
	}

	@Test(enabled = true)
	public void disbalemethod() {
		System.out.println("Method has been disbaled");
	}

}
 