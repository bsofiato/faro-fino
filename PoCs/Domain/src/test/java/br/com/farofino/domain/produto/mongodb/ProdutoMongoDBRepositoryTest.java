package br.com.farofino.domain.produto.mongodb;

import br.com.farofino.domain.categoria.Categoria;
import br.com.farofino.domain.categoria.TipoCaracteristica;
import br.com.farofino.domain.produto.Produto;
import br.com.farofino.domain.produto.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

@ContextConfiguration("produto-mongodb-repository-test.xml")
public class ProdutoMongoDBRepositoryTest extends AbstractTestNGSpringContextTests {

//  @Autowired
//  private MongoOperations mongoTemplate;
  
  @Autowired
  private ProdutoRepository produtoRepository;
  
  @Test
  public void testX() {

    TipoCaracteristica <String> c1 = new TipoCaracteristica<String>();
    c1.setNome("isbn");
    TipoCaracteristica <String> c2 = new TipoCaracteristica<String>();
    c2.setNome("hahahaha");
    
    Produto produto = new Produto();
    //produto.setID("123456789");
    produto.setNome("Teste");
    produto.setDescricao("HAHAHA");
    produto.getCaracteristicas().put(c2, "ABC :P");
    produto.setCategoria(new Categoria());
    produto.getCategoria().setID("123474326534");
    
    System.out.println(produtoRepository.save(produto).getID());
//    produtoRepository.findProduto(produto.getCategoria(), produto.getCaracteristicas());
    
  }
}
