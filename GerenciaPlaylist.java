import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;
import java.util.Collections;
import static javax.swing.JOptionPane.showMessageDialog;
import static javax.swing.JOptionPane.showInputDialog;
import static java.lang.Integer.parseInt;

public class GerenciaPlaylist {
    public static void main(String[] args) {
        //generics
        //List <Musica> musicas = new LinkedList <>();  //operador diamante se a Lista é de <Musica>, então a LinkedList também é, possbilitando escrever apenas <>
        var musicas = new ArrayList<Musica>();
        String menu = "1-Adicioar\n2-Ver música\n3-Avaliar música\n4-Excluir música\n0-Sair";
        // musicas.add(new Musica());
        // Collections.sort(musicas);
        int op;
        do{
            op = parseInt(showInputDialog(menu));
            switch(op){
                case 1:{
                    //1 . Pegar os dados da música
                    var titulo = showInputDialog("Titulo?");
                    //2. Construir um objeto Musica
                    var musica = new Musica(titulo);
                    //3. Adicionar na coleção com add
                    musicas.add(musica);
                    //4. Avisar o usuário que deu certo
                    showMessageDialog(null, "Boa mlk adicionou");
                    break;
                }

            }
        } while (op != 0);
    }
}
