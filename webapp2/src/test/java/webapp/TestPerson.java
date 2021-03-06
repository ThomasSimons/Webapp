package webapp;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import com.realdolmen.jsp.model.Person;

public class TestPerson {

	@Test
	public void testName() {
		Person p = new Person("thomas");
		String expected= "Person [name=thomas]";
		Assert.assertNotNull(p.getName());
		Assert.assertEquals("thomas", p.getName());
		Assert.assertTrue(expected.equals(p.toString()));
	}
	
	@Test
	public void testGender() {
		Person p = new Person("thomas","M");
		String expected= "M";	
		Assert.assertTrue(expected.equals(p.getGender()));
	}
		
	@Test
	public void testEmptyConstructor() {
		Person p = new Person();
		String expected= "Person [name=default]";
		Assert.assertTrue(expected.equals(p.toString()));
	}

}
