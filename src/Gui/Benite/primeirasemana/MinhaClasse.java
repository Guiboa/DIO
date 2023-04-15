package Gui.Benite.primeirasemana;
public class MinhaClasse {   

public static void main(String[] args) {

    String primeiroNome = "Guilherme";
    String segundoNome = "Benite";
    
    String nomeCompleto = nomeCompleto (primeiroNome, segundoNome);

    System.out.println(nomeCompleto);

}

public static String nomeCompleto (String primeiroNome, String segundoNome) { 
    return "o resultado é " + primeiroNome.concat(" ").concat(segundoNome);
}

}