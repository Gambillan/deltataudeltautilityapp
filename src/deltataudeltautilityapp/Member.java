/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deltataudeltautilityapp;


public class Member {
    private String firstName;
    private String lastName;
    private String position;
    private String year;
    private String major;
    private String email;

    public Member(String firstName, String lastName, String position, String year, String major, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.year = year;
        this.major = major;
        this.email = email;
    }

    public Member() {
        this.firstName = "";
        this.lastName = "";
        this.position = "";
        this.year = "";
        this.major = "";
        this.email = "";
    }

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

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Member{" + "firstName=" + firstName + ", lastName=" + lastName + ", position=" + position + ", year=" + year + ", major=" + major + ", email=" + email + '}';
    }
    
    
    
    
}
