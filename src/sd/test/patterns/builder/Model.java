package sd.test.patterns.builder;

import java.util.Date;
import java.util.StringJoiner;

public class Model {
    private String name;
    private int id;
    private char section;
    private double salary;
    private String address;
    private Date dateOfBirth;

    private Model(Builder builder) {
        this.name = builder.name;
        this.id = builder.id;
        this.section = builder.section;
        this.salary = builder.salary;
        this.address = builder.address;
        this.dateOfBirth = builder.dateOfBirth;
    }

    public static Builder getBuilder() {
        return new Builder();
    }

    public static class Builder {
        private String name;
        private int id;
        private char section;
        private double salary;
        private String address;
        private Date dateOfBirth;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder setSection(char section) {
            this.section = section;
            return this;
        }

        public Builder setSalary(double salary) {
            this.salary = salary;
            return this;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Builder setDateOfBirth(Date dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
            return this;
        }

        public Model build() {
            return new Model(this);
        }
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Model.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'")
                .add("id=" + id)
                .add("section=" + section)
                .add("salary=" + salary)
                .add("address='" + address + "'")
                .add("dateOfBirth=" + dateOfBirth)
                .toString();
    }
}
