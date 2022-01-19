package programmer_zaman_now.data;

public class Company {
    private String name;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public class Employee{
        private String name;

        public String getCompany(){
            return Company.this.getName();
        }

        public String getName() {
            return this.name;
        }

        public void setName(String name) {
            this.name = name;
        }

    }
}
