package CuentaBancaria;

public class TestCuentaBancaria {
    public static void main(String[] args) {
        
        CuentaBancaria cuenta1 = new CuentaBancaria();
        System.out.println(cuenta1.getsaldoCuentaCorriente());

        CuentaBancaria cuenta2 = new CuentaBancaria();
        System.out.println(cuenta2.cantidadCuentasCreadas + "Número de cuentas");

        CuentaBancaria cuenta3 = new CuentaBancaria(230.2, 200.7);
        cuenta3.depositarDinero("ahorros", 120);
        System.out.println(cuenta3.getSaldoCuentaAhorros() + "cuenta 3");
        cuenta3.retirarDinero("corriente", 30);

        cuenta3.totalSaldo();
    }

    
}
