package homework;


import java.util.Map;
import java.util.TreeMap;

public class CustomerService {

    private final TreeMap<Customer, String> customers = new TreeMap<>(new Customer.ScoresComparator());

    public Map.Entry<Customer, String> getSmallest() {
        var smallestByScore = customers.firstEntry();
        return smallestByScore == null ? null : Map.entry(smallestByScore.getKey().copy(), smallestByScore.getValue());
    }

    public Map.Entry<Customer, String> getNext(Customer customer) {
        var nextEntry = customers.higherEntry(customer);
        return nextEntry == null ? null : Map.entry(nextEntry.getKey().copy(), nextEntry.getValue());
    }

    public void add(Customer customer, String data) {
        customers.put(customer, data);
    }

}
