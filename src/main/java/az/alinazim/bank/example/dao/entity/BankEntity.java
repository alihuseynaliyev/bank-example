package az.alinazim.bank.example.dao.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static javax.persistence.CascadeType.PERSIST;

@Entity
@Table(name = "banks")
@Getter
@Setter
@EqualsAndHashCode(exclude = "customers")
@ToString(exclude = "customers")
public class BankEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToMany(cascade = PERSIST)
    @JoinColumn(name = "bank_id")
    private Set<CustomerEntity> customers = new HashSet<>();
}

