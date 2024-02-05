package Modules;

public class User {
    private String name;
    private byte day;
    private String months;
    private int year;
    private String email;
    private String mobNumber;
    private String surname;
    private short weight;
    private String pressure;
    private int steps;
    private int age;

    public User(String name, byte day, String months, int year, String email, String mobNumber, String surname, short weight, String pressure, int steps) {
        this.name = name;
        this.day = day;
        this.months = months;
        this.year = year;
        this.email = email;
        this.mobNumber = mobNumber;
        this.surname = surname;
        this.weight = weight;
        this.pressure = pressure;
        this.steps = steps;
        this.age = 2020 - year;
    }

    public String getName() {
        return name;
    }

    public byte getDay() {
        return day;
    }

    public String getMonths() {
        return months;
    }

    public int getYear() {
        return year;
    }

    public String getEmail() {
        return email;
    }

    public String getMobNumber() {
        return mobNumber;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public short getWeight() {
        return weight;
    }

    public void setWeight(short weight) {
        this.weight = weight;
    }

    public String getPressure() {
        return pressure;
    }

    public void setPressure(String pressure) {
        this.pressure = pressure;
    }

    public int getSteps() {
        return steps;
    }

    public void setSteps(int steps) {
        this.steps = steps;
    }

    public int getAge() {
        return age;
    }

    public void printAccountInfo() {
        System.out.println(
                        "name='" + name + '\n' +
                        "day=" + day + '\n' +
                        "months='" + months + '\n' +
                        "year=" + year + '\n' +
                        "email='" + email + '\n' +
                        "mobNumber='" + mobNumber + '\n' +
                        "surname='" + surname + '\n' +
                        "weight=" + weight + '\n' +
                        "pressure=" + pressure + '\n' +
                        "steps=" + steps + '\n' +
                        "age=" + age + '\n'
        );
    }
}
