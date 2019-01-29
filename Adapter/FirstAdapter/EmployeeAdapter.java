package Adapter.FirstAdapter;

public class EmployeeAdapter extends Employee {
    private AdapteeEmployee instance;
    public EmployeeAdapter(AdapteeEmployee employee2) {
        instance = employee2;
    }

    @Override
    public int getId() {
        return instance.getIdentity();
    }

    @Override
    public String getFirstName() {
        return instance.getNom();
    }

    @Override
    public String getLastName() {
        return instance.getPrenom();
    }

    @Override
    public String getEmail() {
        return instance.getMail();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
