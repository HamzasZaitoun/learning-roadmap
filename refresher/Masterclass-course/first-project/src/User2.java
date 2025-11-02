public class User2 {
    private Long id;
    private String name;
    private String email;
    private String mobile;
    private String[] address;

    public User2(String name, String email, String mobile, String[] address) {

        this.name = name;
        this.email = email;
        this.mobile = mobile;
        this.address = address;
    }



    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setAddress(String[] address) {
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getMobile() {
        return mobile;
    }

    public String[] getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
