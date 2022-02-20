package Impacta;

/**
 *
 * Classe respons�vel para capturar a senha digitada pela D�bora.
 * Ap�s isso, instanciar os objetos verificadores: caractere especial, letra min�scula, letra mai�cula e n�mero;
 *
 * O m�todo readPassword(String password) � respons�vel por fazer a leitura da senha e invocar os verificadores
 * instanciado.
 *
 * @Author Lucas Crayer
 */

public class PasswordReader {

    VerifySpecialChar vsc = new VerifySpecialChar();
    VerifyLowerCase vlc = new VerifyLowerCase();
    VerifyUpperCase vuc = new VerifyUpperCase();
    VerifyNumber vn = new VerifyNumber();

    //m�todo que ir� receber a senha da D�bora, armazenar localmente
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


