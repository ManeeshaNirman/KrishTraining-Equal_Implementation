public class Application {

    public static void main(String[] args) {

        Employee employee1=new Employee(001,125585,"Maneesha Nirman","983260071V","ANP649");

        Employee employee2=new Employee(002,125586,"Nisitha Nilupul","200022526223","ANP655");

        Employee employee3=new Employee(001,125585,"Maneesha Nirman","983260071V","ANP649");

        System.out.println(employee1.equals(employee2));

        System.out.println("Employee 1 : "+employee1);
        System.out.println("Employee 2 :"+employee2);
        System.out.println("Employee 3 :"+employee3);

        System.out.println(employee1.equals(employee3));

        employee2.setEmpId(001);
        employee2.setEmpCode(125585);

        System.out.println(employee1.equals(employee2));

        System.out.println("Employee 1 : "+employee1);
        System.out.println("Employee 2 :"+employee2);
        System.out.println("Employee 3 :"+employee3);
    }

}
