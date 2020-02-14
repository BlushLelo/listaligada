public interface OperacoesLista {

    void adiciona(ListaLigada listaLigada, Object elemento);

    void adiciona(ListaLigada listaLigada, int posicao, Object elemento);

    Celula pega(ListaLigada listaLigada, int posicao);

    void remove(ListaLigada listaLigada, int posicao);

    int tamanho(ListaLigada listaLigada);

    boolean contem(ListaLigada listaLigada, Object elemento);

    void adicionaNoComeco(ListaLigada listaLigada, Object elemento);

    void removeDoComeco(ListaLigada listaLigada);

    void removeDoFim(ListaLigada listaLigada);
}
