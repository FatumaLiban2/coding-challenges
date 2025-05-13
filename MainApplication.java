
interface DataSource {
    void execute();
}


class Update implements DataSource {
    @Override
    public void execute() {
        System.out.println("Data has been updated successfully!");
    }
}


class View implements DataSource {
    @Override
    public void execute() {
        System.out.println("Some data to be displayed.");
    }
}


class Delete implements DataSource {
    @Override
    public void execute() {
        System.out.println("Data has been deleted.");
    }
}


abstract class Account {
    protected int id;
    protected String name;
    private DataSource myData;

    public void performOperation(DataSource _myData) {
        myData = _myData;
        myData.execute();
    }
}


class Admin extends Account {
    private String authPassword;

    public Admin(int _id, String _name, String _password) {
        this.id = _id;
        this.name = _name;
        this.authPassword = _password;
    }
}


class User extends Account {
    public User(int _id, String _name) {
        this.id = _id;
        this.name = _name;
    }
}


public class MainApplication {
    public static void main(String[] args) {
        Admin mainAdmin = new Admin(1010, "Kevin", "p@ssW0rd!");
        User guestUser = new User(2020, "Lucy");

        // Admin performing an update
        mainAdmin.performOperation(new Update());

        // User performing a view
        guestUser.performOperation(new View());

        // Admin performing a delete (optional)
        mainAdmin.performOperation(new Delete());
    }
}

