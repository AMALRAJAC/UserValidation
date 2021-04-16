
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class userValidationRegistration {

    public static boolean checkValue(String regex,String name){
        boolean valid=false;
        for(int i = 0; true; i++) {

            Pattern p = Pattern.compile(regex);
            Matcher m = p.matcher(name);
            valid= m.matches();
            if (valid) {
                return true;
            }else {
               return false;
            }
        }
    }
    public static boolean password_check(String name){
        boolean valid=false;
        for(int i = 0; true; i++) {

            if (name.length() > 8) {
                System.out.println("password length >8");
                if (name.matches(".*[a-z].*")) {
                    System.out.println("password contain at least one lowercase  character");
                    if (name.matches(".*[A-Z].*")) {
                        System.out.println("password contain at least one uppercase  character");
                        if (name.matches(".*[0-9].*")) {
                            System.out.println("password contain at least one numerical character");
                            if (name.matches(".*[*.!@#$%^&(){}:;'<>,?/~`_+=|].*")) {
                                Pattern p = Pattern.compile("[*.!@#$%^&(){}:;'<>,?/~`_+=|]");
                                Matcher m = p.matcher(name);
                                int count = 0;
                                while (m.find()) {
                                    count++;
                                    System.out.println(count);
                                }
                                if (count == 1) {
                                    System.out.println("password contain exact one special character");
                                    return true;
                                } else {
                                    return false;
                                }
                            }else{
                                return false;
                            }
                        }else{
                            return false;
                        }
                    }else{
                        return false;
                    }
                }else{
                    return false;
                }
            }else{
                return false;
            }

        }
    }
}
