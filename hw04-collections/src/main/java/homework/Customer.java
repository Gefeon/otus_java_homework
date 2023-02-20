package homework;

import java.util.Comparator;

public class Customer {
    private final long id;
    private String name;
    private long scores;

    public Customer(long id, String name, long scores) {
        this.id = id;
        this.name = name;
        this.scores = scores;
    }

    public Customer copy() {
        return new Customer(this.id, this.name, this.scores);
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getScores() {
        return scores;
    }

    public void setScores(long scores) {
        this.scores = scores;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", scores=" + scores +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (this.getClass() != o.getClass()) {
            return false;
        }
        Customer other = (Customer) o;
        return this.id == other.id;
    }

    @Override
    public int hashCode() {
        final int temp = 14;
        int ans = 1;
        ans = (int) (temp * ans + id);
        return ans;
    }

    static class ScoresComparator implements Comparator<Customer> {

        @Override
        public int compare(Customer c1, Customer c2) {
            return (int) (c1.scores - c2.scores);
        }
    }

}
