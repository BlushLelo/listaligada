package gateway;

import Domain.Celula;
import Domain.ListaLigada;

public class OperacoesListaImpl implements OperacoesLista {
    @Override
    public void adiciona(ListaLigada listaLigada, Object elemento) {

    }

    @Override
    public void adiciona(ListaLigada listaLigada, int posicao, Object elemento) {

    }

    @Override
    public Celula pega(ListaLigada listaLigada, int posicao) {
        Celula atual = listaLigada.getPrimeira();
        return iterateObject(posicao, atual);
    }

    private Celula iterateObject(int posicao, Celula atual) {
        for (int i = 0; i < posicao; i++) {
            atual = atual.getProxima();
        }
        return atual;
    }

    @Override
    public void remove(ListaLigada listaLigada, int posicao) {

    }

    @Override
    public int tamanho(ListaLigada listaLigada) {
        return 0;
    }

    @Override
    public boolean contem(ListaLigada listaLigada, Object elemento) {
        return false;
    }

    @Override
    public void adicionaNoComeco(ListaLigada listaLigada, Object elemento) {
        Celula nova = new Celula(listaLigada.getPrimeira(), elemento);
        listaLigada.setPrimeira(nova);
        if (listaLigada.getTotalDeElementos() == 0) {
            listaLigada.setUltima(listaLigada.getPrimeira());
        }
        int totalDeElementos = listaLigada.getTotalDeElementos();
        listaLigada.setTotalDeElementos(totalDeElementos + 1);
    }

    @Override
    public void removeDoComeco(ListaLigada listaLigada) {

    }

    @Override
    public void removeDoFim(ListaLigada listaLigada) {

    }
}
