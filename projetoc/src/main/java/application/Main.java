package application;

import Domain.Aluno;
import Domain.Celula;
import Domain.ListaLigada;
import gateway.OperacoesListaImpl;

public class Main {
  public static void main(String[] args) {
    ListaLigada listaLigada = new ListaLigada(new OperacoesListaImpl(), 0);
    Aluno elemento = new Aluno("Joao", "Octávio");
    listaLigada.getOp().adicionaNoComeco(listaLigada, elemento);
    Celula pega = listaLigada.getOp().pega(listaLigada, 0);
    System.out.println(pega.getElemento());

    ListaLigada listaLigada2 = new ListaLigada(new OperacoesListaImpl(), 0);
    listaLigada2.getOp().adicionaNoComeco(listaLigada, "Gabriel Talles");
    pega = listaLigada2.getOp().pega(listaLigada, 0);
    System.out.println(pega.getElemento());
  }
}
