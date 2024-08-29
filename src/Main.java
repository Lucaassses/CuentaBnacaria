//Lucas Rodriguez España

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ingresar = new Scanner(System.in);
        Cuenta cu = new Cuenta();
        cu.getDniCliente();
        cu.getNumeroCuenta();
        cu.getSaldo();
        cu.getTipoCuenta();
        cu.setTipoCuenta(cu.getTipoCuenta());



        ingresar = new Scanner(System.in);
        System.out.println("Ingrese el DNI del cliente: ");

        String dni = ingresar.nextLine() ;
        System.out.println("Ingrese el saldo inicial: ");

        Double saldo = ingresar.nextDouble();
        System.out.println("Ingrese el numero de cuenta: ");

        String numeroCuenta = ingresar.nextLine();
        System.out.println("Ingrese el tipo de cuenta Ahorros/Corriente: ");

        String tipoCuenta = ingresar.next();

        cu.consultarDatos();

    }


}