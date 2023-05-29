public class Women extends Person {

    private String oldLastName;


    public Women(String firsName, String lastName, int age, Person partner) {
        super(firsName, lastName, age, partner);

        this.oldLastName = lastName;
        if (partner != null) {
            setLastName(partner.getLastName());
        }

    }


    @Override
    public boolean isRetired() {
        if (getAge() > 60) {
            return true;
        } else return false;

    }

    @Override
    public void deregisterPartnership(boolean returnChildSurname) {
        setPartner(null);
        if (returnChildSurname == true) {
            setLastName(oldLastName);
        }

    }

    @Override
    public void registerPartnership(Person partner) {
        super.registerPartnership(partner);
        setLastName(partner.getLastName());
    }
}
