package Impacta;

/**
 *
 * Classe responsável para capturar a senha digitada pela Débora.
 * Após isso, instanciar os objetos verificadores: caractere especial, letra minúscula, letra maiúcula e número;
 *
 * O método readPassword(String password) é responsável por fazer a leitura da senha e invocar os verificadores
 * instanciado.
 *
 * @Author Lucas Crayer
 */

public class PasswordReader {

    VerifySpecialChar vsc = new VerifySpecialChar();
    VerifyLowerCase vlc = new VerifyLowerCase();
    VerifyUpperCase vuc = new VerifyUpperCase();
    VerifyNumber vn = new VerifyNumber();

    //método que irá receber a senha da Débora, armazenar localmente
    public void readPassword(String password){

               if(password.length() < 6){
                   System.out.println("Sua senha precisa de mais " + (6-password.length()) + " para ser seguro");
                   vsc.isSpecialChar(password);
                   vuc.isUpperCase(password);
                   vlc.isLowerCase(password);
                   vn.isNumber(password);
               }
               else if (vsc.isSpecialChar(password) && vlc.isLowerCase(password) && vuc.isUpperCase(password) && vn.isNumber(password))
                   System.out.println("Senha registrada com sucesso");

    }
}


