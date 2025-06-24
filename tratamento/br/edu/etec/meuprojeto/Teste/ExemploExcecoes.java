package br.edu.etec.meuprojeto.Teste;

/**
 *
 * @author Lucas
 */
public class ExemploExcecoes {
    public void lancaExcecao(int x, int y) throws DivisaoPorUmException{
        if(y == 1) {
            throw new DivisaoPorUmException("Divisao Por Um");
        }else{
        }
    }
    
}