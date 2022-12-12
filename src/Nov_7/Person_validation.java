package Nov_7;

import java.util.regex.*;
public class Person_validation implements Validation{
    public boolean nameValidator(String name){
        String regex = "^[A-Za-z]\\w{5,29}$";
        Pattern p = Pattern.compile(regex);

        if(name == null){
            return false;
        }
        Matcher m = p.matcher(name);
        return m.matches();
    }

    public boolean ageValidator(int age){
        return age >= 18 && age <= 60;
    }
    public  boolean heightValidator(Double height){
        return height >= 5.11 && height <= 6.5;
    }
}
