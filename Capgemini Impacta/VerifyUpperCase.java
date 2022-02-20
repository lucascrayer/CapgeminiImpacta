package Impacta;

/**
 *
 * Classe respons�vel pela verifica��o se h� uma letra mai�scula na senha, atraves do m�todo isUpperCase.
 * O m�todo percorre um lan�o for com o tamanho da String password, que � a senha da D�bora. Enquanto percorre o if()
 * procura qualquer letra mai�scula pelo m�todo Character.isUpperCase, onde � enviado cada posi��o da String password,
 * verificando se tem ou n�o letra mai�scula. Se encontrar retorna true, sen�o informa a necessidade de uma letra
 * mai�scula.
 *
 * @Author Lucas Crayer
 *
 */

public class VerifyUpperCase {


    //m�todo que percorre a senha em busca de letras mai�scula
    public boolean  isUpperCase(String password) {

        for (int i = 0; i < password.length(); i++) {
                if (Character.isUpperCase(password.charAt(i)))
                    return true;
        }
        System.out.println("Sua senha precisa ter ao menos uma letra mai�scula");
        return false;
    }
}