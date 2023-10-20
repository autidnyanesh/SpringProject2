package com.example.Assignment.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "VaccinatedPeope")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String idDetails;
    private String idType;
    private String name;
    private String contact;
    private String vaccineName;
    
    public User(){

    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getIdDetails() {
        return idDetails;
    }
    public void setIdDetails(String idDetails) {
        this.idDetails = idDetails;
    }
    public String getIdType() {
        return idType;
    }
    public void setIdType(String idType) {
        this.idType = idType;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getContact() {
        return contact;
    }
    public void setContact(String contact) {
        this.contact = contact;
    }
    public String getVaccineName() {
        return vaccineName;
    }
    public void setVaccineName(String vaccineName) {
        this.vaccineName = vaccineName;
    }
    @Override
    public String toString() {
        return "index [id=" + id + ", idDetails=" + idDetails + ", idType=" + idType + ", name=" + name + ", contact="
                + contact + ", vaccineName=" + vaccineName + "]";
    }
    
}
