package giannibussoletti.entities;

import jakarta.persistence.*;

import java.util.List;
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

    @ManyToMany // Questa annotazione creerà una tabella di mezzo fra Blogs and Categories che verrà poi
    // personalizzata con la @JoinTable
    @JoinTable(name = "blogs_categories", joinColumns = @JoinColumn(name = "blog_id"), inverseJoinColumns = @JoinColumn(name = "category_id"))
    // Join Table non è obbligatoria ma consigliata perché permette di personalizzare
    // le caratteristiche della JunctionTable;
    private List<Categories> categories;


    public Blogs() {
    }

    public Blogs(String title, String content, User author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public List<Categories> getCategories() {
        return categories;
    }

    public void setCategories(List<Categories> categories) {
        this.categories = categories;
    }

    public User getAuthor() {
        return author;
    }


    public String getTitle() {
        return title;
    }

    public UUID getId() {
        return id;
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
