Scanner sc = new Scanner(System.in);
    TreeSet<details> Employee = new TreeSet<>();
    details E1 = new details(01,"Rahul",100, "CS");
    details E2 = new details(02, "Harish", 600, "CS");
    details E3 = new details(03, "Pranu", 450, "CS");
    details E4 = new details(04, "Vandit", 250, "CS");
    details E5 = new details(05, "Shekhar", 430, "CS");
    details E6 = new details(06, "Shashank", 800, "CS");
    details E7 = new details(07, "Sid", 400, "CS");
    Employee.add(E1);
    Employee.add(E2);
    Employee.add(E3);
    Employee.add(E4);
    Employee.add(E5);
    Employee.add(E6);
    Employee.add(E7);
        System.out.println("Enter the information you want to see: \n1. id\n 2. name\n 3. salary\n 4. department");
        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        for(details d:Employee) {
            if (num == 1){
                System.out.println(d.id);
            }
            else if (num == 2){
                System.out.println(d.name);
            }
            else if (num == 3){
                System.out.println(d.salary);
            }
            else if (num == 4){
                System.out.println(d.department);
            }
            else {
                System.exit(0);
            }
                System.out.println(d.id + " " + d.name + " " + d.salary + " " + d.department);
    }
}
}

class details implements Comparable<details>{
    int id;
    String name;
    int salary;
    String department;

    public details(int id, String name, int salary, String department){
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }
    @Override
    public int compareTo(details b) {
        if(id>b.id){
            return 1;
        }else if(id<b.id){
            return -1;
        }else{
            return 0;
        }
    }
}
