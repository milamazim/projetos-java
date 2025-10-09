package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Address;
import entities.Department;
import entities.Employee;

public class Program {

  public static void main(String[] args) {

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.print("Nome do departamento: ");
    String nomeDepartamento = sc.nextLine();
    System.out.print("Dia do pagamento: ");
    int diaPagamento = sc.nextInt();
    sc.nextLine();
    System.out.print("Email: ");
    String emailDepartamento = sc.nextLine();
    System.out.print("Telefone: ");
    String telefoneDepartamento = sc.nextLine();

    Address address = new Address(emailDepartamento, telefoneDepartamento);
    Department department = new Department(nomeDepartamento, diaPagamento, address);

    System.out.print("Quantos funcionários tem o departamento? ");
    int n = sc.nextInt();
    sc.nextLine();

    for (int i = 1; i <= n; i++) {
      System.out.println("Dados do funcionário " + i + ": ");
      System.out.print("Nome: ");
      String nomeFuncionario = sc.nextLine();
      System.out.print("Salário: ");
      double salarioFuncionario = sc.nextDouble();
      sc.nextLine();

      Employee employee = new Employee(nomeFuncionario, salarioFuncionario);
      department.addEmployee(employee);      
    }

    showReport(department);

    sc.close();
    
  }

  private static void showReport(Department department){
    System.out.println();
    System.out.println("FOLHA DE PAGAMENTO: ");
    System.out.println("Departamento " + department.getName() + " = R$ " + String.format("%.2f", department.payroll()));
    System.out.println("Pagamento realizado no dia " + department.getPayDay());
    System.out.println("Funcionários: ");
    
    for (Employee e : department.getEmployees()) {
      System.out.println(e.getName());
    }

    System.out.println("Para dúvidas favor entrar em contato: " + department.getAddress().getEmail());

  }

}
