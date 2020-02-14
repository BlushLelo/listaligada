import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
public class ListaLigada {

    private OperacoesLista op;
    private Celula primeira;
    private Celula ultima;
    private int totalDeElementos;

    public ListaLigada(OperacoesLista op, int totalDeElementos) {
        this.op = op;
        this.totalDeElementos = totalDeElementos;
    }
}
