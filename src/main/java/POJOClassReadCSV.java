import com.opencsv.bean.CsvBindByName;

public class POJOClassReadCSV {

    @CsvBindByName
    private String name;

    @CsvBindByName
    private String email;

    @CsvBindByName
    private String phoneNo;

    @CsvBindByName
    private String country;

    @Override
    public String toString(){
        return "CSVUser{" +
                "name='" + name + '\''+
                ",email='" + email + '\'' +
                "phoneNo='" + phoneNo + '\'' +
                "country='" + country + '\'' +
                "}";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
