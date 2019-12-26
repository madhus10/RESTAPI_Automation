package Suite2;

import org.testng.annotations.Test;

public class Basic10 {
	@Test(priority=1)
	public void test1() {
		System.out.println("Adding jira1");
		System.out.println("Adding jira2");
		System.out.println("Adding jira3");

	}
	
	@Test(priority=2)
	public void test2() {
		System.out.println("Adding jira1");
		System.out.println("Adding jira2");
		System.out.println("Adding jira3");

	}
}
