
interface StringFunction {
    boolean run(String str);
}
public class userValidationRegistration {

    public static boolean checkValue(String regex, String name) throws userRegistrationException {
    try {
        StringFunction exclaim = (s) -> s.matches(regex);
        boolean type = printFormatted(name, exclaim);
        if (type == true) {
            return true;
        } else {
            throw new userRegistrationException("invalid entry");
        }
    }catch (Exception ex){
        System.out.println("exception: "+ex);
    }
    return true;

    }
    public static boolean printFormatted(String str, StringFunction format) {
        boolean result = format.run(str);
        return result;
    }
}



