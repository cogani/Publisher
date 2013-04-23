import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class UserTest {
	IUsers users;
	
	@Before
	public void setup(){
		users  = new Users();
	}

	@Test
	public void validateNotEmptyUserAsValidUser() {

		IUser validUser = new User();
		assertEquals(true, users.validate(validUser));
	}
	
	@Test
	public void emptyUserIsNotValidUser() {
		IUser nullUser = null;
		assertEquals(false, users.validate(nullUser));
	}

}
