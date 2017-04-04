package nett.formacion.aaa.module4.calculadora.ws;

import nett.formacion.aaa.module4.calculadora.ws.Calculadora;

import nett.formacion.aaa.module4.calculadora.types.Operador;
import nett.formacion.aaa.module4.calculadora.types.Resultado;
import nett.formacion.aaa.module4.calculadora.types.Termino;
import nett.formacion.aaa.module4.calculadora.types.TerminoParte;

public class CalculadoraImpl implements Calculadora {

  @Override
  public Resultado calcular(final Termino termino) {

	Resultado resultado = new Resultado();
	resultado.setValor(0d);
    
    // first term part has ADD operator per definition
    termino.getParteList().get(0).setOperador(Operador.SUMA);
 
    for (TerminoParte parte : termino.getParteList()) {
      switch (parte.getOperador()) {
        case RESTA:
          resultado.setValor(resultado.getValor() - parte.getValor());
          break;
        case MULTIPLICACION:
        	resultado.setValor(resultado.getValor() * parte.getValor());
          break;
        case DIVISION:
        	resultado.setValor(resultado.getValor() / parte.getValor());
          break;
        default:
        	resultado.setValor(resultado.getValor() + parte.getValor());
      }
    }

    return resultado;

  }
}
