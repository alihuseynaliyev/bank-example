package az.alinazim.bank.example.dao.repository;

import az.alinazim.bank.example.dao.entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<CustomerEntity, Long> {
}
