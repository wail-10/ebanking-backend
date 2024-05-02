package ma.enset.ebankingbackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ma.enset.ebankingbackend.entities.BankAccount;

public interface BankAccountRepository extends JpaRepository<BankAccount, String> {
}
