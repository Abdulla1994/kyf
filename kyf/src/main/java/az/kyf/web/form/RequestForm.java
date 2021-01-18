package az.kyf.web.form;

public class RequestForm {
    private String name;
    private String surname;
    private String region;
    private String phone;// todo list
    private String status;//todo radiobutton
    private String address;
    private String needs;
    private String note;
    private String contactPerson;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNeeds() {
        return needs;
    }

    public void setNeeds(String needs) {
        this.needs = needs;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
    }

    @Override
    public String toString() {
        return "RequestForm{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", region='" + region + '\'' +
                ", phone='" + phone + '\'' +
                ", status='" + status + '\'' +
                ", address='" + address + '\'' +
                ", needs='" + needs + '\'' +
                ", note='" + note + '\'' +
                ", contactPerson='" + contactPerson + '\'' +
                '}';
    }
}
