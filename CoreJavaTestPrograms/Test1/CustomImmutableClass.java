package Test1;

class Designation {
    public int roleId;
    public String role;

    Designation(int roleId, String role) {
        this.roleId = roleId;
        this.role = role;
    }

    @Override
    public String toString() {
        return "Designation{" +
                "roleId=" + roleId +
                ", role='" + role + '\'' +
                '}';
    }
}

public final class CustomImmutableClass implements Cloneable{
    private final int id;
    private final String name;
    private final Designation designation;

    public CustomImmutableClass(int id, String name, Designation newData) {
        this.id = id;
        this.name = name;
        Designation temp = new Designation(newData.roleId, newData.role);
        this.designation = temp;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

//    public Designation getDesignation(){
//        return (Designation) designation.clone();
//    }

    @Override
    public String toString() {
        return "CustomImmutableClass{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", designation=" + designation +
                '}';
    }

    public static void main(String[] args) {
        int id = 101;
        String name = "Martin";
        String role = "Software Engineer";
        Designation designation = new Designation(1011, "Software Engineer");
        CustomImmutableClass obj1 = new CustomImmutableClass(id, name, designation);
        System.out.println(obj1);
       // System.out.println(obj1.getDesignation());
        obj1.designation.roleId = 2022;
        obj1.designation.role = "System Engineer";
       // System.out.println(obj1.getDesignation());
    }
}
