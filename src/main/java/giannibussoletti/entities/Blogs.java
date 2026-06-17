package giannibussoletti.entities;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "blogs")
public class
Blogs {
    @Id
    @GeneratedValue
    private UUID id;

    private String title;
    private String content;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User author;


    public Blogs() {
    }

    public Blogs(String title, String content, User author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Blogs{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", author=" + author +
                '}';
    }
}
