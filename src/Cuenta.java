import java.util.ArrayList;
import java.util.List;

public class Cuenta {
    private String numeroCuenta;
    private String tipoCuenta;
    private String dniCliente;
    private Double saldo;
    private static List<Cuenta> cuentasCorrientes = new ArrayList<>();
    private static List<Cuenta> cuentasAhorro = new ArrayList<>();

    public Cuenta() {

    }
    public Cuenta(String numeroCuenta, Double saldo, String dniCliente, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.dniCliente = dniCliente;
        this.tipoCuenta = tipoCuenta;

        if (tipoCuenta.equals("corriente")){
            cuentasCorrientes.add(this);
        }
        else{
            cuentasAhorro.add(this);
        }
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public String getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente() {
        this.dniCliente = dniCliente;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }


    public void ingresar (double cantidad){
        saldo = cantidad++;
    }

    public void retirar (double cantidad){
        if (cantidad <= saldo){
            saldo -= cantidad;
        }
        else{
            saldo = (double) 0;
        }
    }
    public void extraccionRapida (){
        double maximo = saldo * 0.2;


        retirar(maximo);
    }
    public double consultar(){
        return saldo;
    }

    public void consultarDatos(){
        System.out.println("Numero de cuenta: "+ numeroCuenta);
        System.out.println("Tipo de cuenta :"+ tipoCuenta);
        System.out.println("DNI Cliente :"+ dniCliente);
        System.out.println("El saldo es :"+ saldo);
    }


}



