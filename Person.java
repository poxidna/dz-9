public abstract class Person {
    private String firsName;
    private String lastName;
    private int age;
    private Person partner;


    public Person(String firsName, String lastName, int age, Person anotherPartner) {
        this.firsName = firsName;
        this.lastName = lastName;
        this.age = age;

        this.partner = anotherPartner;

        if (anotherPartner != null) {
            anotherPartner.setPartner(this);
        }

    }

    public abstract boolean isRetired();

    public void registerPartnership(Person partner) {
        this.partner = partner;
        if (partner != null) {
            partner.setPartner(this);
        }
    }

    public abstract void deregisterPartnership(boolean returnChildSurname);

    public int getAge() {
        return age;
    }


    public void setAge(int age) {
        this.age = age;
    }

    public String getFirsName() {
        return firsName;
    }

    public String getLastName() {
        return lastName;
    }

    public Person getPartner() {
        return partner;
    }

    public void setFirsName(String firsName) {
        this.firsName = firsName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPartner(Person partner) {
        this.partner = partner;
    }
}
