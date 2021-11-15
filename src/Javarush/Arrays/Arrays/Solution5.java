package Javarush.Arrays.Arrays;
/*Before you, the Signin () method, which welcomes the users of the site. Now he welcomes all users, and only registered. The names of all unregistered users - "User".
Add user name check to the beginning of the Signin () method.
If the name "user", interrupt the execution of the method using the RETURN keyword.*/

public class Solution5 {
        public static void main(String[] args) {
        }

        public static void signIn(String username){
            if (username.equals("user")){
                return;
            }
            System.out.println("Добро пожаловать " + username);
            System.out.println("Очень скучали по Вам, " + username);
        }
    }

