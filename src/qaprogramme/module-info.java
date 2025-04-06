module MethodOverloading {

	// Functions having same name but different input parameter
	// Also called as Compile time Polymosphism

	/*
	 * Method Overloading in Java occurs when multiple methods in the same class
	 * have the same name but different parameter lists. This can include variations
	 * in:
	 * 
	 * The number of parameters
	 * 
	 * The type of parameters
	 * 
	 * The order of parameters
	 */

	/* Example- 1
	 * 
	 * For example, overloading the clickElement method can be used to handle
	 * different actions. Examples are listed below:
	 *
1.  Clicking an element with a default timeout.

	  public class WebActions {
	  // Basic click method 
	   public void clickElement(WebElement element) {
	   element.click(); 
	   }
	   
2.  Clicking an element with an explicitly provided timeout.	  

	  // Click with explicit wait
        public void clickElement(WebElement element, int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
       }
       
3.  Clicking an element with additional validation (e.g., checking if the element is visible or enabled).	 

	  // Click with additional validation
    	public void clickElement(WebElement element, int timeout, String validationType) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        if (validationType.equals("visible")) {
            wait.until(ExpectedConditions.visibilityOf(element));
        } else if (validationType.equals("enabled")) {
            wait.until(ExpectedConditions.elementToBeClickable(element));
        }
        element.click();
    
	 */
	/* Example- 2
	 * 
	 * For example, you might want to log
	 * 1. Basic messages
	 * 2. Messages with context (e.g., test name, execution time)
	 * 3. Errors with stack trace details:
	 *
1.  // Overloaded method for logging basic information

	  
      public void log(String message) {
        System.out.println("INFO: " + message);
    }
	   
2.   // Overloaded method for logging with test context	  

	 
    public void log(String message, String testName) {
        System.out.println("INFO: " + testName + " - " + message);
    }
       
3.  // Overloaded method for logging errors with a stack trace	 

	  public void log(String message, Throwable error) {
        System.out.println("ERROR: " + message);
        error.printStackTrace();
    }
    
	 */
	


}