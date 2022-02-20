package Impacta;

/**
 *
 * Classe respons�vel pela leitura e verifica��o dos caracteres especiais presentes na senha, pelo m�todo
 * isSpecialChar ultilizando o contains() da Classe String. Se algum dos simbolos que est�o pedidos
 * estiver na senha, retorna true. Se n�o, retorna a mensagem que informa a necessidade da inclus�o de
 * um caracter especial.
 *
 * @Author Lucas Crayer
 */
public class VerifySpecialChar {
    private String password; //Vari�vel local para armazenar a senha.

    //m�todo para verificar os caracteres especiais a partir do if().
    public boolean isSpecialChar (String password) {
        this.password = password;
        if (    this.password.contains("!") || this.password.contains("@") || this.password.contains("%") ||
                this.password.contains("$") || this.password.contains("#") || this.password.contains("^") ||
                this.password.contains("&") || this.password.contains("*") || this.password.contains("-") ||
                this.password.contains("+") || this.password.contains("(") || this.password.contains(")") ||
                this.password.contains(":") || this.password.contains("/") || this.password.contains("."))
            return true;
         else {
            System.out.println("Sua senha precisa ter ao menos um carater especial.");
             return false; }
    }
}
