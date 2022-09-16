public class Cliente{

        String nome;
        String cpf;
        String endereco;
        int idade;
        char sexo;

    public static void main (String [] args){

    Cliente novocliente = new Cliente();
    novocliente.nome = 'Jeanne';
    novocliente.cpf='01010101010';
    novocliente.endereco = 'rua j, numero 01, bairro 1, cidade 0';
    novocliente.idade = '42';
    novocliente.sexo = 'F';


        System.out.println(novocliente.nome);
        System.out.println(novocliente.cpf);
        System.out.println(novocliente.endereco);
        System.out.println(novocliente.idade);
        System.out.println(novocliente.sexo);

    }
}

