package az.alinazim.bank.example.dao.repository;

import az.alinazim.bank.example.dao.entity.AccountEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<AccountEntity, Long> {
}
