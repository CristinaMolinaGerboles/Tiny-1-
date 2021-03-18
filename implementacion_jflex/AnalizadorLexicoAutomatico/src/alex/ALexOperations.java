package alex;

public class ALexOperations {
  private AnalizadorLexicoTiny alex;
  public ALexOperations(AnalizadorLexicoTiny alex) {
   this.alex = alex;   
  }
  public UnidadLexica unidadEnt() {
     return new UnidadLexicaMultivaluada(alex.fila(), alex.columna(),ClaseLexica.ENT,alex.lexema()); 
  } 
  public UnidadLexica unidadReal() {
     return new UnidadLexicaMultivaluada(alex.fila(), alex.columna(),ClaseLexica.REAL,alex.lexema()); 
  } 
  public UnidadLexica unidadSuma() {
     return new UnidadLexicaUnivaluada(alex.fila(), alex.columna(),ClaseLexica.MAS); 
  } 
  public UnidadLexica unidadResta() {
     return new UnidadLexicaUnivaluada(alex.fila(), alex.columna(),ClaseLexica.MENOS); 
  } 
  public UnidadLexica unidadMul() {
     return new UnidadLexicaUnivaluada(alex.fila(), alex.columna(),ClaseLexica.POR); 
  } 
  public UnidadLexica unidadDiv() {
     return new UnidadLexicaUnivaluada(alex.fila(), alex.columna(),ClaseLexica.DIV); 
  } 
  public UnidadLexica unidadPAp() {
     return new UnidadLexicaUnivaluada(alex.fila(), alex.columna(),ClaseLexica.PAP); 
  } 
  public UnidadLexica unidadPCierre() {
     return new UnidadLexicaUnivaluada(alex.fila(), alex.columna(),ClaseLexica.PCIERRE); 
  } 
  public UnidadLexica unidadIgual() {
     return new UnidadLexicaUnivaluada(alex.fila(), alex.columna(),ClaseLexica.IGUAL); 
  } 
  public UnidadLexica unidadComa() {
     return new UnidadLexicaUnivaluada(alex.fila(), alex.columna(),ClaseLexica.COMA); 
  } 
  public UnidadLexica unidadEof() {
     return new UnidadLexicaUnivaluada(alex.fila(), alex.columna(),ClaseLexica.EOF); 
  }
  public UnidadLexica unidadExpBasica() {
	  return new UnidadLexicaUnivaluada(alex.fila(), alex.columna(),ClaseLexica.EXPRESIONBASICA);
  }
  public UnidadLexica unidadInt() {
	  return new UnidadLexicaUnivaluada(alex.fila(), alex.columna(),ClaseLexica.INT);
  }
  public UnidadLexica unidadreal() {
	  return new UnidadLexicaUnivaluada(alex.fila(), alex.columna(),ClaseLexica.REAL);
  }
  public UnidadLexica unidadString() {
	  return new UnidadLexicaUnivaluada(alex.fila(), alex.columna(),ClaseLexica.STRING);
  }
  public UnidadLexica unidadBool() {
	  return new UnidadLexicaUnivaluada(alex.fila(), alex.columna(),ClaseLexica.BOOL);
  }
  public UnidadLexica unidadAnd() {
	  return new UnidadLexicaUnivaluada(alex.fila(), alex.columna(),ClaseLexica.AND);
  }
  public UnidadLexica unidadOr() {
	  return new UnidadLexicaUnivaluada(alex.fila(), alex.columna(),ClaseLexica.OR);
  }
  public UnidadLexica unidadNot() {
	  return new UnidadLexicaUnivaluada(alex.fila(), alex.columna(),ClaseLexica.NOT);
  }
  public UnidadLexica unidadNull() {
	  return new UnidadLexicaUnivaluada(alex.fila(), alex.columna(),ClaseLexica.NULL);
  }
  public UnidadLexica unidadProc() {
	  return new UnidadLexicaUnivaluada(alex.fila(), alex.columna(),ClaseLexica.PROC);
  }
  public UnidadLexica unidadIf() {
	  return new UnidadLexicaUnivaluada(alex.fila(), alex.columna(),ClaseLexica.IF);
  }
  public UnidadLexica unidadThen() {
	  return new UnidadLexicaUnivaluada(alex.fila(), alex.columna(),ClaseLexica.THEN);
  }
  public UnidadLexica unidadElse() {
	  return new UnidadLexicaUnivaluada(alex.fila(), alex.columna(),ClaseLexica.ELSE);
  }
  public UnidadLexica unidadEndif() {
	  return new UnidadLexicaUnivaluada(alex.fila(), alex.columna(),ClaseLexica.ENDIF);
  }
  public UnidadLexica unidadWhile() {
	  return new UnidadLexicaUnivaluada(alex.fila(), alex.columna(),ClaseLexica.WHILE);
  }
  public UnidadLexica unidadDo() {
	  return new UnidadLexicaUnivaluada(alex.fila(), alex.columna(),ClaseLexica.DO);
  }
  public UnidadLexica unidadEndwhile() {
	  return new UnidadLexicaUnivaluada(alex.fila(), alex.columna(),ClaseLexica.ENDWHILE);
  }
  public UnidadLexica unidadCall() {
	  return new UnidadLexicaUnivaluada(alex.fila(), alex.columna(),ClaseLexica.CALL);
  }
  public UnidadLexica unidadRecord() {
	  return new UnidadLexicaUnivaluada(alex.fila(), alex.columna(),ClaseLexica.RECORD);
  }
  public UnidadLexica unidadArray() {
	  return new UnidadLexicaUnivaluada(alex.fila(), alex.columna(),ClaseLexica.ARRAY);
  }
  public UnidadLexica unidadOf() {
	  return new UnidadLexicaUnivaluada(alex.fila(), alex.columna(),ClaseLexica.OF);
  }
  public UnidadLexica unidadPointer() {
	  return new UnidadLexicaUnivaluada(alex.fila(), alex.columna(),ClaseLexica.POINTER);
  }
  public UnidadLexica unidadNew() {
	  return new UnidadLexicaUnivaluada(alex.fila(), alex.columna(),ClaseLexica.NEW);
  }
  public UnidadLexica unidadDelete() {
	  return new UnidadLexicaUnivaluada(alex.fila(), alex.columna(),ClaseLexica.DELETE);
  }
  public UnidadLexica unidadRead() {
	  return new UnidadLexicaUnivaluada(alex.fila(), alex.columna(),ClaseLexica.READ);
  }
  public UnidadLexica unidadWrite() {
	  return new UnidadLexicaUnivaluada(alex.fila(), alex.columna(),ClaseLexica.WRITE);
  }
  public UnidadLexica unidadNl() {
	  return new UnidadLexicaUnivaluada(alex.fila(), alex.columna(),ClaseLexica.NL);
  }
  public UnidadLexica unidadVar() {
	  return new UnidadLexicaUnivaluada(alex.fila(), alex.columna(),ClaseLexica.VAR);
  }
  public UnidadLexica unidadType() {
	  return new UnidadLexicaUnivaluada(alex.fila(), alex.columna(),ClaseLexica.TYPE);
  }
  public UnidadLexica unidadFalse() {
	  return new UnidadLexicaUnivaluada(alex.fila(), alex.columna(),ClaseLexica.FALSE);
  }
  public UnidadLexica unidadTrue() {
	  return new UnidadLexicaUnivaluada(alex.fila(), alex.columna(),ClaseLexica.TRUE);
  }
  public UnidadLexica unidadPunto() {
	  return new UnidadLexicaUnivaluada(alex.fila(), alex.columna(),ClaseLexica.PUNTO);
	}
  public void error() {
    System.err.println("***"+alex.fila()+" Caracter inexperado: "+alex.lexema());
  }
public UnidadLexica unidadPuntocoma() {
	return new UnidadLexicaUnivaluada(alex.fila(), alex.columna(),ClaseLexica.PUNTOCOMA);
}
public UnidadLexica unidadMenor() {
	return new UnidadLexicaUnivaluada(alex.fila(), alex.columna(),ClaseLexica.MENOR);
}
public UnidadLexica Mayor() {
	return new UnidadLexicaUnivaluada(alex.fila(), alex.columna(),ClaseLexica.MAYOR);
}
public UnidadLexica unidadListAp() {
	return new UnidadLexicaUnivaluada(alex.fila(), alex.columna(),ClaseLexica.LISTAP);
}
public UnidadLexica unidadListCie() {
	return new UnidadLexicaUnivaluada(alex.fila(), alex.columna(),ClaseLexica.LISTCIE);
}
public UnidadLexica unidadcorchAp() {
	return new UnidadLexicaUnivaluada(alex.fila(), alex.columna(),ClaseLexica.CORCHAP);
}
public UnidadLexica unidadCorchCie() {
	return new UnidadLexicaUnivaluada(alex.fila(), alex.columna(),ClaseLexica.CORCHCIE);
}
public UnidadLexica unidadMayorig() {
	return new UnidadLexicaUnivaluada(alex.fila(), alex.columna(),ClaseLexica.MAYORIG);
}
public UnidadLexica unidadIgig() {
	return new UnidadLexicaUnivaluada(alex.fila(), alex.columna(),ClaseLexica.IGIG);
}
public UnidadLexica unidadMenorig() {
	return new UnidadLexicaUnivaluada(alex.fila(), alex.columna(),ClaseLexica.MENORIG);
}
public UnidadLexica unidadPuntero() {
	return new UnidadLexicaUnivaluada(alex.fila(), alex.columna(),ClaseLexica.PUNTERO);
}
public UnidadLexica unidadDiferente() {
	// TODO Auto-generated method stub
	return new UnidadLexicaUnivaluada(alex.fila(), alex.columna(),ClaseLexica.DIFERENTE);
}
public UnidadLexica unidadSimband() {
	return new UnidadLexicaUnivaluada(alex.fila(), alex.columna(),ClaseLexica.SIMBAND);
}
public UnidadLexica unidadModulo() {
	return new UnidadLexicaUnivaluada(alex.fila(), alex.columna(),ClaseLexica.MODULO);
}
public UnidadLexica unidadLiteralcadena() {
	return new UnidadLexicaUnivaluada(alex.fila(), alex.columna(),ClaseLexica.LITERALCADENA);
}

}
