package giannibussoletti.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.UUID;

@Entity
public class User {

    @Id
    @GeneratedValue
    private UUID id;
    private String name;
    private String surname;


    public User() {
    }

    public User(String name, String surname) {
    }
}
