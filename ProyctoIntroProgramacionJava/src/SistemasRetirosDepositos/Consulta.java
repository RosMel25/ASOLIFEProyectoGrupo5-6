package SistemasRetirosDepositos;

public class Consulta extends ClaseAbstractaCajero {
    
    @Override
    public void Transacciones(){
        System.out.println("------------------------------------");
        System.out.println("Tu saldo actual es: " + getSaldo());
        System.out.println("------------------------------------");
    }
    
}
