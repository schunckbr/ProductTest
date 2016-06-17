package br.com.coursera.produto.testes;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ 
	TesteProduto.class, 
	TesteProdutoComTamanho.class,
	TesteCarrinhoDeCompras.class
})
public class RodaTodosOsTestes {

}
