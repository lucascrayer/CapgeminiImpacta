package Impacta;

/**
 *
 * Classe responsável pela verificação se há uma letra minúscula na senha, atraves do método isLowerCase.
 * O método percorre um lanço for com o tamanho da String password, que é a senha da Débora. Enquanto percorre o if()
 * procura qualquer letra minúscula pelo método Character.isLowerCase, onde é enviado cada posição da String password,
 * verificando se tem ou não uma letra minúscula. Quando encontra, retorna true, senão, informa a necessidade de
 * uma letra minúscula;
 *
 * @Author Lucas Crayer
 *
 */

public class VerifyLowerCase {

    //método que percorre a senha em busca de letras minúscula
    public boolean  isLowerCase(String password) {

        for (int i = 0; i < password.length(); i++) {
            if (Character.isLowerCase(password.charAt(i)))
                return true;
        }
        System.out.println("Sua senha precisa ter ao menos uma letra minúscula");
        return false;
    }
}