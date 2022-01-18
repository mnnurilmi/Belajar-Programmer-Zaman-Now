class PolimorphismApp {
    public static void main(String[]args) {
        Employee employee = new Employee("Eko");
        employee.sayHallo("Budi");

        employee = new Manajer("Eko");
        employee.sayHallo("Budi");

        employee = new VicePresident("Eko");
        employee.sayHallo("Budi");

        sayHallo(new Employee("bambang"));
        sayHallo(new Manajer("joko"));
        sayHallo(new VicePresident("budi"));
    }

    static void sayHallo(Employee employee){
        if(employee instanceof VicePresident){
            VicePresident vp = (VicePresident) employee;
            System.out.println("Hello vp "+ vp.name);
        }else if(employee instanceof Manajer){
            Manajer manajer = (Manajer) employee;
            System.out.println("Hello manajer "+ manajer.name); 
        }else{
            System.out.println("Hello "+ employee.name);
        }

    }

}
