package az.alinazim.bank.example.dao.entity;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;

import static javax.persistence.GenerationType.IDENTITY;

@Getter
@Setter
@Entity
@Table(name = "accounts")
public class AccountEntity {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;
    private String accountNumber;
    private BigDecimal balance;
}
