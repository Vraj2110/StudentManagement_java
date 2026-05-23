public abstract class Person {
    private String name;
    private int age;
    private String email;

    public Person(String name,int age, String email){
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public abstract void displayInfo();

    public String getName() {return name;}
    public int getAge() {return age;}
    public String getEmail() {return email;}

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()){
            System.out.println("Name can't be empty");
            return;
        }
        this.name = name;
    }

    public void setAge(int age) {
        if (age<1 || age>100){
            System.out.println("Invalid age" + age);
        }
        this.age = age;
    }

    public void setEmail(String email) {
        if (!email.contains("@")){
            System.out.println("invalid email format");
            return;
        }
        this.email = email;
    }
}
