/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author boul3
 */
public abstract class Person {
    private String nom;
    private int age;
    private String phonenumber;
    private String email;
    private List<Role> roles;
    

    // Constructeur
    public Person(String nom, int age,String phonenumber,String email,List<Role> r) {
        this.nom = nom;
        this.age = age;
        this.email=email;
        this.phonenumber=phonenumber;
        this.roles=r;
    }

    private static class list<T> {

        public list() {
        }
    }
    // Méthode abstraite à implémenter par les sous-classes
    public abstract void {
    
    
}

    public <Role> showroles{
       return roles;
}
    
    
    
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
        








