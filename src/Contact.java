class Contact {
    private String name;
    private String phone;
    private String email;

    public String getContact() {
        return ("Name: "+name+"\nPhone: "+phone+"\nEmail: "+email);
    }

    public void setContact(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }
}