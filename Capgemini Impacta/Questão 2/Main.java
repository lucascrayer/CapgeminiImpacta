package Impacta;
import PasswordReadere;

import java.util.Scanner;
//inicia a main
public class Main {
    public static void main (String[] args){
        //instância a Classe que verifica a senha e o leitor do teclado (Scanner);
        PasswordReader r = new PasswordReader();
        Scanner sc = new Scanner(System.in);

        String password; //inicia a String que armazena a senha.

        //imprime informações sobre como gerar a senha e pegunta a senha para o usuário
        System.out.println("Informe sua senha, para senha forte a mesma deve " +
                           "possuir no mínimo 6 caracteres.\n" +
                           "Contém no mínimo 1 letra em minúsculo.\n" +
                           "Contém no mínimo 1 letra em maiúsculo.\n" +
                           "Contém no mínimo 1 caractere especial.\n" +
                           "Os caracteres especiais são: :/!@#$%^&*()-+\n" +
                           "Digite sua senha: ");
        password = sc.next(); //abre leitura da senha digitada no teclado pelo Scanner.
        sc.close(); //fecha a leitura do teclado.

        //Passa a senha para a Classe PasswordReader que irá ler e trazer informações sobre a senha.
        r.readPassword(password);
    }
}
