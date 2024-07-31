package repository;

public class CustomerRepositoryImpl implements CustomerRepository {
    @Override
    public Customer findCustomerById(int id) {
        // In a real application, this would interact with a database.
        // For simplicity, we're returning a dummy customer.
        return new Customer(id, "John Doe");
    }
}
