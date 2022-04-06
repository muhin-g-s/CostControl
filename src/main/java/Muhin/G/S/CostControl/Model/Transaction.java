package Muhin.G.S.CostControl.Model;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.sql.Timestamp;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)

@Entity
@Table(name = "transactions")
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    User user;

    @Column(name = "type")
    @Enumerated(EnumType.STRING)
    TransactionType transactionType;

    @Column(nullable = false)
    Timestamp date;

    @Column(nullable = false)
    Long sum;

    @Column(nullable = false)
    Long id_from;

    @Column(nullable = false)
    Long id_to;
}
