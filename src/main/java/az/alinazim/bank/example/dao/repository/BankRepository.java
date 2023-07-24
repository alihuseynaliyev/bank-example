package az.alinazim.bank.example.dao.repository;

import az.alinazim.bank.example.dao.entity.BankEntity;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BankRepository extends JpaRepository<BankEntity, Long> {
    @EntityGraph(attributePaths = {"customers", "customers.accounts"})
    List<BankEntity> findAll();
}
