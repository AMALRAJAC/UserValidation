
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class userValidationRegistration {

    public static boolean checkValue(String regex, String name) {
        boolean valid = false;
        try {
            for (int i = 0; true; i++) {
                if (name.matches(regex)) {
                    return true;
                } else {
                    throw new userRegistrationException("invalid user entry");
                }
            }
        } catch (Exception ex) {
            System.out.println("exception occurred: " + ex);
        }
        return true;
    }



    public static boolean password_check(String name) throws userRegistrationException {
        boolean valid = false;
        try {
            for (int i = 0; true; i++) {

                if (name.length() > 8) {
                    if (name.matches(".*[a-z].*")) {
                        if (name.matches(".*[A-Z].*")) {
                            if (name.matches(".*[0-9].*")) {
                                if (name.matches(".*[*.!@#$%^&(){}:;'<>,?/~`_+=|].*")) {
                                    Pattern p = Pattern.compile("[*.!@#$%^&(){}:;'<>,?/~`_+=|]");
                                    Matcher m = p.matcher(name);
                                    int count = 0;
                                    while (m.find()) {
                                        count++;
                                    }
                                    if (count == 1) {
                                        return true;
                                    } else {
                                        throw new userRegistrationException("invalid user entry");
                                    }
                                } else {
                                    throw new userRegistrationException("invalid user entry");
                                }
                            } else {
                                throw new userRegistrationException("invalid user entry");
                            }
                        } else {
                            throw new userRegistrationException("invalid user entry");
                        }
                    } else {
                        throw new userRegistrationException("invalid user entry");
                    }
                } else {
                    throw new userRegistrationException("invalid user entry");
                }

            }
        } catch (Exception ex) {
            System.out.println("exception occurred: " + ex);
        }

        return true;
    }

}
