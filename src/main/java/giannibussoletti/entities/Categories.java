package giannibussoletti.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.UUID;

@Entity
@Table(name = "categories")
public class Categories {
    @Id
    @GeneratedValue
    private UUID id;
    private String name;


}
