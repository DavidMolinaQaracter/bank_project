package services;

import entities.*;
import exceptions.*;
import services.*;

import java.util.HashMap;
import java.util.Map;

public class AuthService {
    //<username, User(Customer + Password)>
    private HashMap<String, Customer> customers;

    //
    public Customer login(String username, String password) throws AuthenticationFailedException{
        Customer result = null;
        if (customers.containsKey(username)) {
            Customer customer = customers.get(username);
            if (customer.getPassword().equals(password)) {
                result = customer;
            }
        }
        if (result == null) {
            throw new AuthenticationFailedException();
        }
        return result;
    }

    public Customer register(String firstName, String lastName, String username, String email, String password)
            throws DuplicateAccountException {
        if (customers.containsKey(username)) {
            throw new DuplicateAccountException();
        }
        Customer customer = new Customer(firstName, lastName, email, password);
        customers.put(username, customer);
        return customer;
    }

    public Map<String, Customer> getCustomers() {
        return new HashMap<>(customers);
    }

}
