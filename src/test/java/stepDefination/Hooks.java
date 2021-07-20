package stepDefination;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	
	@Before("@Sanity")
	public void beforeValidation() {
		System.out.println("Sanity Before hook");
	}

	@After("@Sanity")
	public void afterValidation() {
		System.out.println("Sanity After hook");
	}
}
