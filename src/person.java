public class person {
    protected int Id;
    protected String Name;
    protected int age;
    protected int telephone;
    protected String address;

    public person()
    {

    }
    public person(int id,String name,int age,int telephone,String address)
    {
        this.address=address;
        this.age=age;
        this.Id=id;
        this.Name=name;
        this.telephone=telephone;

    }
    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public String toString()
    {
        return " Name ["+Name+"] Id ["+Id+"] age ["+age+"] telephone ["+telephone+"] address ["+address+" ]";
    }
}
