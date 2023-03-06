public class Phonemain {
    private static String name = "Artem";

    public static void main(String[] args) {
        Phone phone1 = new Phone(1, "Samsung", 30.3);
        Phone phone2 = new Phone(2, "Huawei", 100.8);
        Phone phone3 = new Phone(3, "Oppo", 70.2);

        System.out.println(phone1.toString());
        System.out.println(phone2.toString());
        System.out.println(phone3.toString());


        phone1.receiveCall(name, phone1.getNumber());


        phone1.getNumber();
    }
}
