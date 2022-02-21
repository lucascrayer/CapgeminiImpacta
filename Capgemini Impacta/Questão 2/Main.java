package Impacta;
import PasswordReadere;

import java.util.Scanner;
//inicia a main
public class Main {
    public static void main (String[] args){
        //inst�ncia a Classe que verifica a senha e o leitor do teclado (Scanner);
        PasswordReader r = new PasswordReader();
        Scanner sc = new Scanner(System.in);

        String password; //inicia a String que armazena a senha.

        //imprime informa��es sobre como gerar a senha e pegunta a senha para o usu�rio
        System.out.println("Informe sua senha, para senha forte a mesma deve " +
                           "possuir no m�nimo 6 caracteres.\n" +
                           "Cont�m no m�nimo 1 letra em min�sculo.\n" +
                           "Cont�m no m�nimo 1 letra em mai�sculo.\n" +
                           "Cont�m no m�nimo 1 caractere especial.\n" +
                           "Os caracteres especiais s�o: :/!@#$%^&*()-+\n" +
                           "Digite sua senha: ");
        password = sc.next(); //abre leitura da senha digitada no teclado pelo Scanner.
        sc.close(); //fecha a leitura do teclado.

        //Passa a senha para a Classe PasswordReader que ir� ler e trazer informa��es sobre a senha.
        r.readPassword(password);
    }
}
