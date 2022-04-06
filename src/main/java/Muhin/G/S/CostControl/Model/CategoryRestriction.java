package Muhin.G.S.CostControl.Model;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)

@Entity
@Table(name = "categories_restrictions")
public class CategoryRestriction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    User users;

    @ManyToOne
    @JoinColumn(name = "category_id")
    Category categories;

    @Column(nullable = false)
    Long scope;
}
