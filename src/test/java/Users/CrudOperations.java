package Users;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

//comment added
public class CrudOperations {
  @Test (priority = 1)
  public void ExecuteUser() {
	  System.out.println("User is Executed");
  }
  
  @Test (priority = 2)
  public void ExecuteUpdatedUser() {
	  System.out.println("Updated User is Executed");
  }
  
  @Test (priority = 3)
  public void ExecuteDeleteUser() {
	  System.out.println("Deleted User is Executed");
  }
}
