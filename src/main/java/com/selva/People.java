package com.selva;

import java.util.Date;

public class People
{

  private String firstName;
  private String lastName;
  private String dateofbirth;
  private String country;
  private String city;
  private String sex;

  public People(String firstName,
                String lastName,
                String dateofbirth,
                String country,
                String city,
                String sex) {
    this.firstName= firstName;
    this.lastName=lastName;
    this.dateofbirth=dateofbirth;
    this.country=country;
    this.city=city;
    this.sex=sex;
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

  public String getDateofbirth() {
    return dateofbirth;
  }

  public void setDateofbirth(String dateofbirth) {
    this.dateofbirth = dateofbirth;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getSex() {
    return sex;
  }

  public void setSex(String sex) {
    this.sex = sex;
  }

  @Override
  public String toString() {
    return super.toString();
  }
}
