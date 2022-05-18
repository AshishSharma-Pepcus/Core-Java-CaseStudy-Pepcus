package CaseStudy1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CompanyBase {
    public List<Employee> employee = new ArrayList<>();

    Scanner sc = new Scanner(System.in);

    public void setEmployee() {
        System.out.println("Enter fName: ");
        String fName = sc.next();

        System.out.println("Enter lName: ");
        String lName = sc.next();
        System.out.println("Enter ID: ");
        int id = sc.nextInt();
        Employee emp = new Employee(fName, lName, id);
        employee.add(emp);
    }

    public void removeEmployee(){
        System.out.println("Enter id of Employee that you want to remove");
        int id_r = sc.nextInt();

        for(int i=0;i<employee.size();i++){
            int id = employee.get(i).getId();
            if(id_r==id){

                employee.remove(i);
                System.out.println("Employee with id:"+id_r+" has been removed successfully");
                return;
            }
        }
    }

    public void find(){
        System.out.println("Enter the fName of Employee");
        String fName_input = sc.next();
        int index = 0;
        while (index<employee.size()){
            String fName = employee.get(index).getFirstName();
            if(fName.equalsIgnoreCase(fName_input)){
                System.out.println("Printing employee details...");
                System.out.println("First Name: "+employee.get(index).getFirstName());
                System.out.println("Last Name: "+employee.get(index).getLastName());
                System.out.println("Employee id: "+employee.get(index).getId());
            }
            index++;
        }
    }
}
