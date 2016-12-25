package customer.dao;

import customer.model.jpa.Customer;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Filip Burlaga on 2016-12-25.
 */
public interface CustomerRepository extends CrudRepository<Customer, Long> {
}
