public class Man extends Person {


    public Man(String firsName, String lastName, int age, Person anotherPartner) {
        super(firsName, lastName, age, anotherPartner);
    }

    @Override
    public boolean isRetired() {
        if (getAge() > 65) {
            return true;
        }
        else return false;
    }

    @Override
    public void deregisterPartnership(boolean returnChildSurname) {
       setPartner(null);
    }


}
