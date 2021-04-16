
import org.junit.Assert;
import org.junit.Test;

public class userRegistrationTest {
    @Test
    public void checkFirstName(){
        userValidationRegistration userValidation= new userValidationRegistration();
        String regex="^[A-Z][a-z]{2,10}$";
        String firstName="Amal";
        boolean valid = userValidation.checkValue(regex, firstName);
        Assert.assertEquals(true,valid);
    }
    @Test
    public void checkSecondName(){
        userValidationRegistration userValidation= new userValidationRegistration();
        String regex="^[A-Z][a-z]{2,10}$";
        String secondName="Raj";
        boolean valid=userValidation.checkValue(regex,secondName);
        Assert.assertEquals(true,valid);
    }
    @Test
    public void checkEmail(){
       userValidationRegistration userValidation= new userValidationRegistration();
       String regex = "^abc.[A-Za-z0-9]+@bl.co[A-Za-z0-9.]$";
       String emailId="abc.xyz@bl.com";
       boolean valid=userValidation.checkValue(regex,emailId);
       Assert.assertEquals(true,valid);
    }
    @Test
    public void checkContactNumber(){
        userValidationRegistration userValidation= new userValidationRegistration();
        String regex = "^([0-9]{2}){1}+\s[0-9]{10}$";
        String phone="91 1234567890";
        boolean valid=userValidation.checkValue(regex,phone);
        Assert.assertEquals(true,valid);
    }
    @Test
   public void checkPassword(){
        userValidationRegistration userValidation= new userValidationRegistration();
        String password="Aaaaa@1234";
        boolean valid=userValidation.password_check(password);
        Assert.assertEquals(true,valid);
    }
}
