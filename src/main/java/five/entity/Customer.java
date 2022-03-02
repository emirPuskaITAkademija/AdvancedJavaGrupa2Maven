package five.entity;

import java.sql.Date;
import java.time.LocalDate;


/**
 * <T>
 * TABELA: customers
 * red 1 -> "Babara" first_name
 * </T>
 * <K>
 * KLASA: Customer
 * objekat 1 -> "Babara" firstName
 * </K>
 */
public class Customer extends AbstractEntity {
    private Integer customerId;
    private String firstName;
    private String lastName;
    private LocalDate birthday;
    private String phone;
    private String address;
    private String city;
    private String state;
    private Integer points;

    @Override
    public Integer getId() {
        return customerId;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public Customer setCustomerId(Integer customerId) {
        this.customerId = customerId;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public Customer setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public Customer setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public Customer setBirthday(Date birthday) {
        LocalDate birthDate = birthday.toLocalDate();
        this.birthday = birthDate;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public Customer setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public Customer setAddress(String address) {
        this.address = address;
        return this;
    }

    public String getCity() {
        return city;
    }

    public Customer setCity(String city) {
        this.city = city;
        return this;
    }

    public String getState() {
        return state;
    }

    public Customer setState(String state) {
        this.state = state;
        return this;
    }

    public Integer getPoints() {
        return points;
    }

    public Customer setPoints(Integer points) {
        this.points = points;
        return this;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthday=" + birthday +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", points=" + points +
                '}';
    }


}
