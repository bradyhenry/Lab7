import static org.junit.Assert.*;

import java.util.NoSuchElementException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ArrayListAddressBookTest {
	private AddressBook dir;
	private AddressBook deptDir;
	

	@Test(expected=NoSuchElementException.class)
	public void RemoveTester() {
		dir.put("Horstmann", "Phone", "2");
		dir.remove("Horstmann", "Phone");
		assertNull(dir.get("Horstmann", "Phone"));
	}
	
	@Test(expected=NoSuchElementException.class)
	public void RemoveTester2() {
		assertNull(dir.remove("Me", "Phone"));
	}	

	@Test(expected=NoSuchElementException.class)
	public void RemoveTester3() {
		dir.put("Bob", "Phone", "2");
		assertNull(dir.remove("Me", "Phone"));
	}
	
	@Test
	public void deptDirContainsHorstmann() 
	{
	   assertNotNull(deptDir.get("Horstmann", "Phone"));
	}

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void foo() throws Exception {
		deptDir = new ArrayListAddressBook();
		deptDir.load("deptdir.txt");
		dir = new ArrayListAddressBook();
	}

	@After
	public void tearDown() throws Exception {
	}

}
