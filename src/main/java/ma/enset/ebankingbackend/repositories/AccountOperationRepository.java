package ma.enset.ebankingbackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ma.enset.ebankingbackend.entities.AccountOperation;

public interface AccountOperationRepository extends JpaRepository<AccountOperation, Long> {
}
