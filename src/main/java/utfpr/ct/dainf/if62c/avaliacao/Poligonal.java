/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.ct.dainf.if62c.avaliacao;

/**
 *
 * @author a1655647
 */
public class Poligonal {

    private Ponto2D vetor[];
    private int insercoes = 0;
    private int numeroVertices = 0;
    private String plano;

    public Poligonal(int numVertices) {
        if (numVertices <= 2) {
            throw new RuntimeException("Poligonal deve ter ao menos 2 vértices");
        }
        Ponto2D[] vetorVertcies = new Ponto2D[numVertices];
        numeroVertices = numVertices;
    }

    public int getN() {
        return numeroVertices;
    }

    public Ponto2D get(int indice) {
        if (indice < 0 || indice >= getN()) {
            return null;
        } else {
            return vetor[indice];
        }
    }

    public double getComprimento() {
        double comprimento = 0;
        for (int i = 0; i < numeroVertices - 1; i++) {
            comprimento += vetor[i].distancia(vetor[i + 1]);
        }
        return comprimento;
    }
}
