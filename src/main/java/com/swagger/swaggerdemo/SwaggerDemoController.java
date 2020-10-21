package com.swagger.swaggerdemo;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class SwaggerDemoController {

    List<Customer>  customerList = new ArrayList<>(Arrays.asList(
            new Customer(1, "Customer1", "Name1", "789091"),
            new Customer(2, "Customer2", "Name2", "789092"),
            new Customer(3, "Customer3", "Name3", "789093"),
            new Customer(4, "Customer4", "Name4", "789094")
            ));

    @ApiOperation(value = "Find All the Customer details", notes = "Test in UI", response = Customer.class)
    @RequestMapping(method = RequestMethod.GET, value = "/customer")
    public List<Customer> getCustomer(){
         return customerList;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/customer/{customerId}")
    public Customer getCustomer(@PathVariable("customerId") int customerId){
         return customerList.stream()
                            .filter(c -> c.getCustomerId() == customerId)
                            .findFirst().get();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/customer")
    public void insert(@RequestBody Customer customer){
        customerList.add(customer);
    }


    @RequestMapping(method = RequestMethod.DELETE, value = "/customer/{customerId}")
    public void delete(@PathVariable("customerId") int customerId){
        customerList.removeIf(c -> c.getCustomerId() ==  customerId);
    }
}
