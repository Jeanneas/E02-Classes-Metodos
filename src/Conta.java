public class Conta {

    int numerodaconta;
    String titular;
    double saldoatual;
    double limite;

        public static void imprimir(string[]args){
            Conta numerodaconta= new Conta();

            numerodaconta.titular='Jeanne';
            numerodaconta.numerodaconta='00101-1';
            numerodaconta.saldoatual='1.000,00';
            numerodaconta.limite='3.000,00';

            System.out.println(numerodaconta.titular);
            System.out.println(numerodaconta.numerodaconta);
            System.out.println(numerodaconta.saldoatual);
            System.out.println(numerodaconta.limite);
        }
        
    }
