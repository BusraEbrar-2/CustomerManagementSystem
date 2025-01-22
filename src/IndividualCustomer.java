public class IndividualCustomer extends Customer {
    // ind customer is a customer
    // ind customer is an extenımıl customer
    private String firstName;
    private String lastName;

    // bunlar bu kişisel müşteriye özel o yüzden bu şekilde
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}
