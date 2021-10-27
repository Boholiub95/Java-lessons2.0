public  class Task3 {
    public class RoleOldStyleMain {
        public static void main(String[] args) {
            int role = 1;
            switch (role){
                case 0:
                    System.out.println("guest can only watch");
                case 1:
                    System.out.println("client can place orders");
                case 2:
                    System.out.println("moderator can manage his section");
                case 3:
                    System.out.println("admin controls everything");
            }
        }
    }
}
/*
public enum Role {
 GUEST, CLIENT, MODERATOR, ADMIN
}

public class RoleMain {
 public static void main(String[] args) {
 Role role = Role.valueOf("Admin".toUpperCase());
 switch (role){
 case GUEST:
 System.out.println(role + " can only watch");
 case CLIENT:
 System.out.println(role + " can place orders");
 case MODERATOR:
 System.out.println(role + " can manage his section");
JAVA FROM EPAM
98
 case ADMIN:
 System.out.println(role + " controls everything");
 }
 }
}
 */

