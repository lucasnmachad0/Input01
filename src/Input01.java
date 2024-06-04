
import javax.swing.JOptionPane;

public class Input01 {
    public static void main(String[] args) {

       String[] acceptableValues = {"1", "2", "3", "4", "5"}; //lista valores aceitaveis
       String string= (String)JOptionPane.showInputDialog(null, //abre a caixa de dialogo
       "Titulo da caixa de dialogo",
       "selecione",
       1, //inicia na primeira opção
       null,
       acceptableValues,
       acceptableValues[1]);

        
    }
}
