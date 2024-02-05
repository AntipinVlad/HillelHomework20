import Modules.User;

public class Homework20Program {
    public static void main(String[] args) {
        User user1 = new User("Name1", (byte) 1, "month1", 1991, "email1@gmail.com", "+380111111111", "Surname1", (short) 81, "121/81", 30001);
        user1.printAccountInfo();
        User user2 = new User("Name2", (byte) 2, "month2", 1992, "email2@gmail.com", "+380222222222", "Surname2", (short) 82, "122/82", 30002);
        user2.printAccountInfo();
        User user3 = new User("Name3", (byte) 3, "month3", 1993, "email3@gmail.com", "+380333333333", "Surname3", (short) 83, "123/83", 30003);
        user3.printAccountInfo();

        user2.setSurname("Surname88");
        user2.setWeight((short) 78);
        user2.setPressure("128/88");
        user2.setSteps(20000);

        user3.setSurname("Surname99");
        user3.setSteps(99999);

        System.out.println("Data after changes: -----------------");
        System.out.println();

        user2.printAccountInfo();
        user3.printAccountInfo();
    }
}
