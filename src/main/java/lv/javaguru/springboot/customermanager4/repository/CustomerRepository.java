package lv.javaguru.springboot.customermanager4.repository;

import lv.javaguru.springboot.customermanager4.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
