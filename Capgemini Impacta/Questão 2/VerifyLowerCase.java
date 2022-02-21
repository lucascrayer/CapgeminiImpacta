package Impacta;

/**
 *
 * Classe respons�vel pela verifica��o se h� uma letra min�scula na senha, atraves do m�todo isLowerCase.
 * O m�todo percorre um lan�o for com o tamanho da String password, que � a senha da D�bora. Enquanto percorre o if()
 * procura qualquer letra min�scula pelo m�todo Character.isLowerCase, onde � enviado cada posi��o da String password,
 * verificando se tem ou n�o uma letra min�scula. Quando encontra, retorna true, sen�o, informa a necessidade de
 * uma letra min�scula;
 *
 * @Author Lucas Crayer
 *
 */

public class VerifyLowerCase {

    //m�todo que percorre a senha em busca de letras min�scula
    public boolean  isLowerCase(String password) {

        for (int i = 0; i < password.length(); i++) {
            if (Character.isLowerCase(password.charAt(i)))
                return true;
        }
        System.out.println("Sua senha precisa ter ao menos uma letra min�scula");
        return false;
    }
}