package BuilderDesignPattern;

public class User {

    private String username;
    private String password;
    private int age;
    private String gender;
    private String address;
    private String contactInfo;

    public User(Builder builder) {

        this.username = builder.username;
        this.password = builder.password;
        this.age = builder.age;
        this.gender = builder.gender;
        this.address = builder.address;
        this.contactInfo = builder.contactInfo;

    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private String username;
        private String password;
        private int age;
        private String gender;
        private String address;
        private String contactInfo;

        public Builder setUsername(String username) {
            this.username = username;
            return this;
        }

        public Builder setPassword(String password) {
            this.password = password;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setGender(String gender) {
            this.gender = gender;
            return this;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Builder setContactInfo(String contactInfo) {
            this.contactInfo = contactInfo;
            return this;
        }

        public User build() {
            return new User(this);
        }

    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getAddress() {
        return address;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public String toString() {
        return "Username : " + getUsername() + " Password : " + getPassword() + " Age : " + getAge() + " Gender : " + getGender() + " Address : " + getAddress() + " Contact Info : " + getContactInfo();
    }
}
