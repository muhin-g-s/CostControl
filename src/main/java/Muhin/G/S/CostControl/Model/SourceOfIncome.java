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
@Table(name = "sources_of_incomes")
public class SourceOfIncome {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    User user;

    @Column(nullable = false, length = 20)
    String name;

    @Column(name = "type", nullable = false)
    @Enumerated(EnumType.STRING)
    SourceOfIncomeType sourceOfIncomeType;

    @Column(nullable = false)
    Long balance;
}
