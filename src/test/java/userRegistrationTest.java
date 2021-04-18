
import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.Assert;
import org.junit.Before;

import org.junit.runners.Parameterized;
import org.junit.runner.RunWith;
import static org.junit.Assert.assertEquals;
@RunWith(Parameterized.class)
public class userRegistrationTest {

    private String email;
    private Boolean result;
    private userValidationRegistration userValidationRegistration;

    @Before
    public void initialize(){
        userValidationRegistration =new userValidationRegistration();
    }
    public userRegistrationTest(boolean result, String email){
        this.email = email;
        this.result = result;
    }
    @Parameterized.Parameters
    public static Collection primeNumbers() {
        return Arrays.asList(new Object[][] {
                { true,"abc.xyz@bl.com" },
                {true,"amal@gmail.com"},
                {true,"abc.123@bl.com"}
        });
    }
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
       String regex = "^abc[A-Za-z0-9.]+@bl.co[A-Za-z0-9.]$";
        System.out.println("Parameterized Number is : " + email);
        assertEquals(result, userValidationRegistration.checkValue(regex,email));
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
   public void checkPassword() throws userRegistrationException {
        userValidationRegistration userValidation= new userValidationRegistration();
        String password="Amal@123456";
        boolean valid=userValidation.password_check(password);
        Assert.assertEquals(true,valid);
    }
}
