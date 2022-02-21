package Impacta;

/**
 *
 * Classe responsável por percorrer a senha de Débora e informar se tem ou não algum digito na mesma.
 * Ultiza o método isNumber, que recebe a senha da Classe PasswordReader e prcorre a mesma em busca de um número
 * pelo método Character.isDigit. Quando encontra um número retorna true, senão informa a necessidade de um número
 * na senha.
 *
 * @Author Lucas Crayer
 *
 */
public class VerifyNumber {

    //método responsável por percorrer e encontrar um número na senha;
    public boolean isNumber (String password){

        for (int i =0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i)))
                return true;
        }
        System.out.println("Sua senha precisa ter ao menos um número.");
        return false;
    }
}
