public class User {
    protected String ID;
    protected String Password;
    protected String Email;
    protected String FirstName;
    protected String LastName;
    protected int TelPhone;

    User(String ID , String Password , String Email , String FirstName , String LastName , int TelPhone){
        this.ID = ID;
        this.Password = Password;
        this.Email = Email;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.TelPhone = TelPhone;
    }
}
