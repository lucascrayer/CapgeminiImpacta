package Impacta;

/**
 *
 * Classe responsável pela leitura e verificação dos caracteres especiais presentes na senha, pelo método
 * isSpecialChar ultilizando o contains() da Classe String. Se algum dos simbolos que estão pedidos
 * estiver na senha, retorna true. Se não, retorna a mensagem que informa a necessidade da inclusão de
 * um caracter especial.
 *
 * @Author Lucas Crayer
 */
public class VerifySpecialChar {
    private String password; //Variável local para armazenar a senha.

    //método para verificar os caracteres especiais a partir do if().
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
