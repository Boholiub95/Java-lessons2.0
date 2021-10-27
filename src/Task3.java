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
