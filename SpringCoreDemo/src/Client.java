public class Client {

    public static void main(String[] args) {
        // Object Construction

        Employee eRef = new Employee();
        eRef.setEid(101);
        eRef.setEname("John Watson");
        eRef.setEaddress("Redwood Shores");

        System.out.println("Employee Details: " + eRef);
    }
}
