package giannibussoletti.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "documents")
public class Document {
    @Id
    @GeneratedValue
    @Column(name = "document_id")
    private UUID id;
    @Column(name = "issue_date", nullable = false)
    private LocalDate issueDate;
    @Column(name = "expiration_date", nullable = false)
    private LocalDate expirationDate;
    @Column(nullable = false)
    private String code;
    @Column(nullable = false)
    private String country;

    // 1. TO 1. La FK sta da questo lato
    @OneToOne
    @JoinColumn(name = "user_id", nullable = false, unique = true) // Annotazione OPZIONALE
    // ma utile per personalizzare la colonna FK
    private User user; // Automaticamente creerà una colonna FK di tipo UUID


    public Document(String code, String country, User user) {
        this.code = code;
        this.country = country;
        this.user = user;
        this.issueDate = LocalDate.now();
        this.issueDate = LocalDate.now().plusYears(10);
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public String getCode() {
        return code;
    }

    public String getCountry() {
        return country;
    }

    public UUID getId() {
        return id;
    }

    public LocalDate getIssueDate() {
        return issueDate;
    }

    public User getUser() {
        return user;
    }

    @Override
    public String toString() {
        return "Document{" +
                "id=" + id +
                ", issueDate=" + issueDate +
                ", expirationDate=" + expirationDate +
                ", code='" + code + '\'' +
                ", country='" + country + '\'' +
                ", user=" + user +
                '}';
    }
}

