public class TesteEmployee {
    public static void main(String[] args) {

        // Criando objetos de cada tipo
        Employee emp1 = new SalariedEmployee(
                "Mário", "Barbosa", "111.111.111-11", 810.00);

        Employee emp2 = new HourlyEmployee(
                "Kayron", "Belarmino", "111.111.111-11", 65.00, 35);

        Employee emp3 = new CommissionEmployee(
                "Lauro", "Luiz", "111.111.111-11", 12000.00, 0.06);

        Employee emp4 = new BasePlusCommissionEmployee(
                "Letícia", "Carvalho", "111.111.111-11",
                5000.00, 0.04, 1200.00);


        // Array de Employee (POLIMORFISMO)
        Employee[] employees = {emp1, emp2, emp3, emp4};


        // Exibindo dados
        System.out.println("Sistema de Pagamento:\n");

        for (Employee employee : employees) {
            System.out.println(employee.toString());
            System.out.println("Ganho semanal: " + employee.earnings());
            System.out.println("-----------------------------");
        }
    }
}
