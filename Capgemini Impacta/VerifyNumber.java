package Impacta;

/**
 *
 * Classe respons�vel por percorrer a senha de D�bora e informar se tem ou n�o algum digito na mesma.
 * Ultiza o m�todo isNumber, que recebe a senha da Classe PasswordReader e prcorre a mesma em busca de um n�mero
 * pelo m�todo Character.isDigit. Quando encontra um n�mero retorna true, sen�o informa a necessidade de um n�mero
 * na senha.
 *
 * @Author Lucas Crayer
 *
 */
public class VerifyNumber {

    //m�todo respons�vel por percorrer e encontrar um n�mero na senha;
    public boolean isNumber (String password){

        for (int i =0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i)))
                return true;
        }
        System.out.println("Sua senha precisa ter ao menos um n�mero.");
        return false;
    }
}
