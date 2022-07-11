package org.junit;

import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class RunClass {
	
	@Test
	public void test1() {
		Result res = JUnitCore.runClasses(JunitAssert.class,StudentJunit.class,JunitOne.class);
		System.out.println("Failure Count: " + res.getFailureCount());
		System.out.println("Run count: " + res.getRunCount());
		System.out.println("Ignore count: " + res.getIgnoreCount());
		int passcount = res.getRunCount() - res.getFailureCount();
		System.out.println("Passcount: " + passcount);
		List<Failure> failures = res.getFailures();
		for (Failure x : failures) {
			System.out.println(x);
			
		}

	}

}
