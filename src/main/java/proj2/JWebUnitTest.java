package proj2;
import static net.sourceforge.jwebunit.junit.JWebUnit.assertLinkPresent;
import static net.sourceforge.jwebunit.junit.JWebUnit.assertTitleEquals;
import static net.sourceforge.jwebunit.junit.JWebUnit.beginAt;
import static net.sourceforge.jwebunit.junit.JWebUnit.clickLink;
import static net.sourceforge.jwebunit.junit.JWebUnit.setBaseUrl;
import static net.sourceforge.jwebunit.junit.JWebUnit.setTestingEngineKey;

import org.junit.Before;
import org.junit.Test;

import net.sourceforge.jwebunit.junit.JWebUnit;
import net.sourceforge.jwebunit.util.TestingEngineRegistry;


public class JWebUnitTest {
	@Before
	public void prepare() {
		setTestingEngineKey(TestingEngineRegistry.TESTING_ENGINE_HTMLUNIT); 
		setBaseUrl("http://localhost:8080/proj2");
	}

	@Test
	public void testinteger() {
		beginAt("index.jsp"); 
		assertTitleEquals("Login");
		JWebUnit.setTextField("num1", "2");
		JWebUnit.setTextField("num2", "3");
		JWebUnit.clickButton("but");
		JWebUnit.assertTextFieldEquals("ans", "5");
	}
	
	@Test
	public void testfloat() {
		beginAt("index.jsp"); 
		assertTitleEquals("Login");
		JWebUnit.setTextField("num1", "2.2");
		JWebUnit.setTextField("num2", "3.2");
		JWebUnit.clickButton("but");
		JWebUnit.assertTextFieldEquals("ans", "5.4");
	}
	
	@Test
	public void testnotnumber() {
		beginAt("index.jsp"); 
		assertTitleEquals("Login");
		JWebUnit.setTextField("num1", "m");
		JWebUnit.setTextField("num2", "3");
		JWebUnit.clickButton("but");
		JWebUnit.assertTextFieldEquals("ans", "not a number");
	}
	
	@Test
	public void testonnegative() {
		beginAt("index.jsp"); 
		assertTitleEquals("Login");
		JWebUnit.setTextField("num1", "-5");
		JWebUnit.setTextField("num2", "-3");
		JWebUnit.clickButton("but");
		JWebUnit.assertTextFieldEquals("ans", "-8");
	}
	
	@Test
	public void testnoinput() {
		beginAt("index.jsp"); 
		assertTitleEquals("Login");
		JWebUnit.setTextField("num1", "");
		JWebUnit.setTextField("num2", "");
		JWebUnit.clickButton("but");
		JWebUnit.assertTextFieldEquals("ans", "input required");
	}
	
	
	
	
}