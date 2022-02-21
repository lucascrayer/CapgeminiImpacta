package Impacta;

/**
 *
 * Classe responsável pela verificação se há uma letra maiúscula na senha, atraves do método isUpperCase.
 * O método percorre um lanço for com o tamanho da String password, que é a senha da Débora. Enquanto percorre o if()
 * procura qualquer letra maiúscula pelo método Character.isUpperCase, onde é enviado cada posição da String password,
 * verificando se tem ou não letra maiúscula. Se encontrar retorna true, senão informa a necessidade de uma letra
 * maiúscula.
 *
 * @Author Lucas Crayer
 *
 */

public class VerifyUpperCase {


    //método que percorre a senha em busca de letras maiúscula
    public boolean  isUpperCase(String password) {

        for (int i = 0; i < password.length(); i++) {
                if (Character.isUpperCase(password.charAt(i)))
                    return true;
        }
        System.out.println("Sua senha precisa ter ao menos uma letra maiúscula");
        return false;
    }
}