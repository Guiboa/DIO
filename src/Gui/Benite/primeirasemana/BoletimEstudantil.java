package Gui.Benite.primeirasemana;
public class BoletimEstudantil {
    public static void main(String[] args) {
        int mediaFinal = 6;
        if (mediaFinal < 6)
            System.out.println("reprovado");
        else if (mediaFinal == 6)
            System.out.println("prova final");
        else 
            System.out.println("aprovado");

    }
}
