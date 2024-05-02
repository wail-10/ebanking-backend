package ma.enset.ebankingbackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ma.enset.ebankingbackend.entities.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
