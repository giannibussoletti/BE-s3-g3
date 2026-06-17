package giannibussoletti.entities;

import jakarta.persistence.*;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue
    private UUID id;
    private String name;
    private String surname;

    // OneToMany bidirezionale
    @OneToMany(mappedBy = "author")
    private List<Blogs> blogs;

    public User() {
    }

    public User(String name, String surname) {
    }

    public List<Blogs> getBlogs() {
        return blogs;
    }
}
