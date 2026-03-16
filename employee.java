import java.util.Scanner;

class employee {

    int empno;
    String ename;
    float basic, hra, da;
    float netpay;

    float Calculate() {
        return basic + hra + da;
    }

    void havedata() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee Number: ");
        empno = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        ename = sc.nextLine();

        System.out.print("Enter Basic Salary: ");
        basic = sc.nextFloat();

        System.out.print("Enter HRA: ");
        hra = sc.nextFloat();

        System.out.print("Enter DA: ");
        da = sc.nextFloat();

        netpay = Calculate();
    }

    void dispdata() {
        System.out.println("Employee Number: " + empno);
        System.out.println("Employee Name: " + ename);
        System.out.println("Basic Salary: " + basic);
        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);
        System.out.println("Net Pay: " + netpay);
    }

    public static void main(String[] args) {
        employee e = new employee();
        e.havedata();
        e.dispdata();
    }
}