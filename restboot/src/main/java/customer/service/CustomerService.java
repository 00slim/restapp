package customer.service;

import customer.dao.CustomerRepository;
import customer.model.jpa.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;
import java.util.List;

/**
 * Created by Filip Burlaga on 2016-12-24.
 */
@RestController
@RequestMapping("/customers")
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @RequestMapping(value = "/", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<Customer> findAll(){
        return (List<Customer>) customerRepository.findAll();
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public ResponseEntity<Void> createCustomer(@RequestParam(name = "name") String name){
//        Customer customer = Customer.builder().name("Slim Soft").build();
        Customer customer = new Customer();
        customer.setName("Slim Soft");
        customerRepository.save(customer);

        return ResponseEntity.created(URI.create("www.onet.pl")).build();
    }

    @RequestMapping(value = "/string", method = RequestMethod.GET, produces = MediaType.APPLICATION_XML_VALUE)
    public String getString(){
        return "test xml";
    }

}
