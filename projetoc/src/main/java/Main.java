package java;

public class Main {
    public static void main(String[] args) {
        ListaLigada listaLigada = new ListaLigada(new OperacoesListaImpl(), 0);
        Aluno elemento = new Aluno("Joao", "Octávio");
        listaLigada.getOp().adicionaNoComeco(listaLigada, elemento);
        Celula pega = listaLigada.getOp().pega(listaLigada, 0);
        System.out.println(pega.getElemento());
    }
}
