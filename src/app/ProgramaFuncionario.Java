package app;

import entities.Funcionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Programa_Funcionario {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos funcionários serão registrados?");
        int n = sc.nextInt();
        List<Funcionario> list = new ArrayList<>();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println();
            System.out.println("Funcionário #" + (i + 1));
            int id;

            while (true) {
                System.out.println("ID:");
                id = sc.nextInt();
                sc.nextLine();
                int cod = id;
                boolean codigoRepetido = false;
                for (Funcionario func : list) {
                    if (func.getId() == cod) {
                        codigoRepetido = true;
                        break;
                    }
                }
                if (codigoRepetido) {
                    System.out.println("Esse ID já existe.Tente outro.");

                } else {
                    break;
                }
            }
            System.out.println("Nome:");
            String name = sc.nextLine();
            System.out.println("Salário:");
            double salario = sc.nextDouble();
            sc.nextLine();
            list.add(new Funcionario(id, name, salario));
        }
        int code;
        boolean encontrado = false;
        System.out.println();

        while (true) {
            System.out.println("Digite o id do funcionário que receberá o aumento.");
            code= sc.nextInt();
            sc.nextLine();
            for (Funcionario func : list) {
                if (func.getId() == code) {
                    encontrado = true;
                    break;
                }
            }
            if (encontrado==false) {
                System.out.println("Esse ID não existe. Tente outro");

            } else {
                break;
            }
        }

        System.out.println();
        System.out.println("De quanto será o aumento?");
        double porcent = sc.nextDouble();

        for (Funcionario func: list) {
            if (func.getId() == code) {
                    func.aumentoSalario(porcent);
                }
        }

        System.out.println();

        for (Funcionario x : list) {
            System.out.println(x);
        }
    }
}