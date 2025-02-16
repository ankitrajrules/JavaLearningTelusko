class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    //// If we wqnt to set the value of name, we can use the below methods.
    //// But this is not a good practice as we are directly accessing the instance variable.
    ///  and its unclear whether we are accessing the instance variable or the parameter.
    ///  or we just using the local variable only.
    // public void setName(String name) {    
    //     name = name;
    // }

    public void setNameUsingObj(String name, Person obj) {    
        obj.name = name;
    }
    
    public void setAgeUsingObj(int age, Person obj) {
        obj.age = age;
    }
    // Since the instance variable name and the parameter name are same, we use this keyword to differentiate between them.
    // this keyword is used to refer to the current object.
    // so this is same as passing the obj reference and using obj.name = name.
    public void setAgeUsingThis(int age) {
        this.age = age;
    }
    
    public void setNameUsingThis(String name) {
        this.name = name;
    }
}

class GettersSetters {
    public static void main(String[] args) {
        Person p = new Person();
        p.setNameUsingThis("John");
        p.setAgeUsingThis(30);
        System.out.println("Name: " + p.getName() + " Age: " + p.getAge());
        // Name: John Age: 30

        p.setNameUsingObj("Doe", p);
        p.setAgeUsingObj(40, p);
        System.out.println("Name: " + p.getName() + " Age: " + p.getAge());
        // Name: Doe Age: 40
    }
}